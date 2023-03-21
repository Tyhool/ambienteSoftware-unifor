import java.util.Scanner;

public class Fibonacci {

    public void sequenciaFibonacci() {
        int n, a = 0, b = 1, i = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Numeros de termos: ");
        n = input.nextInt();
        while (i < n) {
            System.out.print(a + ", " + b + ", ");
            a = a + b;
            b = a + b;
            i = i + 2;
        }
        if (i == n) {
            System.out.print(a + ", " + b);
        } else {
            System.out.println(a);
            System.out.println("feito no VScode");
        }
    }
}
