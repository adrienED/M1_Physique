public class testapp2{
    
    public static void main(String[] args){

	double[] r = new double[3];
	double[] v = new double[3];
	double[] rv = new double[3];

    double theta;
    double[] a = new double[3];
    double[] rvp = new double[3];

    //1

    //composant de la direction
    r[0]=-1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;

	//composant du vecteur a tourner
	v[0]=1.0;
	v[1]=1.0;
	v[2]=0.0;

	theta=-90.0; theta = Math.PI*theta/180.;


 a[0]=1.0; a[1]=0.0;a[2]=0.0;



 	transfo.Rot(r,v,rv,theta);
	//	System.out.println(rv[0]+" "+rv[1]+" "+rv[2]);


	//	 transfo.Par(r,v,rv);
	    
	// System.out.println(rv[0]+" "+rv[1]+" "+rv[2]);
 


transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//2

    //composant de la direction
    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=-90.0; theta = Math.PI*theta/180.;
	transfo.Rot(r,v,rv,theta);
 

 a[0]=1.0; a[1]=0.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//3

    //composant de la direction
    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=1.0;
	v[1]=1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;
	transfo.Rot(r,v,rv,theta);
 

 a[0]=0.0; a[1]=1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//4

    //composant de la direction
    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;
	transfo.Rot(r,v,rv,theta);

 

 a[0]=0.0; a[1]=-1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//rotation du vecteur a'''d'''=(-1,-1) autour du vecteur DC=((-1/sqrt(2)),1/sqrt(3) avec a = (0,-1,0)



    //composant de la direction
    r[0]=-1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=-1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;
	transfo.Rot(r,v,rv,theta);

 

 a[0]=0.0; a[1]=-1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


// rotation du vecteur cc''' =(-1,-1) autour du vecteur DC=(-1/sqrt(2),(1/sqrt(2) avec a = (-1.0,0,0)

   //composant de la direction
    r[0]=-1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=-1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;
	transfo.Rot(r,v,rv,theta);

 

 a[0]=-1.0; a[1]=0.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//rotation CC(4) =(-1,1) autour du vecteur 

    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;

	v[0]=-1.0;
	v[1]=1.0;
	v[2]=0.0;

	theta=-90.0; theta = Math.PI*theta/180.;
	transfo.Rot(r,v,rv,theta);



 a[0]=-1.0; a[1]=0.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//rotation bb(4)=(

    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;

	v[0]=-1.0;
	v[1]=1.0;
	v[2]=0.0;

	theta=-90.0; theta = Math.PI*theta/180.;
	transfo.Rot(r,v,rv,theta);



 a[0]=0.0; a[1]=1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);



//couvercle angle 180 
}
}