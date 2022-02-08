/******************************************************************
Ultima modificacion: 08/02/2022

Clase para correr el metodo radix
@file MainRadix.java
******************************************************************/

public class MainRadix {
    public static void main(String[] args){
    	long TInicio, TFin, tiempo;           //Para determinar el tiempo
   	 	TInicio = System.currentTimeMillis(); //de ejecución
        SortingFile sf = new SortingFile();
        //ordenar numeros
        //primero -> leer archivo:
        int[] lista = ControladorArchivos.leerNumeros();
        //merge sort
        sf.radixSort(lista);
        ControladorArchivos.escribirLista(lista);
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
    }
}
