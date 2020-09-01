import java.util.Scanner;

public class ArrayInReverseMethod {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int [] array = new int [5];

        System.out.print("Enter 5 integers: ");
        array[0] = kb.nextInt();
        array[1] = kb.nextInt();
        array[2] = kb.nextInt();
        array[3] = kb.nextInt();
        array[4] = kb.nextInt();

        method(array);

        for(int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void method(int [] array) {
        int a,b,d,e;
        a = array[0];
        b = array[1];
        d = array[3];
        e = array[4];

        array[0] = e;
        array[1] = d;
        array[3] = b;
        array[4] = a;

    }
}
