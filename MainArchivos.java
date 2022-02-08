/******************************************************************
Ultima modificacion: 08/02/2022

Clase para escribir en un archivo numeros aleatorios
@file MainArchivos.java
******************************************************************/
import java.util.Scanner;


public class MainArchivos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        SortingFile sf = new SortingFile();
        boolean terminar = false; //controlar opcion elegida
        
        //dar opciones
        while (!terminar){
            System.out.println("Escriba el numero de la opcion que desee realizar:\n1. Escribir numeros en un archivo\n2. Ordenar numeros en un archivo\n3. Salir del programa\n\n");
            String opcion = scan.nextLine();
            if (opcion.equalsIgnoreCase("1")) {
                //escribir en el archivo
                boolean opcionV = false;
                int cantidad = 0;
                while (!opcionV){
                    System.out.println("Escriba un numero entre 10 y 3000");
                    String numero = scan.nextLine();
                    try {
                        cantidad = Integer.parseInt(numero);
                    } catch (Exception e) {
                        //opcion invalida
                        cantidad = 3001;
                    }
                    if (cantidad <=3000 && cantidad>=10){
                        //no pasa nada porque la opcion es valida
                        opcionV=true;
                    } else {
                        System.out.println("Opcion Invalida");
                    }
                }
                ControladorArchivos.escribirNumeros(cantidad);
               
            } else if (opcion.equalsIgnoreCase("2")){
                //ordenar numeros
                //primero -> leer archivo:

                int[] lista = ControladorArchivos.leerNumeros();
                boolean opcion2 = false;
                while (!opcion2){
                    System.out.println("Escriba el numero del tipo de sort que quiere realizar:\n1.Gnome sort\n2.Merge sort\n3.Quick sort\n4.Radix sort\n5.Selection sort\n");
                    String sort = scan.nextLine();
                    if (sort.equalsIgnoreCase("1")){
                        //gnome sort
                        sf.gnomeSort(lista);
                        opcion2 = true;
                    } else if (sort.equalsIgnoreCase("2")){
                        //merge sort
                        sf.mergeSort(lista, 0, lista.length-1);
                        opcion2 = true;
                    } else if (sort.equalsIgnoreCase("3")){
                        //quick sort
                        sf.quickSort(lista, 0, lista.length-1);
                        opcion2 = true;
                    } else if (sort.equalsIgnoreCase("4")){
                        //radix sort
                        sf.radixSort(lista);
                        opcion2 = true;
                    } else if (sort.equalsIgnoreCase("5")){
                        //selection sort
                        sf.selectionSort(lista);
                        opcion2 = true;
                    } else {
                        System.out.println("Escriba una opcion valida");
                    }
                }
                ControladorArchivos.escribirLista(lista);
               
            } else if (opcion.equalsIgnoreCase("3")){
            	terminar = true;
            } else {
                System.out.println("Escriba una opcion valida\n");
            }
        }
        scan.close();
    }
}
