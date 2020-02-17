import java.util.Scanner;

public class lab5pt2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int num1;

        num1 = num;

        if (num1%5 == 0 && num1%6 == 0){
            System.out.print("Is " + num + " divisible by 5 and 6? True ");
        }
        else{
            System.out.print("Is " + num + " divisible by 5 and 6? False ");
        }

        if (num1%5 == 0 || num1%6 ==0){
            System.out.print("Is " + num + " divisible by 5 or 6? True ");
        }
        else{
            System.out.print("Is " + num + " divisible by 5 or 6? False ");
        }

        if ((num1%5!=0 && num1%6==0) || (num1%5==0 && num1%6!=0)){
            System.out.print("Is "+ num + " divisible by 5 or 6, but not both? True ");
        }
        else{
            System.out.print("Is "+ num + " divisible by 5 or 6, but not both? False ");
        }
    }
}

