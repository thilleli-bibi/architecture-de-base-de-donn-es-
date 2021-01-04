
/**
 * TP n°:2
 * 
 * Titre du TP :TP Merg Join
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
package test;
import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;
import Merge.MergeJoin;

public class MergeJoinTest  {

	MergeJoin j =new MergeJoin();
	@Test
	public void testJoin() throws IOException{
		
		//test1
		char[] tab1 = {'A','B','E','G','J','K','U','V','Z'};
		char[] tab2 = {'B','E','K','L','M','N','U','V','X'};
		char[] tab = new char[10];
		tab [0] = 'B';
		tab [1] = 'E';
		tab [2] = 'K';
		tab [3] = 'U';
		tab [4] = 'V';
		
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
		
		
		assertArrayEquals(t3,j.join(t4, t5));
	}
	
	@Test
	public void testReadFromFile() throws IOException{
		//test R
		char [] tab1 = new char[10];
        tab1[0] = 'A';
        tab1[1] = 'B';
        tab1[2] = 'E';
        tab1[3] = 'G';
        tab1[4] = 'J';
        tab1[5] = 'K';
        tab1[6] = 'U';
        tab1[7] = 'V';
        tab1[8] = 'Z';
		assertArrayEquals(tab1,j.ReadFromFile("src/R.txt",10));
		
		//test S
		char [] tab2 = new char[10];
        tab2[0] = 'B';
        tab2[1] = 'E';
        tab2[2] = 'K';
        tab2[3] = 'L';
        tab2[4] = 'M';
        tab2[5] = 'N';
        tab2[6] = 'U';
        tab2[7] = 'V';
        tab2[8] = 'X';
        
		assertArrayEquals(tab2,j.ReadFromFile("src/S.txt",10));

	}
	   
	@Test
	public void testWriteIntoFile() throws IOException{
		
		char [] tab1 = new char[10];
        tab1[0] = 'B';
        tab1[1] = 'E';
        tab1[2] = 'K';
        tab1[3] = 'U';
        tab1[4] = 'V';
        
		assertEquals(new File("RS.txt"),j.WriteIntoFile(tab1));
	
	}
	


}
