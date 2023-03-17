import java.util.Scanner;

public class MDC {
    public void calculaMDC() {
        int a = 0, b = 0, resto = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro numero");
        a = input.nextInt();
        System.out.println("Segundo numero");
        b = input.nextInt();

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        System.out.println("O MDC eh: " + a);
    }
}