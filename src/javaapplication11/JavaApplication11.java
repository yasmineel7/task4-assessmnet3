/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author yasmi
 */
public class JavaApplication11 {

    /**
     * @param num
     * @return 
     */
    public static int coinClass(int num){
        
         if (flip()) {System.out.println("Heads: ");
          return 1;
         }
         
         else{ System.out.println("Tails: ");
         return 1;
         }
        
    }
    
    /**
     *
     * @return
     */
   
    
    public static boolean flip() {
       Random random = new Random();
       return random.nextBoolean();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a snew scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("1. Toss Coin ");
        System.out.println("2. Exit ");
        int number;
        int hcounts = 0;
        int tcounts = 0;
        
        while (true){
            // Prompt the user to enter the product number
            System.out.print("Choice: ");
             number = input.nextInt();

            if (number == 1) {
               // System.out.println("" + coinClass(number));
                if (flip()) { 
                   hcounts ++;
                }
                else tcounts++;
               
            } 
            else { 
                break;
            }
            //Display the results
        System.out.println("Heads: " + hcounts + ", Tails: " + tcounts);
        
            } 
        
       
       

}
}
