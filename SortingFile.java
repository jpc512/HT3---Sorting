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
     * @param lo elemento inicial
     * @param hi ultimo elemento del array
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

        int left[] = new int[n1]; //crear arrays temporales
        int right[] = new int[n2];
        //copiar los objetos originales
        for (int i=0;i<n1;i++){
            left[i] = list[lo+i];
        }
        for (int j=0;j<n2;j++){
            right[j] = list[mid + 1 + j];
        }
        //unir
        int i = 0;
        int j = 0;
        int k = 1;
        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                list[k]=left[i];
                i++;
            } else {
                list[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            list[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            list[k] = right[j];
            j++;
            k++;
        }

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
