package Merge;
/**
 * TP n°:2
 * 
 * Titre du TP :Merge Join 
 *
 * Date : 04/11/2020
 * 
 * Nom  : Bibi
 * Prenom : Thilleli
 *
 * email : thillelibibi@gmail.com
 * 
 * Remarques :
 */
import java.io.*;


public class MergeJoin {
	//taille des tablaux
	public final static int SIZE = 10;
	public MergeJoin() {};
	
	//ecrit dans un fichier à partir d'un tableau et renvoie le fichier
	public static File WriteIntoFile(char[] tab) throws IOException {	
		FileWriter fichier = new FileWriter("src/RS.txt");
        File f = new File("RS.txt");
        
   	    for(int j=0;j< tab.length;j++) {
   	    	if (tab[j] !=  0000000 && tab[j]!='\n' ) {
   	    	fichier.write(tab[j]);
   	    	}}
        
        fichier.close();
        return f;
        
	}
	
	//copie le contenu d'un fichier dans un tableau et renvoie le tableau
	public static char[] ReadFromFile(String nom,int SIZE) throws IOException {
		char[] result = new char[SIZE];
		int i = 0;
		BufferedReader lecteur = null;
		 String ligne;
		 int c;
		 char car;

		    try
		      {
		    	lecteur = new BufferedReader(new FileReader(nom));
		      }
		    catch(FileNotFoundException exc)
		      {
			System.out.println("Erreur d'ouverture");
		      }
		    while ((c = lecteur.read()) != -1 && i<10) 
		    	{
		    	car = (char)c;
		    	if (car !=  0000000 && car!='\n')
		    	  {result[i] = car; 
		     	  i++; } 
		     	} System.out.println(result);
		    
		    lecteur.close(); 
       	 
      
	        return result;	
	}
	//jointure de deux tableaux ; resultat dans un troisiem tableau
	public static char[]  join (char[] R,char[] S) throws IOException
	{
		 int k = 0;
		 int i=0,j=0;
		 char[] RS= new char[SIZE];
		 
         while(i < R.length && j< S.length )
         {        			 
        	 	 if (R[i]==S[j] )   
        		 {   if (R[i] !=  0000000 && R[i]!='\n') {
        			 RS[k] = R[i];
        			 k++;
        			 i++;
        			 }
        		 }
        	 	 else {
        	 		 if (R[i]>S[j])
        	 			 j++;
        	 		 else
        	 			 i++;
        	 	}
        	 	 
        }
        	 
         return RS;
    }
	
	//main
	public static void main(String[] args) throws IOException{
		
		MergeJoin J = new MergeJoin();
		
		char[] t=ReadFromFile("src/R.txt",SIZE);
		
		char[] s=ReadFromFile("src/S.txt",SIZE); 
			
		char[] result = join(t,s);
		
		System.out.println(result);
		
		File f = WriteIntoFile(result);		
		  
	}
}