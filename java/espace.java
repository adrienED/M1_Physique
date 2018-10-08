public class espace extends outils{

    public static double[] A = new double[3];

    public static double lincomb (double[] B, double x, int n){
	return (B[0]*sqr(x)+B[1]*sqrtinv(x)+B[2]*ev(n));
	    }
}