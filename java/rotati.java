public class rotatio {


    /*  public static double a, b ,c; public static boolean E;

    public static boolean COTE (double a, double b, double c){
	return (Math.abs(b-c)<a) && (a<(b+c));
    }
    rotation(double a, double b, double c, boolean E){
	this.a = a; this.b = b ; this.c = c; this.E = COTE(a,b,c)&&COTE(b,c,a)&&COTE(c,a,b);
    }
    */

    /*
    public static double scalprod(....) {
	int i ; double somme =0.0;
	for(i=0;i<3;i++){
	    somme = somme + u[i]*v[i];
	}
	return(somme);
    }
    
    public static void crossprod(...) {


    }

    public static double volume(...){
	

    }
    */

    public static double sqr(double x){
	return((x)*(x));
    }

    public static void main (String[] args){



	double[] r = new double[3];
	double[] v = new double[3];
	double[] rv = new double[3];
	double theta, alpha, beta;

	/*	v[0] = Double.parseDouble(args[0]);
	v[1] = Double.parseDouble(args[1]);
	v[2] = Double.parseDouble(args[2]);
	alpha = Double.parseDouble(args[3]);  alpha = Math.PI*alpha/180.;
	beta = Double.parseDouble(args[4]);   beta = Math.PI*beta/180.;
	theta = Double.parseDouble(args[5]); theta =Math.PI*theta/180.;
	*/

	//rotation du point E' autour de AB 
	//Coordonnées du point E' par rapport ai point A
	//v[0] = Math.cos(Math.PI/10.);
	//v[1] = Math.sin(Math.PI/10.);
	//v[2] = 0.0; 
	//v[0] = Math.cos(Math.PI/10.);
	//v[1] =-Math.sin(Math.PI/10.);
	//v[2] = 0.0;
	v[0]=Math.cos(3*Math.PI/10.);
	v[1]=-Math.sin(3*Math.PI/10);
	v[2]=0
	

	/*	r[0] = Math.cos(alpha)*Math.sin(beta);
	r[1] = Math.sin(alpha)*Math.sin(beta);
	r[2] = Math.cos(beta);
	*/


	//coordonnées du point B par rapport au point A
	//r[0]=-Math.cos(3*Math.PI/10.);
	//r[1]=Math.sin(3*Math.PI/10);
	//r[2]=0.0;
	//r[0]=Math.cos(3*Math.PI/10.);
	//r[1]=Math.sin(3*Math.PI/10);
	//r[2]=0.0;
	r[0]=0.0;
	r[1]=0.0;
	r[2]=1.0;
       




	int n;
	for(n=0;n<=90;n++){
	    theta = 6


	//rotation du vecteur (v[0], v[1], v[2], autour de r[0] r[1] r{2]
	double scalprod;
	double[] crossprod = new double[3];

	int i, j, k;
	scalprod =0.0;
	for(i=0;i<3;i++){
	    scalprod = scalprod + v[i]*r[i];
	}

	//	System.out.println(scalprod);
	

	crossprod[0] = r[1]*v[2]-r[2]*v[1];
	crossprod[1] = r[2]*v[0]-r[0]*v[2];
	crossprod[2] = r[0]*v[1]-r[1]*v[0];


  //	System.out.println(crossprod[0]+" " +crossprod[1]+" "+crossprod[2]);

	double rva, rvb,rvc;
       

	rva = (1.-Math.cos(theta))*scalprod*r[0];
        rvb = Math.cos(theta)*v[0];
        rvc = Math.sin(theta)*crossprod[0];

        rv[0] = rva + rvb + rvc;


        rva = (1.-Math.cos(theta))*scalprod*r[1];
        rvb = Math.cos(theta)*v[1];
        rvc = Math.sin(theta)*crossprod[1];

        rv[1] = rva + rvb + rvc;



        rva = (1.-Math.cos(theta))*scalprod*r[2];
        rvb = Math.cos(theta)*v[2];
        rvc = Math.sin(theta)*crossprod[2];

        rv[2] = rva + rvb + rvc;

	//translation du vecteur, après rotation
	//	rv[0] = rv[0] + Math.cos(2.0*Math.PI/5.);
	//	rv[1] =rv[1] + Math.sin(2.0*Math.PI/5.);



	//test coplanaire
	
	

	
	System.out.println(rv[0]+" "+rv[1]+" "+rv[2]+" "+(sqr(rv[0])+(sqr(rv[1]))+(sqr(rv[2])))+" "+(theta*360/2*Math.PI));

	
	//-----------------------------------------------------









			   }
	}
    }















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
	/*	int i,k,l; 
	int N = Integer.parseInt(args[0]); 

	double r[][]= new double[6][3]; //0<->x, 1<->y, 2<->z
	r[0][0] = 1.0; r[0][1]=0.0; r[0][2]=0.0; // le premier sommet
	i=0;
	double theta =2.0*Math.PI/N;

	//	System.out.println(theta*360;/(2.0*Math.PI));

	double R[][][] = new double[3][3][3];

	//R[0] rotation autour de x; R[1] rotation autour de y; R[2] rotation autour de l'axe z


	R[2][0][0] = Math.cos(theta); R[2][0][1] = -Math.sin(theta); R[2][0][2]=0.0;
      	R[2][1][0] = Math.sin(theta); R[2][1][1] =  Math.cos(theta); R[2][1][2]=0.0;
	R[2][2][0] = 0.0; R[2][2][1] = 0.0; R[2][2][2]=1.0;

	//Rotations successives du vecteur r[0][] autour de z
	for(i=1;i<=N;i++){
	    for(k=0;k<3;k++){
		r[i][k]=0.0;
		for(l=0;l<3;l++){
		    r[i][k] = r[i][k] + R[2][k][l]*r[i-1][l];
		}
	    }
	    System.out.println(r[i][0]+" "+r[i][1]+" "+r[i][2]);
	}
      	System.out.println(r[0][0]+" "+r[0][1]+" "+r[0][2]);




	// le polygone noir
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
    }
	*/



	       

   