import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab3pt2 {
    public static void main(String[] args){
        double QVal; /*Declaring first and last variable*/
        double WeightoWater;

        Scanner input2 = new Scanner(System.in); /*Making input for Water weight in lines 9-11*/
        System.out.print("Enter the amount of water in Kilograms: ");
        WeightoWater = input2.nextDouble();

        double StaTemp; /*Declaring second variable. The making of the input for start temp in lines 14-16*/
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the initial Temperature in Celsius: ");
        StaTemp = input1.nextDouble();

        double EndTemp;/*Declaring third variable. The making of the input for end temp in lines 19-21*/
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the Final Temperature in Celsius: ");
        EndTemp = input3.nextDouble();

        QVal = WeightoWater * (EndTemp - StaTemp) * 4184;/*Mathmatical Equation*/
        DecimalFormat format = new DecimalFormat("###.0");/*Rounding the answer to one decimal place*/
        System.out.print("The energy needed is " + QVal + " Joules"); /*Answer with sentence*/

        input1.close(); /*Closing Scanners*/
        input2.close();
        input3.close();
    }
}
