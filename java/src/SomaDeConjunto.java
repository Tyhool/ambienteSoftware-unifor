import java.util.Scanner;

public class SomaDeConjunto {

    public void somaDeConjunto() {
        Scanner input = new Scanner(System.in);
        int n, num, soma = 0, i = 0;
        System.out.println("Quantos numeros a serem somados:");
        n = input.nextInt();
        while (i < n) {
            i = i + 1;
            System.out.println("Entre com o " + i + " numero");
            num = input.nextInt();
            soma = soma + num;
        }
        System.out.println("A soma da: " + soma);
    }
}
