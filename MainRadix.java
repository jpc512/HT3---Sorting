/******************************************************************
Ultima modificacion: 08/02/2022

Clase para correr el metodo radix
@file MainRadix.java
******************************************************************/

public class MainRadix {
    public static void main(String[] args){
        SortingFile sf = new SortingFile();
        //ordenar numeros
        //primero -> leer archivo:
        int[] lista = ControladorArchivos.leerNumeros();
        //merge sort
        sf.radixSort(lista);
        ControladorArchivos.escribirLista(lista);
    }
}
