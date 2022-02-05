/******************************************************************
Ultima modificacion: 05/02/2022

Clase con los metodos para hacer el sorting
@file SortingFile.java
******************************************************************/

//import java.util.*;

public class SortingFile{

    /** 
     * Metodo para sortear con el tipo "gnome sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     */
    public void gnomeSort (int[] list){
        int i = 0;
        while(i<=list.length){
            if (list[i]>=(list[i - 1]))
                i++;
            else {
                int temp = list[i];
                list[i] = list[i-1];
                list[i-1] = temp;
                if (i>2){
                    i--;
                }  
            }
        }
    }

    /** 
     * Metodo para sortear con el tipo "merge sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     */
    public void mergeSort (int[] list,int lo, int hi){
        if (hi-lo<=1){
            return;
        }
        int mid = (hi+lo)/2;
        mergeSort(list,lo,mid);
        mergeSort(list,mid+1,hi);
        int n1 = mid-lo +1;
        int n2 = hi - mid;
        

    }

    /** 
     * Metodo para sortear con el tipo "quick sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     */
    public void quickSort (int[] list){

    }

    /** 
     * Metodo para sortear con el tipo "radix sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     */
    public void lsdRadixSort (int[] list){

    }

    /** 
     * Metodo para sortear con el tipo "insertion sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     */
    public void insertionSort (int[] list){

    }
    
}
