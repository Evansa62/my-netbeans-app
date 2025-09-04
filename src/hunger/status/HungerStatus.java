/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hunger.status;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class HungerStatus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner hunger = new Scanner(System.in);
       
     
        System.out.println("Hi there what is your name"); 
        String name = hunger.nextLine();
        
        System.out.println("Hey " + name + "what is your favourite meal");
        
        System.out.println("Hi " + name + " are you hungry? (yes/no)");
        String hungry = hunger.nextLine().toLowerCase();//priming input
        
        while (hungry.equals("Yes")){
            System.out.println("you can take another bite of" + favMeal);
        
            System.out.println(name + "are you still hungry");
            
            hungry = hunger.nextLine().toLowerCase();//updating the priming input
            
        }
            
         while (hungry.equals("yes") && !hungry.equals("No")){
            System.out.println("Please select either Yes or No");
             System.out.println("Hi " + name + " are you hungry? (Yes/No)");
            System.out.println("you can take another bite of meal + favMeal");
            hungry = hunger.nextLine().toLowerCase(); 
         } 
            
        
        System.out.println("Greet! you are now full");
        hunger.close();
    }     
         
