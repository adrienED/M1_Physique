public class triangle1{

    public static double a, b ,c; public static boolean E;

    public static boolean COTE (double a, double b, double c){
	return (Math.abs(b-c)<a) && (a<(b+c));
    }
    triangle1(double a, double b, double c, boolean E){
	this.a = a; this.b = b ; this.c = c; this.E = COTE(a,b,c)&&COTE(b,c,a)&&COTE(c,a,b);
    }

    public static void main (String[] args){


	/* triangle1 T = new Triangle (4.,4.,4.,E);
	   if(T,E)(System.out.println("existe");)
	   else
	   (System.out.println("non");)
	*/


	triangle1[] S = new triangle1[4];

	int i;
	for(i=0;i<S.length;i++){
	    S[i].a = 1.0; S[i]. b =1.0; S[i].c=1.0;
	    System.out.println(i+ " "+S[i].a+" "+ S[i].b+" "+S[i].c);
	}
    }
}