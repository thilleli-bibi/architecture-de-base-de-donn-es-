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

public class HashQuadraticProbing implements HashProbing {
	   
	   public static  int M=11;
	   public char [] keys = new char [M];
	   public int [] values = new int [M];

	@Override
	public void put(char key, int value) {
		int hash = hash(key) ;
		int newhash = hash ;

		int i = 1 ;
		while (keys[newhash] != 0 && keys[newhash]!=key) {
			//newhash = hash ((char)(hash+(i*i)));
			newhash = (hash + i*i) % M;
			i++;
		}


		keys[newhash] = key ;
		values[newhash] = value ;
		
	}

	@Override
	public int get(char key) {
		int hash=hash(key);
		int index =hash;
		int i =1;
		while((keys[index]!=key) &&(keys[index]!=0)) {
			index = (hash + i*i) % M;
			i++;
		}
		if (keys [index] == key){
			int m = values[index];
			return m;
		}
		else {
			return -1;	
		}	
	}

	@Override
	public void remove(char key) {
		int hash=hash(key);
		int index = hash;  
		int i = 1;
		while((keys[index]!=key &&(keys[index]!=0))) {
			index = (hash + i*i) % M;
			i++;
		}
		
		if(keys[index]==key ) {
				keys[index]='-';
				values[index]=0;			
			}
		
		}
	
	private int hash(char key) {
		return (int)key % M;
	}
	
   

}
