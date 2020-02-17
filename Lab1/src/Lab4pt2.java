import java.util.Scanner;

public class Lab4pt2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);/*Opening scanner for user input*/
        System.out.print("Enter the package weight in pounds: ");
        int w = input.nextInt(); /*Declaring variable for input comaparison*/

        if (w>0 && w<=1){ /*The provided values from function for cost of shipping based on weight*/
            System.out.print("The cost of shipping is $ 3.5. ");
        }
        else if (1<w && w<=3){
            System.out.print("The cost of shipping is $ 5.5. ");
        }
        else if (3<w && w<=10){
            System.out.print("The cost of shipping is $ 8.5 ");
        }
        else if (10<w && w<=20){
            System.out.print("The cost of shipping is $ 10.5 ");
        }
        else if (w>20){
            System.out.print("This package cannot be shipped. "); /*If package is over 20 pounds it cannot be shipped*/
        }
        else{
            System.out.print("Invalid input"); /*If negative or zero its invalid as a input*/
        }

        input.close(); /*Close scanner*/
    }
}
