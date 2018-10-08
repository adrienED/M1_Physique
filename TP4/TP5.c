

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <complex.h>

#define sqr(x) (x)*(x)
#define sigma 0.1
#define PI acos(-1.0)


double L=1.0;



void simpson(double s[], int N){//set the coefficients of the numerical integration procedure for Simpson's rule: N=odd
  int i;
  s[0] = 1./3.;
  for(i=1;i<=N;i=i+2){
    s[i]=4./3.;
  }
  for(i=2;i<N;i=i+2){
    s[i]=2./3.;
  }
  s[N+1]=1./3.;
}

void trapezes(double s[], int N){// set the coefficients of the numerical integration procedure for the trapezoidal rule; N can be even or odd
  int i;
  s[0]=0.5;
  for(i=1;i<(N+1);i++){
    s[i]=1.0;
  }
  s[N+1]=0.5;
}

double integrate(double f[], double s[], double A, double B, int N){//numerical integration: 
  int i; double somme=s[0]*f[0];

  for(i=1;i<=N;i++){
    somme = somme + s[i]*f[i];
  }
  somme = somme + s[N+1]*f[N+1];
  return( ((B-A)/(N+1))*somme);
}


double eigenvalue(int n){// Valeurs propres de la seconde dérivée spatiale
    return(sqr(n*PI/L));}


double eigenfunction(int n, double x){// fonctions propres de la seconde dérivée spatiale avec conditions Robin
  // return(sqrt(2.0/L)*cos(thetan + (n*PI*x/L)));
  

  return(sqrt(2.0/L)*sin(n*PI*x/L)); // eigenfunctions for Dirichlet boundary conditions

}

double initialcondition(double x){// condition initiale
    return(exp(-sqr(x-0.5*L)/(2.0*sqr(sigma)))/sqrt(2.0*PI*sqr(sigma))); //une gaussienne
    //  return(1.0); // une constante
  //  return(eigenfunction(1,x)); //testing an  eigenfunction as initial condition
}


main(){
  // FILE* SG=fopen("sGint.out", "w");
  double somme,somme1;
    int n, i, j;
    int N;


    double x,t;
    
    double a_temp, c_temp;
    double v2 = 1.0, g2;
    
    scanf("%lf" , &g2);
    scanf("%d", &N);

    double a[N+2],b[N+2],c[n+2];

    double s[N+2], f[N+2];

    //simpson(s,N); // set the coefficients of the numerical integration for Simpson's rule
     trapezes(s,N); // set the coefficients of the numerical integration for trapezes
    



     //t = 0.0


    //computing the coefficients of the initial condition : c[n]
    for(n=1;n<(N+2);n++){
      for(i=0;i<(N+2);i++){
	x = i*(L/(N+1));
	f[i] = initialcondition(x)*eigenfunction(n,x);
      }
      c[n]=integrate(f,s,0.0,L,N);

      
    }


    //the coefficients of the initial velocity
    for(n=1;n<(N+2);n++){
      a[n]= 0.0;
    }

    //the coefficients of the interaction term
    for(n=1;n<(N+2);n++){
      for(i=0;i<(N+2);i++){
	x = i*(L/(N+1));
	f[i] = sin(initialcondition(x))*eigenfunction(n,x);
      }
      b[n]=integrate(f,s,0.0,L,N);
      t=0.0;
      
    }
    /*
    for(i=0;i<=(N+2);i++){
      x=i*L/(N+1);
      somme = 0.0; somme1 =0.0;
      for(n=1;n<N;n++){
	somme = somme + c[n]*eigenfunction(n,x);
	somme1 = somme1 + b[n]*eigenfunction(n,x);
      }
      printf("%g\t%g\t%g\n",x,somme,somme1);
}
*/
    //Time evolution

    int M; double Dt;
    double  phi[N+2], xphi[N+2], x2phi[N+2];
    double a_temps; double c_temps;
    scanf("%d %lf", &M, &Dt);
    
    for(j=1;j<=M;j++){
      t = j*Dt;
      
      //update c[n] and a[n]

      for (n=1;n<N;n++){
	c_temps = c[n] + Dt*a[n];
	a_temps = a[n] + Dt*(-v2*eigenvalue(n)*c[n] - g2*b[n]);
	c[n] = c_temps; a[n] = a_temps; 
      }

      // Update the field
      for(i=1;i<(N+1);i++){
	x = i*L/(n+1);
	somme = 0.0;
	for(n=1;n<N;n++){
	  somme = somme + c[n]*eigenfunction(n,x);
	}
	phi[i] = somme; xphi[i] = i*somme; x2phi[i] = sqr(x-0.5)*somme; 
      }

      //output the current field configuration

      if((j%1000)==0){
	//printf("%g\t%g\n",t,integrate(xphi,s,0.0,L,N)*(L/(N+1))/integrate(phi,s,0.0,L,N));
	printf("%g\t%g\n",t,integrate(x2phi,s,0.0,L,N)*(L/(N+1))/integrate(phi,s,0.0,L,N));
	//ou printf("%g\t%g\n",t,integrate(x2phi,s,0.0,L,N)/integrate(phi,s,0.0,L,N));
      }


	/* for(i=0;i<(N+2);i++){
	x=i*(L/(N+1));
	printf("%g\t%g\t%g\n",t,x,phi[i]);
      }
	*/
	

	  //update b[n]
      /*  for(n=1;n<N;n++){
	for(i=0;i<(N+2);i++){
	  x = i*(L/(N+1));
	  f[i]=sin(phi[i]*eigenfunction(n,x));

	}
	  b[n] = integrate(f,s,0.0,L,N);
	}

      */

	//teste b[n] update
      /*	for(i=0;i<(N+2);i++){
	  x = i*(L/(N+1));
	  somme1 = 0.0;
	  for(n=1;n<N;n++){
	    somme1 = somme1 + b[n]*eigenfunction(n,x);
	  }
	
	  fprintf(SG,"%g\t%g\t%g\n",t,x,somme1);
	}
      */
    }
    //	fclose(SG);
}
    



