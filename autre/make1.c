#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define sqr(x) ((x)*(x))

main(){
  FILE *sortie=fopen("res3.5.out", "w");
  double x,y;
  int K;
  x=0.5;
  for(K=1;K<=16;K++){
    y=3.5*x*(1.-x);
    fprintf(sortie,"%d\t%g\n",K,y);
    x=y;

	   }

  fclose(sortie);
  }
