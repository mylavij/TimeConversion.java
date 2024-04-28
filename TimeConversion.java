/*******
 * Name: Myla Vijayan
 * Date: 3-7-24
 */

 import java.util.*;

 public class TimeConversion{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        int initalMinutes = input.nextInt();

        int minutes = (initalMinutes%60);
        int hours = (initalMinutes - minutes)/60;

        if (minutes < 10)
        {
            System.out.println("The time is: " + hours + ":0" + minutes);
        }
        else
        {
            System.out.println("The time is: " + hours + ":" + minutes);
        }
        
        input.close();

    }
 }