/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg604.pkg1;

import java.util.Scanner;

/**
 *
 * @author ainho
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca DNI numerico 99999999X");
        String dni = in.nextLine();
        if (dni.length() != 9){
            System.out.println("Longitud no es válida");
        } else{
            String dniCadena = dni.substring (0,8);
            char letra = dni.charAt(8);
            System.out.println(dniCadena);
            System.out.println(letra);
   
            int dniNumerico = Integer.parseInt(dniCadena);
          
            int resto = dniNumerico%23;
       
            char letraCorrecta = letrasDNI[resto];
            System.out.println(letraCorrecta);
            if (letra != letraCorrecta){
            System.out.println("DNI erroneo");
            System.out.println("DNI correcto:"+ dniCadena+letraCorrecta);
            } else{
                 System.out.println("DNI correcto");
            }
        }
        
    }

}
