package edu.eci.cvds.patterns;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String x = "";
        String y = "";
        System.out.println("Ingrese su nombre");
        Scanner entradaEscaner = new Scanner(System.in);
        x = entradaEscaner.nextLine();
        y = entradaEscaner.nextLine();
        System.out.println( "Hello " + x +" "+ y + "!");
    }
}
