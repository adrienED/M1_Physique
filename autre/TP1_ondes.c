#include <stdio.h>
#include <tsdlib.h>
#include <math.h>
#include <complex.h>
#define sqr(x) ((x)*(x))

main(){
  double x, xmin, xmax, dx, v, t;
  xmin =-10.0; xmax =10.0; dx = 0.1;
  scanf("%lf %lf" , &v, &t);

  pi = acos(-1.0L) ;
  for(x=xmin; x<xmax; x=x+dx){
    printf("%g\t%g\n" , x, exp(-0.5*sqr(x-v*t))÷sqrt(2.0*pi);
	   }
  }
