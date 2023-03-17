import java.util.Scanner;

public class Contagem {

    // public void contagem() {

    // int Array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, -50 };
    // int tamanhoDoArray = 0;
    // tamanhoDoArray = Array.length;
    // System.out.println("O tamanho da lista eh: " + tamanhoDoArray);
    // --------------------------------------------
    // double numero = 5.5;
    // if(numero != (int) numero)
    // {
    // System.out.println("Tem ponto flutuante");
    // }
    // }
    public void contagem() {
        Scanner input = new Scanner(System.in);
        int n, contadorInt = 0, contadorFlo = 0, i = 0, aux;
        float valor;
        System.out.println("Informe a quantidade de elementos:");
        n = input.nextInt();

        while (i < n) {
            valor = input.nextFloat();
            aux = (int) valor;
            if (aux == valor) {
                contadorInt = contadorInt + 1;
            } else {
                contadorFlo = contadorFlo + 1;
            }
            i = i + 1;
        }

        System.out.println("Numeros que são inteiros são: " + contadorInt);
        System.out.println("Numeros que não são inteiros são: " + contadorFlo);
    }
}