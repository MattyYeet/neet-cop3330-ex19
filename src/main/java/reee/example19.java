package reee;

import java.util.Formatter;
import java.util.Scanner;

public class example19 {
    public static void main(String[] args){
        double height, weight;
        double bmi;
        Scanner input = new Scanner(System.in);
        System.out.print("How much do you weigh? ");
        weight = input.nextInt();
        System.out.print("How tall are you in inches? ");
        height = input.nextInt();
        bmi = (weight / (height * height)) * 703;
        Formatter fmt = new Formatter();
        fmt.format("%.1f", bmi);
        System.out.println("Your bmi is "+fmt+".");
        if(bmi >= 25)
        {
            System.out.println("You are overweight.");
        }
        if(bmi <= 18.5)
        {
            System.out.println("You are underweight.");
        }
        if(bmi >= 18.5 && bmi <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
    }
}
