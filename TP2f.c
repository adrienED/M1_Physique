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
  
  return(0.5*simpson(f,0.0, L, Nsimp) ); // varier le nombre de points intermédiaires (ici Nsimp)
}

double omega(int n){
  return(sqrt(sqr(v*n*PI/L)+g2));
}


main() {
  int N, n, k;
  double t, x;
  //Nsimp = entier impaire
  scanf("%d" ,&Nsimp);
  //pos_moy, sigma
  scanf("%lf %lf", &pos_moy, &sigma); //fraction de L!!
  pos_moy = pos_moy * L; sigma *L;

  //L,T,v,g2;
  scanf("%lf %lf %lf %lf", &L, &T, &v, &g2);

  //N
  scanf("%d" , &N);//

  double somme;

  //test 0 : la condition intiale

  /* for(n=0;n<=N;n++){
     x=n*(L/N);
     printf("%g\t%g\n",x,initialecondition(x));
}
  */

//test 1 : la condition initiale par la somme
  for(n=0;n<=N;n++){
    x = n*(L/N);
    somme = 0.0;
    for(n=0;n<=N;n++){
      somme = somme+ 2.0*overlap(n)*eigenfunction(n,x);

  }

 printf("%g\t%g\n",x,somme);
  

  for(k=0;k<=N;k=k+4){//boucle sur le temps
    t = k*(T/N);
    for(n=0;n<=N;n++){
      x=n*(L/N);
    somme = 0.0;
    for (n=0;n<=N; n++){
      somme = somme +2.0*overlap(n)*cos(omega(n)*t)*eigenfunction(n,x);
}
    printf("%g\t%g\t%g\n",t,x,somme);

    }
  }

}
}