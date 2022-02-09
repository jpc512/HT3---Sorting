/******************************************************************
Ultima modificacion: 08/02/2022

Clase para correr el metodo quick
@file MainQuick.java
******************************************************************/

public class MainQuick {
    public static void main(String[] args){
        SortingFile sf = new SortingFile();
        //ordenar numeros
        //primero -> leer archivo:
        int[] lista = ControladorArchivos.leerNumeros();
        //merge sort
        sf.quickSort(lista, 0, lista.length-1);
        ControladorArchivos.escribirLista(lista);
    }
}
