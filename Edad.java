
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch 5
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     for (int n=1; n<=5; n++){
         System.out.print("Teclee el año actual: ");
         int año_ac = scanner.nextInt();
         System.out.print("Teclee el año de nacimiento: ");
         int año_n = scanner.nextInt();
         int edad =año_ac - año_n;
         System.out.println("La edad de la persona es: " +edad);
     }
    
                 
   
           
    }    
        
    }
    

