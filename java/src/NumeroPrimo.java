import java.util.Scanner;

public class NumeroPrimo {

    static boolean verificaPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void numeroPrimo() {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = input.nextInt();

        if (verificaPrimo(n) == true) {

            System.out.println(n + " eh primo");
        } else {
            System.out.println(n + " nao eh primo");
        }
    }
}
