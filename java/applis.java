//voir testapp
public class applis{
    
    public static void main(String[] args){


	double[] r = new double[3];
	double[] v = new double[3];
	double[] rv = new double[3];
	double[] a = new double[3];
    double theta;

    //composant de la direction
	r[0]=Double.parseDouble(args[0]);
	r[1]=Double.parseDouble(args[1]);
	r[2]=Double.parseDouble(args[2]);
	//composant du vecteur a tourner
	v[0]=Double.parseDouble(args[3]);
	v[1]=Double.parseDouble(args[4]);
	v[2]=Double.parseDouble(args[5]);

	theta=Double.parseDouble(args[6]);

	transfo.Rot(r,v,rv,theta);

	    System.out.println(rv[0]+" "+rv[2]);


	 transfo.Par(r,v,rv);
	    
 System.out.println(rv[0]+" "+rv[1]+" "+rv[2]);

 a[0]=1.0; a[1]=0.0;a[2]=0.0;
transfo.Trans(a,v,rv);
System.out.println(rv[0]+" "+rv[1]+" "+rv[2]);



}
}