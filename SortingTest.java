
/******************************************************************
Ultima modificacion: 05/02/2022

Clase para probar los metodos de sorting
@file SortingTest.java
******************************************************************/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SortingTest {
	
	/**
	 * Evalua el metodo de gnome sort
	 */
	@Test
	void testGnomeSort() {
		SortingFile sf = new SortingFile();
		int[] lista = new int[6];
		lista[0] = 23;
		lista[1] = 3;
		lista[2] = 395;
		lista[3] = 18;
		lista[4] = 32;
		lista[5] = 102;
		sf.gnomeSort(lista);
		assertEquals(3,lista[0],0.001,"No se ha ordenado la lista");
		assertEquals(18,lista[1],0.001,"No se ha ordenado la lista");
		assertEquals(23,lista[2],0.001,"No se ha ordenado la lista");
		assertEquals(32,lista[3],0.001,"No se ha ordenado la lista");
		assertEquals(102,lista[4],0.001,"No se ha ordenado la lista");
		assertEquals(395,lista[5],0.001,"No se ha ordenado la lista");
	}
	
	/**
	 * Evalua el metodo de merge sort
	 */
	@Test
	void testMergeSort() {
		SortingFile sf = new SortingFile();
		int[] lista = new int[6];
		lista[0] = 23;
		lista[1] = 3;
		lista[2] = 395;
		lista[3] = 18;
		lista[4] = 32;
		lista[5] = 102;
		sf.mergeSort(lista,0,lista.length-1);
		assertEquals(3,lista[0],0.001,"No se ha ordenado la lista");
		assertEquals(18,lista[1],0.001,"No se ha ordenado la lista");
		assertEquals(23,lista[2],0.001,"No se ha ordenado la lista");
		assertEquals(32,lista[3],0.001,"No se ha ordenado la lista");
		assertEquals(102,lista[4],0.001,"No se ha ordenado la lista");
		assertEquals(395,lista[5],0.001,"No se ha ordenado la lista");
	}
	
	/**
	 * Evalua el metodo de quick sort
	 */
	@Test
	void testQuickSort() {
		SortingFile sf = new SortingFile();
		int[] lista = new int[6];
		lista[0] = 23;
		lista[1] = 3;
		lista[2] = 395;
		lista[3] = 18;
		lista[4] = 32;
		lista[5] = 102;
		sf.quickSort(lista,0,lista.length-1);
		assertEquals(3,lista[0],0.001,"No se ha ordenado la lista");
		assertEquals(18,lista[1],0.001,"No se ha ordenado la lista");
		assertEquals(23,lista[2],0.001,"No se ha ordenado la lista");
		assertEquals(32,lista[3],0.001,"No se ha ordenado la lista");
		assertEquals(102,lista[4],0.001,"No se ha ordenado la lista");
		assertEquals(395,lista[5],0.001,"No se ha ordenado la lista");
	}
	
	/**
	 * Evalua el metodo de selection sort
	 */
	@Test
	void testSelectionSort() {
		SortingFile sf = new SortingFile();
		int[] lista = new int[6];
		lista[0] = 23;
		lista[1] = 3;
		lista[2] = 395;
		lista[3] = 18;
		lista[4] = 32;
		lista[5] = 102;
		sf.selectionSort(lista);
		assertEquals(3,lista[0],0.001,"No se ha ordenado la lista");
		assertEquals(18,lista[1],0.001,"No se ha ordenado la lista");
		assertEquals(23,lista[2],0.001,"No se ha ordenado la lista");
		assertEquals(32,lista[3],0.001,"No se ha ordenado la lista");
		assertEquals(102,lista[4],0.001,"No se ha ordenado la lista");
		assertEquals(395,lista[5],0.001,"No se ha ordenado la lista");
	}

	
}
