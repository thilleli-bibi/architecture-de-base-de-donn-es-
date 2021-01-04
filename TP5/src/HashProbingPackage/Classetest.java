/**
 * TP n°:6
 * 
 * Titre du TP :hashProbing
 *
 * Date : 09/12/2020
 * 
 * Nom  : bibi
 * Prenom :thilleli
 *
 * email : thillelibibi@gmail.com
 * 
 * Remarques :binome : Khemsine Lydia : lydiakhemsine@outlook.com
 */
package HashProbingPackage;

public class Classetest  {
	
	public static void main(String []args) {
		
	   ProbingFactory Pb = new ProbingFactory();
	   
 //test LinearProbing
	   char [] R = {'B','O','E','P','V','L','X','N','K','M'};
	   HashProbing hL = Pb.getclass("Linear");   
	   //test put
	   for(int i=0;i<R.length;i++)
			hL.put(R[i], i);	
	   //test get
        System.out.println("Linear --> M = : " + hL.get('M'));
        //test remove
		hL.remove('N') ;		
	     //get test after remove
		 System.out.println("N (supprimée): " + hL.get('N'));
		 System.out.println("Linear after remove  --> X = : " + hL.get('X'));
//test QuadraticProbing
		 char [] R1 = {'B','X','N','M','L'};
		 int [] V = {0,1,2,4,10};
		 
		 HashProbing Hq = Pb.getclass("Quadratic");
		 //test put
		 for(int i=0;i<R1.length;i++)
				Hq.put(R1[i], V[i]);
		 //test get 
		 System.out.println("Quadratic --> M = : " + Hq.get('M'));		
		 //test remove
		 Hq.remove('X') ;
         //test after remove
		 System.out.println("Quadratic after remove X --> M = : " + Hq.get('M'));
		 //test remove non-existent
		 Hq.remove('S');
		 
  //test DoubleProbing
	  char [] R3 = {'B','X','N','M','L'};
	  int [] V2 = {0,3,2,7,10};
	  
	  HashProbing Hd = Pb.getclass("Double");
	  
	  //test put 
	  for(int i=0;i<R3.length;i++)
			Hd.put(R3[i], V2[i]);
	  //test get
	  System.out.println("Double --> M = : " + Hd.get('M'));
      //test remove
	  Hd.remove('X') ;
      //test get after remove
	  System.out.println("Double after remove X --> M =: " + Hd.get('M'));
      //test remove non-existent key
	  Hd.remove('S') ;
	
	}
}
