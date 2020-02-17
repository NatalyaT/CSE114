import java.text.DecimalFormat; /*Importing all needed tools*/
import java.util.Scanner;
import java.math.*;

public class Lab4pt1 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in); /*Opening scanner for user input*/
        System.out.print("Enter a, b, c: ");/*The input is all on one line and separated by spaces*/

        double A = input1.nextDouble(); /*Declaring variables for equation*/
        double B = input1.nextDouble();
        double C = input1.nextDouble();

        double Dis; /*Declaring name of equation answer (Discriminant)*/
        Dis = (B*B) - (4*A*C);

        if (Dis > 0) { /*If the discriminant is greater than zero (positive) it has two roots*/
            double R1 = (-B + Math.pow(Dis, 0.5)) / 2*A;
            double R2 = (-B - Math.pow(Dis, 0.5)) / 2*A;
            DecimalFormat format1 = new DecimalFormat("##.000000"); /*Format for 6 zeros*/
            DecimalFormat format2 = new DecimalFormat("##.00000"); /*Format for 5 zeros*/
            System.out.print("The equation has 2 roots " + format1.format(R1) + " and " + format2.format(R2));
        }
        else if (Dis == 0){ /*If the discriminant is equal to zero it has one root*/
            double R1 = (-B - Math.pow(Dis, 0.5)) / 2*A;
            DecimalFormat format = new DecimalFormat("##.000000"); /*Format for 6 zeros*/
            System.out.print("The equation has 1 root " + format.format(R1));
        }
        else{ /*If discriminant is less than zero (negative) there are no real roots*/
            System.out.print("The Equation has no real roots.");
        }

        input1.close(); /*Close scanner*/
    }
}
