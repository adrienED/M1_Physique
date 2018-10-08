public class testapp{
    
    public static void main(String[] args){

	double[] r = new double[3];
	double[] v = new double[3];
	double[] rv = new double[3];

    double theta;
    double[] a = new double[3];
    double[] rvp = new double[3];

    //1rotation du vecteur D'A' =(1,1) autour du vecteur AB=(-1/sqrt(2),1/sqrt(2)) aveca=(1,0,0) d'un angle -90

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




//2rotation du vecteurC'B'   =(  ) autour du vecteur  =(1/sqrt(2),1/sqrt(2) avec a=(1,0,0)
 
    //composant de la direction
    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=1.0;
	v[1]=1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;


 a[0]=0.0; a[1]=1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


// 6rotation du vecteur cc''' =(-1,-1) autour du vecteur DC=(-1/sqrt(2),(1/sqrt(2) avec a = (-1,0,0)

   //composant de la direction
    r[0]=-1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=-1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;


 

 a[0]=-1.0; a[1]=0.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


 


//4rotation du vecteurC''D''  =(  ) autour du vecteur =(1/sqrt(2)

    //composant de la direction
    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;


 

 a[0]=0.0; a[1]=-1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//5rotation du vecteur a'''d'''=(-1,-1) autour du vecteur DC=((-1/sqrt(2)),1/sqrt(3) avec a = (0,-1,0)



    //composant de la direction
    r[0]=-1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=-1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;


 

 a[0]=0.0; a[1]=-1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//On se trouve au point D''=(0,-1,sqrt2) on veut aller au point A' =(-1,0sqrt(2) il nous suffit de faire une translation par le vecteur a=(1,1,0)

a[0]=1.0; a[1]=1.0;a[2]=0.0;
rv[0]=rvp[0];rv[1]=rvp[1];rv[2]=rvp[2];
transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);



//On se trouve au point A' on veut aller au point A 1,0,0 il nous suffit de faire une translation d evecteur 0,0,sqrt(2);

a[0]=1.0; a[1]=1.0;a[2]=0.0;
rv[0]=rvp[0];rv[1]=rvp[1];rv[2]=rvp[2];
transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);


/*
fin des rotations 
// 6rotation du vecteur cc''' =(-1,-1) autour du vecteur DC=(-1/sqrt(2),(1/sqrt(2) avec a = (-1,0,0)

   //composant de la direction
    r[0]=-1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=-1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=90.0; theta = Math.PI*theta/180.;


 

 a[0]=-1.0; a[1]=0.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
//System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//7rotation CC(4) =(-1,1) autour du vecteur 

    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;

	v[0]=-1.0;
	v[1]=1.0;
	v[2]=0.0;

	theta=-90.0; theta = Math.PI*theta/180.;




 a[0]=-1.0; a[1]=0.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);

//8rotation bb(4)=(-1,1) autour du 

    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;

	v[0]=-1.0;
	v[1]=1.0;
	v[2]=0.0;

	theta=-90.0; theta = Math.PI*theta/180.;




 a[0]=0.0; a[1]=1.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
//System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);
//3rotation du vecteur AA'' =(1,-1) autour du vecteur AB=(1/sqrt(2),1/sqrt(2) avec a=(1,0,0) d'un angle de degrès

    //composant de la direction
    r[0]=1./Math.sqrt(2.0);
    r[1]=1./Math.sqrt(2.0);
    r[2]=0.;
	//composant du vecteur a tourner
	v[0]=1.0;
	v[1]=-1.0;
	v[2]=0.0;

	theta=-90.0; theta = Math.PI*theta/180.;

 

 a[0]=1.0; a[1]=0.0;a[2]=0.0;

transfo.Trans(a,rv,rvp);
//System.out.println(rvp[0]+" "+rvp[1]+" "+rvp[2]);



*/
}
}