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

public class HashLinearProbing implements HashProbing {
	  
   public static  int M=11;
   public char [] keys = new char [M];
   public int [] values = new int [M];

	@Override
	public void put(char key, int value) {
					
		int index = hash(key);
		
		while(keys[index]!=0) {
			index = (index + 1) % M;			
		}
		
		keys[index]=key;
		values[index]=value;
		
	}

	@Override
	public int get(char key) {
		int index=hash(key);
		while((keys[index]!=key) &&(keys[index]!=0)) {
			index = (index + 1) % M;
		}
		if (keys [index] == key){
			int m = values[index];
			return m;
		}
		else {
			return -1;	
		}	
	}
	

	private int hash(char key) {
		return (int)key % M;
	}
	
	
	//on supprime d'abord la clé et sa valeur
	//apres on avance pour recuperer les lignes non vides une par une 
	//et on les deplace en appelant put et donc aux cases vides d'avant
	
	public void remove(char key) {
		int index=hash(key);
		
		while((keys[index]!=key) &&(keys[index]!=0)) {
			index = (index + 1) % M;
		}
		keys[index]=0;
		values[index]=0;			
		
		index=(index + 1)%M;
		
		while(keys[index]!= 0) {
			char savedKey=keys[index];
			int  savedValue=values[index];
			keys[index]=0;
			values[index]=0;
			
			put(savedKey, savedValue);
			index=(index+1)%M;
		
		}
		
		
	}	
}
