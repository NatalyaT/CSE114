import java.util.Scanner;

public class lab1 {
    public static void main(String [] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = input.nextDouble();
        area = 3.14 * radius * radius;
        System.out.print("The Area of the Circle is " + area);
        input.close();
    }
}
