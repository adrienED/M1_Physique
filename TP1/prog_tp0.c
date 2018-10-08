

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <complex.h>

#define sqr(x) (x)*(x)
#define sigma 0.1
#define PI acos(-1.0)
#define lambdaplus 5.0 


double L, thetan, D = 0.01; double c1 = 1.0, c2 = 1.0;

void source(double b[], int N){
  
  int n,m1;
  for(n=1;n<N;n++){
    m1=1-2*(n%2);
    thetan = atan(L/(n*lambdaplus*PI));
    b[n]=-c1*(sqrt(2.*L*sqr(L))/(n*PI))*( sin(thetan)*m1+((1-m1)/(n*PI))*cos(thetan) );
  }
}


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
   thetan = atan(lambdaplus/(n*PI));
   return(sqrt(2.0/L)*cos(thetan + (n*PI*x/L)));
  

  //return(sqrt(2.0/L)*sin(n*PI*x/L)); // eigenfunctions for Dirichlet boundary conditions

}

double initialcondition(double x){// condition initiale
  //  return(exp(-sqr(x-0.5*L)/(2.0*sqr(sigma)))/sqrt(2.0*PI*sqr(sigma))); //une gaussienne
  return(1.0); // une constante
  //  return(eigenfunction(1,x)); //testing an  eigenfunction as initial condition
}







main(){
    double somme;
    int n, i, j;
    int N;

    double x,t;
    
    scanf("%lf", &L);
    scanf("%d", &N);

    double a[N+2],b[N+2];

    double s[N+2], f[N+2];
    //  simpson(s,N); // set the coefficients of the numerical integration for Simpson's rule
    trapezes(s,N); // set the coefficients of the numerical integration for trapezes
    
        //some tests

    /*    for(i=0;i<(N+2);i++){
      x = i*(L/(N+1));
      printf("%g\t%g\n",x,eigenfunction(1,x));
    }
    */
    
    //computing the coefficients of the initial condition
    for(n=1;n<(N+2);n++){
      for(i=0;i<(N+2);i++){
	x = i*(L/(N+1));
	f[i] = initialcondition(x)*eigenfunction(n,x);
      }
      a[n]=integrate(f,s,0.0,L,N);
      //      printf("%d\t%g\n",n,a[n]);
      
    }
    //check the reconstruction of the initial condition
    /* for(i=0;i<(N+2);i++){
	x = i*(L/(N+1));
	//	x = 0.5*L*(1+cos((2*i+1)*PI/(2*(N+1)))); //Chebyshev points
      somme = 0.0;
      for(n=1;n<N;n++){
	somme = somme + a[n]*eigenfunction(n,x);
      }
      //    printf("%g\t%g\n",x,somme);
    }
    */
    

    //Time evolution-toy model

    source(b,N);
    
           for(j=10*N;j<100*N;j=j+10*N){
	     t = j*(sqr(L)/(N+1));
	     for(i=0;i<(N+2);i++){
	       x = i*(L/(N+1));
	       somme = 0.0;
	       for(n=1;n<N;n++){
		 somme = somme + (b[n]*t+a[n])*exp(-D*eigenvalue(n)*t)*eigenfunction(n,x);
	       }
	       printf("%g\t%g\t%g\n",t,x,exp(-lambdaplus*x)*(somme+x+1));
	     }

    }
      
    
}
