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
package test;
import HashProbingPackage.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashLinearProbingTest {

	private static char [] R = {'B','O','E','P','V','L','X','N','K','M'};
	private HashLinearProbing hm = new HashLinearProbing();

	
	@Test
	public void testPut() {
		 char [] test_Keys = {'B','X','O','E','P', 'N', 'K' ,'M',0,'V','L'};
		 int [] test_values= {0, 6, 1, 2, 3, 7, 8, 9,0,4,5};
//		 hm = new HashLinearProbing();
		 for(int i=0;i<R.length;i++)
				hm.put(R[i], i);
		 assertArrayEquals(test_Keys,hm.keys);
		 assertArrayEquals(test_values,hm.values);
	}

	@Test
	public void testGet() {
//		hm = new HashLinearProbing();
		 for(int i=0;i<R.length;i++)
				hm.put(R[i], i);
		 
		 assertEquals(hm.get('M'),9);
		 
		 //teste keys doesn't exist
		 
		 assertEquals(hm.get('H'),-1);
	}

	@Test
	public void testRemove() {
		hm = new HashLinearProbing();
		
		for(int i=0;i<R.length;i++)
				hm.put(R[i], i);
		
		char [] test_Keys = {'B','X','O','E','P','K','M',0,0,'V','L'};
		int [] test_values= {0, 6, 1, 2, 3, 8, 9,0,0,4,5};
		hm.remove('N');
		assertArrayEquals(test_Keys,hm.keys);
		assertArrayEquals(test_values,hm.values);
	}
	@Test
	public void testRemove_not_exist() {
		hm = new HashLinearProbing();
		 for(int i=0;i<R.length;i++)
				hm.put(R[i], i);
		char [] test_Keys = hm.keys;
		int [] test_values= hm.values;
		hm.remove('Z');
		assertArrayEquals(test_Keys,hm.keys);
		assertArrayEquals(test_values,hm.values);
		
	} 	

}
