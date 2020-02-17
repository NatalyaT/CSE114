import java.util.Scanner;
import java.text.DecimalFormat;

public class lab3 {
    public static void main(String[] args){
        double Celsius; /*Declaring Variables*/
        double Fahren;
        Scanner input1 = new Scanner(System.in); /*Making the input for celsius in lines 8 - 10*/
        System.out.print("Enter the Celsius Value: ");
        Celsius = input1.nextDouble();

        Fahren = (9.0/5) * Celsius + 32; /*Conversion Equation*/
        DecimalFormat format = new DecimalFormat("###.0"); /*Making result round to one decimal point*/
        System.out.print(Celsius + " Celsius is " + Fahren + " Fahrenheit"); /*Print output with sentence*/

        input1.close();/*Closing Scanner*/
    }

}
