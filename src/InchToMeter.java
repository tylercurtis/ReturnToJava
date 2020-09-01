import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);

        double in, m;

        System.out.print("Enter a distance in inches: ");
        in = kb.nextDouble();

        m = in * 0.0254;

        System.out.println();
        System.out.print(in +" inches is equal to "+ m +" meters.");




    }
}
