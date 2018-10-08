#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define sqr(x) ((x)*(x))
#define PI acos(-1.0L)

double v,L,T,g2,pos_moy,sigma;
int N;



 double integral(double f[], double s[], double a, double b, int Nsimp){
   double somme = s[0]*f[0];
   int n;
   for(n=1;n<(N+3);n++){
     somme = somme + s[n]*f[n];
   }
   return(somme*(b-a)/(N+1)); 
 }



double eigenfunction(int n, double x){                   // fonctions propres indexÃ©es par n
    return(sqrt(2.0/L)*sin((double)(n*PI*x/L)));
}


double initialcondition(double x){     // condition initiale
  return(eigenfunction(1,x));

  //  return(exp(-(sqr(x-pos_moy))/(2.0*sqr(sigma)))/sqrt(2.0*PI*sqr(sigma)));


}


main() {
  //  FILE * incon = fopen ("sineGordon.out", "w");
  scanf("%lf %d", &L, &N);
  double s[N+2], phi[N+2]; 
  double a[N+2], b[N+2], c[N+2];


  int n,j;
  double x,t,somme;


  // les coeff de simpsons......


  s[0] = 1./3.; s[N+1]=1./3.;

  for(n=1;n<(N+1);n=n+2){
    s[n]= 4./3.;
  }

  for(n=2;n<N;n=n+2){
    s[n]=2./3.;
  }
  //......

  scanf("%d, &n");

  for (j=0;j<(N+2);j++){
    x= j*(L/(N+1));

  //les coefficients de la condition initiale phi(x,0)
 
  for(n=0;n<(N+2);n++){
     for(j=0;j<(N+2);j++){
       x=j*(L/(N+1));
     phi[j] = initialcondition(x)*eigenfunction(n,x);

     }
       c[n] = integral(phi,s,0.0,L,N);
       printf("%d\t%g\n",n,c[n]);
  }

  // les coeffs de la condition initale pour la partie non lineaire sin(phi(x,0)
  
  for(n=0;n<(N+2);n++){
      for(j=0;j<(N+2);j++){
	x= j*(L/(N+1));
	phi[j]= sin(initialcondition(x))*eigenfunction(n,x);
      }
      b[n] = integral(phi,s,0.0,L,N);
    }

  // les coeffs de la condition initiale dphi/dt(x,0)

	for(n=0;n<(N+2);n++){
	  a[n] = 0.0;
	}
      


 //afficher la condtion initiale calculer par le developpememnt
	/*
	for(j=0;j<(N+2);j++){
	  x = j*(L/(N+1));
	  somme =0.0;
	  for(n=1;n<(N+2);n++){
	    somme = somme +c[n]*eigenfunction(n,x);
	  }
	  printf("%g\t%g\n",x,somme);
	}
	*/


//.........................





  //test de l'intégrale sur la condition initiale
      /*
  for(n=0;n<(N+2);n++){
    x=n*(L/(N+1));
	 phi[n]=initialcondition(x);

	 }

  printf("%g\n",integral(phi,s,0.0,L,N));
  
	     //   fclose(incon);
    
	     */	     
	 
}
