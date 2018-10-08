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
	


	triangle1[] S = new triangle1[4];

	int i; double theta = Math.PI; double x,y;
	for(i=0;i<S.length;i++){
	    S[i].a = 1.0; S[i]. b =1.0; S[i].c=1.0;
	    System.out.println(i+ " "+S[i].a+" "+ S[i].b+" "+S[i].c);
	}
*/
	int i,k,l; 
	//	int N = Integer.parseInt(args[0]); 
	double r[][]= new double[6][3]; //0<->x, 1<->y, 2<->z
	r[0][0] = 1.0; r[0][1]=0.0; r[0][2]=0.0; // le premier sommet
		i=0;
		//	double theta =2.0*Math.PI/N;

	//	System.out.println(theta*360;/(2.0*Math.PI));

	double R[][][] = new double[3][3][3];

	//R[0] rotation autour de x; R[1] rotation autour de y; R[2] rotation autour de l'axe z
	R[2][0][0] = Math.cos(theta); R[2][0][1] = -Math.sin(theta); R[2][0][2]=0.0;
      	R[2][1][0] = Math.sin(theta); R[2][1][1] =  Math.cos(theta); R[2][1][2]=0.0;
	R[2][2][0] = 0.0; R[2][2][1] = 0.0; R[2][2][2]=1.0;


	double n[]= new double[3];
	double v[]= new double[3];
	

	//on veut réaliser une rotation d'un angle gamma autour du vecteur n

	double omega = Double.parseDouble(args[0]);
	n[0]= Math.cos(omega); n[1] = Math.sin(omega); n[2]=0.0;
	
	


	//Rotations successives du vecteur r[0][] autour de z
	/*	for(i=1;i<=N;i++){
	    for(k=0;k<3;k++){
		r[i][k]=0.0;
		for(l=0;l<3;l++){
		    r[i][k] = r[i][k] + R[2][k][l]*r[i-1][l];
		}
	    }
	    System.out.println(r[i][0]+" "+r[i][1]+" "+r[i][2]);
	}
		System.out.println(r[0][0]+" "+r[0][1]+" "+r[0][2]);




	/* le polygone noir
	double tau[] = new double[3];
	tau[0] = 2.0*Math.cos(theta/2.0)*Math.cos(theta/2.0);
	tau[1] = 2.0*Math.sin(theta/2.0)*Math.sin(theta/2.0);
	tau[2]= 0.0;
	for(i=0;i<N;i++){
	    for(k=0;k<3;k++){
		r[i][k] =r[i][k]+tau[k];
	    }
      	System.out.println(r[0][0]+" "+r[0][1]+" "+r[0][2]);
    }
	*/

    }
}