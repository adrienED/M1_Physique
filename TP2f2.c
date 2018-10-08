#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define sqr(x) ((x)*(x))
#define PI acos(-1.0L)

double v,L,T,g2,pos_moy,sigma,sigma;
int Nsimp;

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

double eigenfunction(int n, double x){// fonctions propres indexÃ©es par n
    return(sqrt(2.0/L)*sin((double)(n*PI*x/L)));}


double initialcondition(double x){// condition initiale
  return(exp(-(sqr(x-pos_moy))/(2.0*sqr(sigma)))/sqrt(2.0*PI*sqr(sigma)));

 
}
double overlap(int n){/* calcule les coefficients du dÃ©veloppement 
				   en fonctions propres de la solution */


  double f(double x){
    return(initialcondition(x)*eigenfunction(n,x));}
  
  return(simpson(f,0.0, L, Nsimp) ); // varier le nombre de points intermédiaires (ici Nsimp)
}

double omega(int n){
  return(sqrt(sqr(v*n*PI/L)+g2));
}


main() {
   File *incom=fopen("initcond_somme.out", "w");
  L=1.0; 
  scanf("%lf %lf", &pos_moy, &sigma);
  pos_moy = pos_moy*L;
  sigma = sigma*L;

  int N,Nmax;
  scanf("%d", &Nmax);
  scanf("%d", &Nsimp); 



  int  j,n; double x;
  double somme,err;

  for(N=0;n<=256;N=2*N);
  //err=0.0;

 for(j=0;j<=N;j++){
x=j*L/n;
printf%g\t\
//printf("g\t%g\n",x,initialcondition(x));
  pfintf(
 somme = 0.0;
 for(N=1;N<=n;N++){
   somme = somme + overlap(n)*cos-omega(n)*t)*eigenfunction(n,x);
 }
  // err = err +sqr(somme-initialcondition(x));
 // fprintf(incom, "%g\t%g\t%g\n",x,somme,initialcondition(x);
  //}

  //fprintf(incom,"%d\t%g\n", N,sqrt(err/n));

    fclose(incom);
    

}
