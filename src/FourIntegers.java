import java.util.Scanner;

public class FourIntegers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Please enter FOUR integers: ");
        a = kb.nextInt();
        b = kb.nextInt();
        c = kb.nextInt();
        d = kb.nextInt();
        System.out.println();

        if (a==b) {
            if (b==c) {
                if (c==d) {
                    System.out.println("All four numbers are equal");
                    System.exit(0);
                }
            }
        }
        System.out.println("All four numbers are NOT equal");

    }
}
