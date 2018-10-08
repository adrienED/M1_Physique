#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define sqr(x) ((x)*(x))
#define PI acos(-1.0L)

double v,L,T,g2,pos_moy,sigma,sigma;
int Nsimp;


double omega(int n){
  return(sqrt(sqr(v*n*PI/L)+g2));
}


double simpson( double (*f)(double), double A, double B, int N){
//MÃ©thode de Simpson pour l'intÃ©gration numÃ©rique 
    double h=(B-A)/( (double)N +1.0);
    double temp=h*(f(A)+f(B))/3.0;
    int j;
    double x;
    for(j=1;j<N;j=j+2){
	x=A+j*h;
	temp=temp + (4.0*h*f(x)/3.0);}

    for(j=2;j<N;j=j+2){
	x=A+j*h;
	temp=temp + (2.0*h*f(x)/3.0);} 
	return(temp);
}

double eigenfunction(int n, double x){                   // fonctions propres indexÃ©es par n
    return(sqrt(2.0/L)*sin((double)(n*PI*x/L)));
}


double initialcondition(double x){   
                 // condition initiale
   return(exp(-(sqr(x-pos_moy))/(2.0*sqr(sigma)))/sqrt(2.0*PI*sqr(sigma)));
   // return (eigenfunction(2,x));
 
}
double overlap(int n){/* calcule les coefficients du dÃ©veloppement 
				   en fonctions propres de la solution */


  double f(double x){
    return(initialcondition(x)*eigenfunction(n,x));}
  
  return(simpson(f,0.0, L, Nsimp) ); // varier le nombre de points intermédiaires (ici Nsimp)
}



main() {
  FILE * incon = fopen ("paquet_ondes.out", "w");
  L=1.0, v=1.0; 
  scanf("%lf %lf", &pos_moy, &sigma); // position largeur gaussienne
  pos_moy = pos_moy*L;
  sigma = sigma*L;

  int N,Nmax;
 // scanf("%d", &Nmax);

  scanf("%d",&N);
  scanf("%d", &Nsimp); 
  scanf("%lf", &g2);


  double t;
  //scanf("%lf, &t");
  int j;
  int  m,n; double x;

  double somme,err;

  //tester la condtion initiale
  
  //  int M= 4;
  // for(m=0;m<=N;m++){
  // t=m*((2.*PI/omega(1))/N);
  for(t=0.0; t<0.2;t=t+0.01){
    
  for(n=1;n<=N;n++){
   
    x = n*L/N;
    somme=0.0;
    for(j=1;j<=N;j++){
      somme =somme + overlap(j)*cos(omega(n)*t)*eigenfunction(j,x);
    }
    fprintf(incon,"%g\t%g\t%g\n",t,x,somme);
  
    // printf("%d\t%g\n",n,overlap(n)*cos(omega(n)*t));
  }

  }

fclose(incon);
    
}

