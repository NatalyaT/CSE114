import java.util.Scanner;

public class Lab5p1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive, three digit number: ");
        int num = input.nextInt();
        int num1;
        int num2;

        num1 = num/100;
        num2 = num%10;

        if (num < 0){
            System.out.print("Please enter a POSITIVE three digit number ");
        }
        else if (num1 == num2){
            System.out.print(num + " is a palindrome.");
        }
        else{
            System.out.print(num + " is not a palindrome.");
        }
    }
}
