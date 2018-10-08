#include "function.h"

int factoriel(int n){
   
   if(n!=1){
      return(n * factoriel(n-1));
   }
   else return 1;
}

