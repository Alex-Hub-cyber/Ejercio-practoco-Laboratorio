/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.id.proyectoaprovarreprovar;
import java.util.Scanner;
/**
 *
 * @author Garcia
 */
public class promedio3notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        double Resultado1, Resultado2, Resultado3,Promedio;
        String alumno;
        System.out.println("Nombre del Alumno");
        alumno=teclado.nextLine();
        System.out.println("Resultado de primer periodo1:");
        double Resultado = teclado.nextDouble();
        System.out.println("Resultado de primer periodo2:");
         Resultado2 = teclado.nextDouble();
        System.out.println("Resultado de primer periodo3:");
         Resultado3 = teclado.nextDouble();
        Promedio =(Resultado+Resultado2+Resultado3)/3;
        System.out.println("El promedio final del alumno:"+alumno+"es de: "+Promedio);
        
        
    }
    
}
