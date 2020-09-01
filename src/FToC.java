import java.util.Scanner;

public class FToC {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double f, c;

        System.out.print("Enter a temperature in Fahrenheit: ");
        f = kb.nextDouble();

        c = (f-32) / 1.8;

        System.out.println();
        System.out.println(f +" degree Fahrenheit is equal to "+ c +" in Celsius");

    }
}
