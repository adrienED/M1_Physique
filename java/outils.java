public class outils  {



    public static double Scalarprod(double [] a,double [] b, int N){

	double somme = 0.0; int n;
	for(n=0;n<N;n++){
	    somme = somme + a[n]*b[n];
	}
	return(somme);
    }

    public static void Crossprod (double[] a, double[] b, double[] c){
        c[0] = a[1]*b[2]-a[2]*b[1];
	c[1] = a[2]*b[0]-a[0]*b[2];
	c[2] = a[0]*b[1]-a[1]*b[0];


    }



public static double sqr (double x) {
      return (x*x);
}

    private static double invsqrt(double x){
	return (1.0/Math.sqrt(x));
    }
    public static double sqrtinv(double x){
	return(invsqrt(x));
    }
    private static double L=1.5;
    public static double ev(int n){
	return(sqr(n/L));
    }

}