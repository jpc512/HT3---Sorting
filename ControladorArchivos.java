/******************************************************************
Ultima modificacion: 05/02/2022

Clase con los metodos para controlar archivos
@file ControladorArchivos.java
******************************************************************/
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ControladorArchivos {

    /** 
     * Metodo para escribir en un archivo numeros
     * @param cantidad de numeros deseados
     */
    public static void escribirNumeros(int cantidad){
        Random random = new Random();
        try{
            File file1 = new File("lista.txt");
            FileWriter fw = new FileWriter(file1,false); //se re escribe cualquier valor anterior
            PrintWriter pw = new PrintWriter(fw);
            
            for (int i =1; i<=cantidad;i++){
                int r = random.nextInt(3000) + 1; //crear numeros random
                String n =String.valueOf(r);
                pw.write(n);
                if (i<cantidad){
                    pw.write(" ");
                }
            }
            pw.close();
            
        }catch(Exception e){
            //no pasa nada
        }
    }

    /** 
     * Metodo para leer un archivo, regresa la lista con numeros
     * @return numInt lista
     */
    public static int[] leerNumeros(){
        int [] numInt = new int[10];
        try{
            File file = new File("lista.txt");
            Scanner s = new Scanner(file);
            String linea = s.nextLine();
            String[] items = linea.split(" ");
            int [] temp = new int[items.length];
            numInt = temp;
            for (int i=0;i<items.length;i++){
                numInt[i]=Integer.parseInt(items[i]);
            }
            s.close();
        } catch (Exception e){
            //regresara una lista vacia
        }
        return numInt;
    }

    /** 
     * Metodo para escribir una lista en un archivo
     * @param lista array a escribir
     */
    public static void escribirLista(int[] lista){
        String[] numString = new String[lista.length];
        for (int i=0;i<lista.length;i++){
            numString[i]=String.valueOf(lista[i]);
        }
        String arrayToString = String.join(" ", numString);
        try{
            File file1 = new File("lista.txt");
            FileWriter fw = new FileWriter(file1,false); //se re escribe cualquier valor anterior
            PrintWriter pw = new PrintWriter(fw);
            pw.write(arrayToString);
            pw.close();
            
            }catch(Exception e){
                //no pasa nada
            }
    }
}
