import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        double StaVel;
        double acel;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter starting velocity (in meters per second): ");
        StaVel = input1.nextDouble();

        double EndVel;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter end Velocity (in meters per second): ");
        EndVel = input2.nextDouble();

        double Time;
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the time (in seconds): ");
        Time = input3.nextDouble();

        acel = (EndVel - StaVel)/Time;
        DecimalFormat format = new DecimalFormat("###.0000");
        System.out.print("The average acceleration is " + format.format(acel));
        input1.close();
        input2.close();
        input3.close();
    }
}
