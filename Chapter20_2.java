/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                         Chapter 20: Problem 2                                            *****
 *****__________________________________________________________________________________________________________*****
 *****                               2. Repeat #1 except using a PriorityQueue.                                 *****
 *****                             There is no sort method for the PriorityQueue,                               *****
 *****            but this is not needed since the PriorityQueue will return the items in sorted order.         *****
 *****                   Use the same input that you used in #1 to prove that it worked correctly.              *****
 *****__________________________________________________________________________________________________________*****
 *****   1. Write a program which inputs Strings from the user via a Scanner and stores them in a LinkedList.   *****
 *****   Next, sort the LinkedList using the Collections.sort and output the resulting Strings one at a time.   *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import java.util.PriorityQueue;
import java.util.Scanner;


public class Chapter20_2 {


    public static void main(String[] args) {

        // LOCAL VARIABLE(s) declaration(s)
        PriorityQueue<String> pq = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);
        int counter = 0;

        String current = "";

        System.out.println("Enter Strings (one at a time, hitting \"Enter\" after each String), " +
                "type \"quit\" to quit: ");

        while(!current.equalsIgnoreCase("quit")){
            counter++;
            System.out.print("String #" + counter + ": ");
            current = input.nextLine().toLowerCase();

            if(current.equalsIgnoreCase("quit")){
                System.out.println("Thank you for entering Strings, they will next print in alphabetical order.");
            } else{
                pq.add(current);
            }
        }

       for(int i = 0; i < (counter-1); i++){
           System.out.println("String #" + (i+1) + " = " + pq.poll());
       }
    }
}
