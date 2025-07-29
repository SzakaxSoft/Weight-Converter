import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Weigth Conversion program");

        System.out.println("1) Lbs to Kgs");
        System.out.println("2) Kgs to Lbs");

        Scanner weightInput = new Scanner(System.in);
        System.out.print("Choose an option: ");
        double weight = weightInput.nextDouble();

        if (weight == 1) {
            Scanner lbsToKgs = new Scanner(System.in);
            System.out.print("Enter the Lbs: ");
            double num = lbsToKgs.nextDouble();
            double result = num * 0.45359237;
            System.out.println(result);
        } else if (weight == 2) {
            Scanner kgsToLbs = new Scanner(System.in);
            System.out.print("Enter the Kgs: ");
            double num1 = kgsToLbs.nextDouble();
            double result1 = num1 * 2.20462262;
            System.out.println(result1);
        } else {
            System.out.println("Please select a valid number");
        }
    }
}