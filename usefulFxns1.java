
/**Small program that greets and calculate's a user's age
 * to show examples of some useful functions
 */

import java.util.Scanner;


class start{

    static void nameAns(){ //new method, only runs when called upon
        Scanner question = new Scanner(System.in); //creates a new input called question
        System.out.println("whats your name"); //prints command for user
        String name = question.nextLine(); //creates a variable string called name, stores input, and reads the input to the variable
        System.out.println("nice to meet you, " + name); //prints the read value 
     }
    
     static void ageAns(){
         Scanner question = new Scanner(System.in); //"question" variable is local to the method 
         System.out.print("how old are you?");
         String moe = question.nextLine(); //read user input and store 
         try {//continuous function 
             Integer.parseInt(moe);//Integer is parent class, parseint() stores variable as an integer value, checks to see if it is a valid int value
             System.out.println(moe + " is a valid int");//continues program if user input passes protocols
         } catch(NumberFormatException e) { //NumberFormatException will pause the try function if the user input is not a valid integer
             System.out.print("not an int"); //prompt user
             ageAns(); //restart the method so the user can do it again
         }
         int calc = Integer.parseInt(moe);//assign the numerical value of the input to variable calc
         int dis1 = calc * 365; //assigns dis1 to dis1 * 365 to calculate days lived
         System.out.print("You are" + dis1 + "days old");//give user calculations
     }
    public static void main(String[] args) { //main() runs the code, this is all executed
        nameAns();
        ageAns();  
    }
}