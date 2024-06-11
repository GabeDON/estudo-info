

import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, forneça o tamanho do array como argumento.");
            return;
        }

        int tamanho = Integer.parseInt(args[0]);
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            array[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Array não ordenado: ");
        for (int elemento : array) {
            System.out.println(elemento);
        }

        Arrays.sort(array);

        System.out.println("Array ordenado: ");
        for (int elemento : array) {
            System.out.println(elemento);
        }
    }
}
