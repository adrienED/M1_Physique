public class Applis{

   public static void main(String[] args){

	double[] r = new double[3];
	double[] v = new double[3];
	double[] rv = new double[3];

	double[] a = new double[3];

	double[] rvp = new double[3];
	double theta;

	/*	r[0] = Double.parseDouble(args[0]);
	r[1] = Double.parseDouble(args[1]);
	r[2] = Double.parseDouble(args[2]);

	v[0] = Double.parseDouble(args[3]);
	v[1] = Double.parseDouble(args[4]);
	v[2] = Double.parseDouble(args[5]);

	theta = Double.parseDouble(args[6]); theta = Math.PI*theta/180.;
	*/

	// Rotation du vecteur D'A' = (1,1) autour du vecteur AB=(-1/sqrt(2),1/sqrt(2)) avec a = (1,0,0) d'un angle de -90 degrés

	r[0] = -1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = 1.0; 
	v[1] = 1.0;
	v[2] = 0.0;
	theta = -90.0; theta = Math.PI*theta/180.;

	Transfos.Rot(r,v,rv,theta); 
	//	System.out.println(rv[0]+" "+rv[1]+" "+rv[2]);


	a[0] = 1.0; a[1] = 0.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

	//Rotation du vecteur AA" = (1,-1) autour du vecteur AB=(1/sqrt(2),1/sqrt(2)) avec a = (1,0,0) d'un angle de  degrés

	r[0] = 1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = 1.0; 
	v[1] = -1.0;
	v[2] = 0.0;

	theta = -90.0; theta = Math.PI*theta/180.;

	a[0] = 1.0; a[1] = 0.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	//	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

	//Rotation du vectur C'B' = (1,1) autour de AB=(1/sqrt(2),1/sqrt(2)) avec a = (0,1,0) et angle theta = degrés

	r[0] = 1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = 1.0; 
	v[1] = 1.0;
	v[2] = 0.0;

	theta = 90.0; theta = Math.PI*theta/180.;

	a[0] = 0.0; a[1] = 1.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


	//Rotation du vecteur C"D"=(1,-1) autour du vecteur DA=(1/sqrt(2),1/sqrt(2)) avec a = (0,-1,0) et angle theta degrés

	r[0] = 1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = 1.0; 
	v[1] = -1.0;
	v[2] = 0.0;

	theta = 90.0; theta = Math.PI*theta/180.;

	a[0] = 0.0; a[1] = -1.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	//	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


	//Rotation du vecteur A'''D'''=(-1,-1) autour du vecteur DC=(-1/sqrt(2),1/sqrt(2)) avec a = (0,-1,0)

	r[0] = -1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = -1.0; 
	v[1] = -1.0;
	v[2] = 0.0;

	theta = 90.0; theta = Math.PI*theta/180.;

	a[0] = 0.0; a[1] = -1.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

	//Rotation du vecteur CC'''=(-1,-1) autour du vecteur DC = (-1/sqrt(2),1/sqrt(2)) avec a = (-1,0,0)

	r[0] = -1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = -1.0; 
	v[1] = -1.0;
	v[2] = 0.0;

	theta = 90.0; theta = Math.PI*theta/180.;

	a[0] = -1.0; a[1] = 0.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	//	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


	//Rotation du vecteur CC^(4)=(-1,1) autour du vecteur CB = (1/sqrt(2),1/sqrt(2)) avec a = (-1,0,0)

	r[0] = 1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = -1.0; 
	v[1] = 1.0;
	v[2] = 0.0;

	theta = -90.0; theta = Math.PI*theta/180.;

	a[0] = -1.0; a[1] = 0.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


	//Rotation du vecteur BB^(4) = (-1,1) autour du vecteur CB = (1/sqrt(2),1/sqrt(2)) avec a = (0,1,0)

	r[0] = 1./Math.sqrt(2.0); 
	r[1] = 1./Math.sqrt(2.);
	r[2] = 0.0;

	v[0] = -1.0; 
	v[1] = 1.0;
	v[2] = 0.0;

	theta = -90.0; theta = Math.PI*theta/180.;

	a[0] = 0.0; a[1] = 1.0; a[2] = 0.0;

	Transfos.Trans(a,rv,rvp);
	//	System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);




   }
}
