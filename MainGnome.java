/******************************************************************
Ultima modificacion: 08/02/2022

Clase para correr el metodo gnome
@file MainGnome.java
******************************************************************/

public class MainGnome {
    public static void main(String[] args){
        SortingFile sf = new SortingFile();
        //ordenar numeros
        //primero -> leer archivo:
        int[] lista = ControladorArchivos.leerNumeros();
        //merge sort
        sf.gnomeSort(lista);
        ControladorArchivos.escribirLista(lista);
    }
}
