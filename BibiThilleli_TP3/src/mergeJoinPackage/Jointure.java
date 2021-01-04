package mergeJoinPackage;


/**
 * TP n°:2
 * 
 * Titre du TP :TP Merge Join
 *
 * Date : 04/11/2020
 * 
 * Nom  : Khemsine
 * Prenom :Lydia
 *
 * email : lydiakhemsine@outlook.com
 * 
 * Remarques :
 */
import java.io.*;


public class Jointure {
	public final static int SIZE = 10;
	public Jointure() {};
	
	public static File WriteInFile(char[] tab) throws IOException {	
		FileWriter fichier = new FileWriter("RS.txt");
        File f = new File("RS.txt");
        
   	    for(int j=0;j< tab.length;j++) {
   	    	if (tab[j] !=  0000000 && tab[j]!='\n' ) {
   	    	fichier.write(tab[j]);
   	    	}}
        
        fichier.close();
        return f;
        
	}
	
	public static char[] ReadFromFile(String filename,int SIZE) throws IOException {
		char[] result = new char[SIZE];
		int i = 0;
		BufferedReader lecteur = null;
		 String ligne;
		 int c;
		 char car;

		    try
		      {
		    	lecteur = new BufferedReader(new FileReader(filename));
		      }
		    catch(FileNotFoundException exc)
		      {
			System.out.println("Erreur d'ouverture");
		      }
		    String line;
		    while (((line = lecteur.readLine()) != null) && i<10){
		    	
		    	char o= line.charAt(0);
		    	result[i] = o;
		    	i++;
		    }
		   lecteur.close(); 
	        return result;	
	}

	public static char[]  join (char[] R,char[] S) throws IOException
	{char[] RS = new char[SIZE];
		 int k = 0; int rs=0;
		 FileWriter fichier = new FileWriter("RS.txt");
	        File f = new File("RS.txt");
	        int i=0;
	        int j=0;
		 
         
        	 while(i<R.length && j<S.length){
        		 if (R[i]==S[j]) {//
        			 k=j;
        			 while(R[i]==S[j]) {
        					while(R[i]==S[j]) {
        						if (R[i]!= 0000000) {
        							 RS[rs] = R[i];
        							 rs++;
        							 j++;
        						}
        					}
        					
        				}
        				i++;
        				j=k;
        			 
        		 }else 
        			 if (R[i]>S[j]) {
        				 j++;	 
        			 }else 
        			 i++;
        		 
        	 }
        	
        
         return RS;
   
        
         
         
    }

	public static void main(String[] args) throws IOException{
		
		Jointure J = new Jointure();
		char[] t=ReadFromFile("R.txt",SIZE);
		char[] s=ReadFromFile("S.txt",SIZE); 
		char[] result = join(t,s);
		System.out.println(result);
		

		File f = WriteInFile(result);
		

		
		  
	}
}

