public class rotat {


    public static double sqr(double x){
	return((x)*(x));
    }

    public static void rot(double[] r ,double[] v, double[] rv, double theta){

	outils.crossprod(r,v,rxv); // calcul du produit vectoriel r x v
	double rva, rvb,rvc;
       

	rva = (1.-Math.cos(theta))*outils.scalarprod(r,v,3)*r[0];
        rvb = Math.cos(theta)*v[0];
        rvc = Math.sin(theta)*rxv[0];

        rv[0] = rva + rvb + rvc;


        rva = (1.-Math.cos(theta))*outils.scalarprod(r,v,3)*r[1];
        rvb = Math.cos(theta)*v[1];
        rvc = Math.sin(theta)*rxv[1];

        rv[1] = rva + rvb + rvc;



        rva = (1.-Math.cos(theta))*outils.scalarprod(r,v,3)*r[2];
        rvb = Math.cos(theta)*v[2];
        rvc = Math.sin(theta)*rxv[2];
        rv[2] = rva + rvb + rvc;
	
    }








	       

   