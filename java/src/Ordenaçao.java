import java.util.Scanner;

public class Ordenaçao {

    int particao(int a[], int baixo, int alto) {
        int pivo = a[alto];
        int i = (baixo - 1);
        for (int j = baixo; j < alto; j++) {
            if (a[j] < pivo) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[alto];
        a[alto] = temp;

        return i + 1;
    }

    void quicksort(int a[], int baixo, int alto) {
        if (baixo < alto) {
            int parte = particao(a, baixo, alto);
            quicksort(a, baixo, parte - 1);
            quicksort(a, parte + 1, alto);
        }
    }

    public void ordenacao() {
        Scanner input = new Scanner(System.in);
        int a[], i;
        System.out.println("Entrada do tamanho da lista:");
        int tamanho = input.nextInt();
        a = new int[tamanho];

        System.out.println("Entrada dos elementos da lista: ");
        for (i = 0; i < tamanho; i++) {
            a[i] = input.nextInt();
        }
        Ordenaçao obj = new Ordenaçao();
        obj.quicksort(a, 0, tamanho - 1);

        System.out.println("A ordenaçao dos elementos eh: ");
        for (i = 0; i < tamanho; i++) {
            System.out.print(a[i] + " ");
        }

    }
}