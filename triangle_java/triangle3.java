public class triangle1{

    public static double a, b ,c; public static boolean E;

    public static boolean COTE (double a, double b, double c){
	return (Math.abs(b-c)<a) && (a<(b+c));
    }
    triangle1(double a, double b, double c, boolean E){
	this.a = a; this.b = b ; this.c = c; this.E = COTE(a,b,c)&&COTE(b,c,a)&&COTE(c,a,b);
    }

    public static double sqr(double x){ return(x*x);}



    /*  public static double (xA , yA,xB,yB, xC, yC){
       	xC = xA*Math.cos(theta)-yA*Math.sin(theta)
	yC = xA*Math.sin(theta)+yA*Math.cos(theta); 
	System.out.println(xB+" "+yB+" "+xA+" "+yA+" "+xC+" "+yC+" "+Math.sqrt(sqr(xB)+sqr(yB))+" "+Math.sqrt(sqr(xA)+sqr(yA))+" "+Math.sqrt(sqr(xC)+sqr(yC)));
    */


     public static void main (String[] args){


	     /* triangle1 T = new Triangle (4.,4.,4.,E);
	   if(T,E)(System.out.println("existe");)
	   else
	   (System.out.println("non");)
	*/


	/*triangle1[] S = new triangle1[6];

	int i; double theta = Math.acos(-1.0); double xA,yA,xB,yB,xC,yC;


	for(i=0;i<S.length;i++){
	    xA= 1.0; yA =0.0;
	    xB=0.0; yB=0.0;
	    xC=0.0; yC=0.0;

	    xA=xC; yA=yC
	    
        S[i].a = 1.0;
        S[i].b = 1.0;
	S[i].c = 1.0;
	


	     System.out.println(i+ " "+S[i].a+" "+ S[i].b+" "+S[i].c);
	*/

	int i;
	double xA, yA,xB,yB,xC,yC;
	xB=0.0;yB=0.0;
	xA=1.0; yA=0;
	xC=0.0; yC=0.0;

        double xa2, ya2, xb2, yb2, xc2, yc2;
	double R;
        R=Math.sqrt(3)/2*Math.sqrt(sqr(xA)+sqr(yA));
	yb2=yB+2*R;
       	ya2=yA+2*R;
        yc2=yC+2*R;

         xb2=xB;
	 xa2=xA;
         xc2=xC;

	double theta;
	theta = (1.0/3.0)*3.14;
	for (i=0;i<=6;i++){


	    xC=xA*Math.cos(theta)-yA*Math.sin(theta);
	    yC=xA*Math.sin(theta)+yA*Math.cos(theta);

   System.out.println(xB+" "+yB+" "+xA+" "+yA+" "+xC+" "+yC);
xA=xC; yA=yC;
	}
	for (i=7;i<=14;i++){

	    xc2=xa2*Math.cos(theta)-ya2*Math.sin(theta);
	    yc2=xa2*Math.sin(theta)+ya2*Math.sin(theta);


	     System.out.println(xb2+" "+yb2+" "+xa2+" "+ya2+" "+xc2+" "+yc2);

	     
	     xa2=xc2; ya2=yc2;


	}
	}
}
