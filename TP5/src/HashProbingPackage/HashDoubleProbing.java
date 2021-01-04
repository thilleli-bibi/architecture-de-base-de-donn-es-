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

public class HashDoubleProbing implements HashProbing {		   
		   public static  int M=11;
		   public char [] keys = new char [M];
		   public int [] values = new int [M];

		@Override
		public void put(char key, int value) {
			int hash = hash(key);
			int hash2 = hash2(key);

			int i = 0 ;
			while (keys[hash] != 0 && keys[hash]!=key) {
				//newhash = hash ((char)(hash+(i*i)));
				hash = (hash + i*hash2) % M;
				i++;
			}


			keys[hash] = key ;
			values[hash] = value ;
			
		}

		@Override
		public int get(char key) {
			int hash = hash(key);
			int hash2 = hash2(key);

			int i = 0;
			while((keys[hash]!=key) &&(keys[hash]!=0)) {
				hash = (hash + i*hash2) % M;
				i++;
			}
			if (keys [hash] == key)
				return values[hash];
			
			else {
				return -1;	
			}	
		}

		@Override
		public void remove(char key) {
			int hash = hash(key);
			int hash2 = hash2(key);
			int i = 0;
			
			while((keys[hash]!=key &&(keys[hash]!=0))) {
				hash = (hash + i*hash2) % M;
				i++;
			}
			
			if(keys[hash]==key ) {
					keys[hash]='-';
					values[hash]=0;			
				}
			
			}
		
		private int hash(char key) {
			return (int)key % M;
		}
		
		private int hash2(char key) {
			return 7-((int)key%7);
		}
		
	   

}
