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
 * Remarques :binome : Khemsine Lydia  lydiakhemsine@outlook.com
 */
package test;

import static org.junit.Assert.*;
import HashProbingPackage.*;

import org.junit.Test;

public class HashQuadraticProbingTest {
    public HashQuadraticProbing HQ = new HashQuadraticProbing();
	char [] R = {'B','X','N','M','L'};
	int [] V  = {0,1,2,4,10};
	@Test
	public void testPut() {
		char [] test_keys = new char[11];
		test_keys[0] ='B';
		test_keys[1] ='X';
		test_keys[2] ='N';
		test_keys[4] ='M';
		test_keys[10] ='L';
		
		int [] test_values = new int[11];//{0,2,4,10};
		test_values[0] = 0 ;
		test_values[1] = 1 ;
		test_values[2] = 2 ;
		test_values[4] = 4 ;
		test_values[10] = 10;
		for(int i=0;i<R.length;i++)
			
		HQ.put(R[i], V[i]);
		assertArrayEquals(test_keys,HQ.keys);
		assertArrayEquals(test_values,HQ.values);
	}

	@Test
	public void testGet() {
		for(int i=0;i<R.length;i++)
			HQ.put(R[i], V[i]);
		assertEquals(HQ.get('L'),10);
		assertEquals(HQ.get('S'),-1);
	}

	@Test
	public void testRemove() {
		char [] test_keys = new char[11];
		test_keys[0] ='B';
		test_keys[1] ='-';
		test_keys[2] ='N';
		test_keys[4] ='M';

		test_keys[10] ='L';
		int [] test_values = new int[11];//{0,2,4,10};
		test_values[0] = 0 ;
		test_values[1] =0;
		test_values[2] = 2 ;
		test_values[4] = 4 ;

		test_values[10] = 10;

	for(int i=0;i<R.length;i++) {
		HQ.put(R[i], V[i]);
	}
		HQ.remove('X');
		assertArrayEquals(test_keys,HQ.keys);
		assertArrayEquals(test_values,HQ.values);
	}
	@Test
	public void testRemove_not_exist() {
		char [] test_keys = new char[11];
		test_keys[0] ='B';
		test_keys[1] ='X';
		test_keys[2] ='N';
		test_keys[4] ='M';

		test_keys[10] ='L';
		int [] test_values = new int[11];//{0,2,4,10};
		test_values[0] = 0 ;
		test_values[1] =1;
		test_values[2] = 2 ;
		test_values[4] = 4 ;
		test_values[10] = 10;
		
		for(int i=0;i<R.length;i++)
			HQ.put(R[i], V[i]);
		
		HQ.remove('S');
		
		assertArrayEquals(test_keys,HQ.keys);
		assertArrayEquals(test_values,HQ.values);
		}
}