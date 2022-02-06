/******************************************************************
Ultima modificacion: 05/02/2022

Clase con los metodos para hacer el sorting
@file SortingFile.java
******************************************************************/

import java.util.*;

public class SortingFile{

    /** 
     * Metodo para sortear con el tipo "gnome sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     * @param list array con los elementos a ordenar
     */
    public void gnomeSort (int[] list){
        int i = 0;
        while(i<list.length){
            if (i==0){
                i++;
            }
            if (list[i]>=(list[i - 1]))
                i++;
            else {
                int temp = list[i];
                list[i] = list[i-1];
                list[i-1] = temp;
                i--;
            }
        }
    }

    /** 
     * Metodo para sortear con el tipo "merge sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     * @param list array con los elementos a ordenar
     * @param lo elemento inicial
     * @param hi ultimo elemento del array
     */
    public void mergeSort (int[] list,int le, int ri){
        if (le<ri){
            int mid=le+(ri-le)/2;
            mergeSort(list,le,mid);
            mergeSort(list,mid+1,ri);
            merge(list,le,mid,ri);
        }

    }

    /** 
     * Metodo para sortear con el tipo "quick sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     * @param list array con los elementos a ordenar
     * @param lo indice inicial
     * @param hi indice final
     */
    public void quickSort (int[] list,int lo, int hi){
        if (lo<hi){
            int pi = partition(list,lo,hi);
            quickSort(list, lo, pi-1);
            quickSort(list, pi+1, hi);
        }
    }


    /** 
     * Metodo para sortear con el tipo "selection sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     * @param list array con los elementos a ordenar
     */
    public void selectionSort (int[] list){
        for(int i=0;i<list.length-1;i++){
            int min = i;
            for (int j=i+1;j<list.length;j++){
                if (list[j]<list[min]){
                    min = j;
                }
            }
            //swap
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }



    /** 
     * Metodo de apoyo para el "quick sort"
     * Obtiene el ultimo elemento como pivot, lo coloca en su lugar y posiciona
     *          todos los elementos mejores a la izquierda y todos los 
     *          mayores a la derecha.
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     * @param list array con los elementos a ordenar
     * @param lo indice mas bajo
     * @param hi indice mas alto
     */
    public int partition(int []list,int lo,int hi){
        int pivot = list[hi];
        int i = (lo-1);
        for (int j = lo;j<=hi-1;j++){

            if (list[j]<pivot){    
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        int temp2 = list[i+1];
        list[i+1] = list[hi];
        list[hi] = temp2;
        return (i+1);
    }


    /** 
     * Metodo para sortear con el tipo "radix sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet" y de https://www.geeksforgeeks.org/radix-sort/
     * @param list array con los elementos a ordenar
     */
    public void radixSort (int[] list){
        int m = getMax(list);
        for (int e = 1;m/e>0;e*=10){
            countSort(list, e);
        }
    }

    /** 
     * Metodo de apoyo para el "radix sort"
     * Obtiene el valor maximo en un array
     * Obtenido y modificado a partir de https://www.geeksforgeeks.org/radix-sort/
     * @param list array del que se quiere saber el valor maximo
     */
    public int getMax (int[] list){
        int max = list[0];
        for (int i =1;i<list.length;i++){
            if (list[i]>max){
                max = list[i];
            }
        }
        return max;
    }


    /** 
     * Metodo de apoyo para el "radix sort"
     * Sirve para hacer counting sort de un array, de acuerdo al digito representado por exp
     * Obtenido y modificado a partir de https://www.geeksforgeeks.org/radix-sort/
     * @param list array del que sortear
     * @param e digito representador
     */
    public void countSort (int[] list, int e){
        int output[] = new int[list.length]; //array de output
        int count[] = new int[10];
        Arrays.fill(count,0);
        int i;
        
        for(i=0;i<list.length;i++){ // almacenar cuantas ocurrencias en count
            count[(list[i]/e)%10]++;
        }
        for (i=1;i<10;i++){ // cambiar count para que contenga la posicion de su digito en output
            count[i]+=count[i-1];
        }
        for (i=list.length-1;i>=0;i--){ //construir el array de output
            output[count[(list[i]/e)%10]-1]=list[i];
            count[(list[i]/e)%10]--;
        }

        for (i=0;i<list.length;i++){ //convertir la lista a la de output
            list[i]=output[i];
        }

    }

    /** 
     * Metodo de ayuda al tipo "merge sort"
     * Obtenido y modificado a partir de el archivo "The Sound of Sorting Algorithm Cheat Sheet"
     * @param list array con los elementos a ordenar
     * @param lo elemento inicial
     * @param hi ultimo elemento del array
     */
    public void merge(int list[],int l,int m,int r){
        int n1 = m-l +1; 
        int n2 = r - m;

        int left[] = new int[n1]; //crear arrays temporales
        int right[] = new int[n2];
        //copiar los objetos originales
        for (int i=0;i<n1;i++){
            left[i] = list[l+i];
        }
        for (int j=0;j<n2;j++){
            right[j] = list[m + 1 + j];
        }
        //unir
        int i = 0;
        int j = 0;
        int k = l;
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

}
