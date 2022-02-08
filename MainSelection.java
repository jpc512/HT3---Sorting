/******************************************************************
Ultima modificacion: 08/02/2022

Clase para correr el metodo selection
@file MainSelection.java
******************************************************************/

public class MainSelection {
    public static void main(String[] args){
    	long TInicio, TFin, tiempo;           //Para determinar el tiempo
   	 	TInicio = System.currentTimeMillis(); //de ejecución
        SortingFile sf = new SortingFile();
        //ordenar numeros
        //primero -> leer archivo:
        int[] lista = ControladorArchivos.leerNumeros();
        //merge sort
        sf.selectionSort(lista);
        ControladorArchivos.escribirLista(lista);
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
    }
}
