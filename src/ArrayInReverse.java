import java.util.Scanner;

public class ArrayInReverse {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int [] array = new int [5];

        System.out.print("Enter 5 integers: ");
        array[0] = kb.nextInt();
        array[1] = kb.nextInt();
        array[2] = kb.nextInt();
        array[3] = kb.nextInt();
        array[4] = kb.nextInt();

        System.out.println();
        for (int i=4; i >= 0; i--) {
            System.out.print(array[i]);
            System.out.print(" ");
        }



    }
}
