#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define sqr(x) ((x)*(x))
#define PI acos(-1.0L)

double v,L,T,g2,pos_moy,sigma
  double c[0],f[0];
int N;



 double integral(double f[], double s[], double a, double b, int Nsimp){
   double somme = c[0]*f[0];
   int n;
   for(n=1;n<(N+3);n++){
     somme = somme + c[n]*f[n];
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
  scan("%lf %d", &L, &N);
  double s[N], phi[N+2]; 
  int n;
  double x,t;


  // les coeff de simpsons


  s[0] = 1./3.; s[N+1]=1./3.;

  for(n=1;n<(N+1);n=n+2){
    s[n]= 4./3.;
  }

  for(n=2;n<N;n=n+2){
    s[n]=2./3.;
  }
  //......

  //test de l'intégrale sur la condition initiale
      
  for(n=0;n<(N+2);n++){
    x=n*(L/(N+1));
	 phi[n]=initialcondition(x);

	 }

  printf("%g\n",integral(phi,s,0.0,L,N));
  
	     //   fclose(incon);
    
	     
	 
	     }
