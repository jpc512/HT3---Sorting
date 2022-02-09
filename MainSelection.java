/******************************************************************
Ultima modificacion: 08/02/2022

Clase para correr el metodo selection
@file MainSelection.java
******************************************************************/

public class MainSelection {
    public static void main(String[] args){
        SortingFile sf = new SortingFile();
        //ordenar numeros
        //primero -> leer archivo:
        int[] lista = ControladorArchivos.leerNumeros();
        //merge sort
        sf.selectionSort(lista);
        ControladorArchivos.escribirLista(lista);
    }
}
