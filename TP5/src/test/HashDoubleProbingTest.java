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

import static org.junit.Assert.*;

import org.junit.Test;

import HashProbingPackage.HashDoubleProbing;

public class HashDoubleProbingTest {
	HashDoubleProbing hL = new  HashDoubleProbing();
	
	//notre tableau des clés à hasher
	 char [] R = {'B','X','N','M','L'};
	 int [] V = {0,3,2,7,10};

	@Test
	public void testPut() {
		char [] test_keys = new char[11];
		test_keys[0] ='B';
		test_keys[1] ='N';
		test_keys[3] ='X';
		test_keys[7] ='M';
		test_keys[10] ='L';
		int [] test_values = new int[11];//{0,2,4,10};
		test_values[0] = 0 ;
		test_values[1] = 2 ;
		test_values[3] = 3 ;
		test_values[7] = 7 ;
		test_values[10] = 10;
		for(int i=0;i<R.length;i++)
		hL.put(R[i], V[i]);
		assertArrayEquals(test_keys,hL.keys);
		assertArrayEquals(test_values,hL.values);
	}
//
	@Test
	public void testGet() {
		for(int i=0;i<R.length;i++)
			hL.put(R[i], V[i]);
		assertEquals(hL.get('L'),10);
		assertEquals(hL.get('S'),-1);
	}

	@Test
	public void testRemove() {
		char [] test_keys = new char[11];
		test_keys[0] ='B';
		test_keys[1] ='N';
		test_keys[3] ='-';
		test_keys[7] ='M';
		test_keys[10] ='L';
		int [] test_values = new int[11];
		test_values[0] = 0 ;
		test_values[1] = 2;
		test_values[3] = 0 ;
		test_values[7] = 7 ;
		test_values[10] = 10;

	for(int i=0;i<R.length;i++) {
		hL.put(R[i], V[i]);
	}
		hL.remove('X');
		assertArrayEquals(test_keys,hL.keys);
		assertArrayEquals(test_values,hL.values);
	}
	@Test
	public void testRemoveNotexist() {
		char [] test_keys = new char[11];
		test_keys[0] ='B';
		test_keys[1] ='N';
		test_keys[3] ='X';
		test_keys[7] ='M';
		test_keys[10] ='L';
		int [] test_values = new int[11];
		test_values[0] = 0 ;
		test_values[1] = 2;
		test_values[3] = 3;
		test_values[7] = 7 ;
		test_values[10] = 10;

	for(int i=0;i<R.length;i++) {
		hL.put(R[i], V[i]);
	}
		hL.remove('S');
		assertArrayEquals(test_keys,hL.keys);
		assertArrayEquals(test_values,hL.values);
	}

}
