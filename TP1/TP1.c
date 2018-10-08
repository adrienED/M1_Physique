#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define sqr(x) ((x)*(x))

double tau(double t){
  return(t+sqrt(t)); //transformation non inertielle

}
main(){
  double x, xmin, xmax, dx, v, t;
  xmin = -10.0; xmax = 10.0; dx = 0.1;
  scanf("%lf %lf", &v, &t);

  double pi = acos(-1.0L);
  double f,g;

  for(x=xmin; x< xmax; x=x+dx){
    f = exp(-0.5*sqr(x-v*tau(t)))/sqrt(2.0*pi);
    g = exp(-0.5*sqr(x-v*tau(t)))/sqrt(2.0*pi);
				  printf("%g\t%g\t%g\n", x,f,g );
	   }
  }
