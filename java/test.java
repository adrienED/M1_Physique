public class test{

    public static double sqr(double x){
	return (x*x);
    }
    public static double L;

    public static void main(String[] args){

	//	double a = Double.parseDouble(args[0]);

	//	System.out.println(a+" "+outils.sqr(a));

	//	System.out.println(a+" "+outils.sqrtinv(a));

	/*	   L=4.0;
			   outils.L = L;
			   System.out.println(L);
	*/


	//		   System.out.println(outils.ev(6));

	/*
	double[] C = new double[3];
	C[0]=Double.parseDouble(args[1]);
	C[1]=Double.parseDouble(args[2]);
	C[2]=Double.parseDouble(args[3]);
	int n = Integer.parseInt(args[4]);
	
	System.out.println(espace.lincomb(C,a,1));
	*/

	double [] a = new double [3];
	double [] b = new double [3];
	double [] c = new double [3];

	//introduire les composantes des vecteur a et b en ligne de commande

	a[0] = Double.parseDouble(args[0]);
	a[1] = Double.parseDouble(args[1]);
	a[2] = Double.parseDouble(args[2]);

	b[0] = Double.parseDouble(args[3]);
	b[1] = Double.parseDouble(args[4]);
	b[2] = Double.parseDouble(args[5]);

	System.out.println(scalarprod(a,b,3));
			  
        System.out.println(outils.crossprod(a,b,c));

			   


}
}