import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pomuch 5
 */
public class SumaNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner cin = new Scanner (System.in);
      
   
        int n1, n2, suma;
        
        
    System.out.print("Introduce primer número: ");
    n1 = cin.nextInt ();    
    
    System.out.print("Introduce segundo número: ");
     n2 = cin.nextInt();
     
     suma = n1 + n2;
        
     
     System.out.println("El resultado es: "+ suma);
        