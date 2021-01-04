/**
 * TP n°:2
 * 
 * Titre du TP :TP Merge Join
 *
 * Date : 04/11/2020
 * 
 * Nom  : khemsine
 * Prenom : lydia
 *
 * email : khemsinelydia@outlook.com
 * 
 * Remarques :
 */
package test;


import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

import mergeJoinPackage.Jointure;

public class JointurTset {

	Jointure j =new Jointure();
	@Test
	public void testJoin() throws IOException{
		
		//test11
		char[] tab1 = {'A','B','B','E','G','J','K','U','V','Z'};
		char[] tab2 = {'B','B','E','K','M','N','U','U','V','X'};
		char[] tab = new char[10]; 
		tab[0] = 'B';
		tab[1] = 'B';
		tab[2] = 'B';
		tab[3] = 'B';
		tab[4] = 'E';
		tab[5] = 'K';
		tab[6] = 'U';
		tab[7] = 'U';
		tab[8] = 'V';
		
		
		assertArrayEquals(tab,j.join(tab1, tab2));
		
		//test2
		char[] t1 = {'K','L'};
		char[] t2 = {};
		char[] t3 = new char[10];
		
		assertArrayEquals(t3,j.join(t1, t2));
		//test3
		char[] t4 = {};
		char[] t5 = {};
		char[] t6 = new char[10];
		
		assertArrayEquals(t6,j.join(t4, t5));
		
	}	
	
		@Test
		public void testReadFromFile() throws IOException {
			char [] A = new char[10];
	        A[0] = 'A';
	        A[1] = 'B';
	        A[2] = 'B';
	        A[3] = 'E';
	        A[4] = 'G';
	        A[5] = 'J';
	        A[6] = 'K';
	        A[7] = 'U';
	        A[8] = 'V';
	        A[9] = 'Z';
	        
			
			assertArrayEquals(A,j.ReadFromFile("R.txt", 10));
			}
		
		@Test
		public void testwriteinfile() throws IOException{
		char [] t = new char[10];
		t[0] = 'B';
		t[1] = 'B';
		t[2] = 'B';
		t[3] = 'B';
		t[4] = 'E';
		t[5] = 'k';
		t[6] = 'U';
		t[7] = 'U';
		t[8] = 'V';
		assertEquals(new File("RS.txt"),j.WriteInFile(t));
		}
		
       
	}


