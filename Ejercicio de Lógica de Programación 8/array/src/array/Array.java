package array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, primosTotal = 0, numerosFaltantes = 0;

        int[] numerosArray = new int[10];
        int[] numerosPrimos = new int[10];
        int[] numerosRestantes = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese el " + (i + 1) + " número: ");
            numerosArray[i] = sc.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (numerosArray[i] <= 1 || (numerosArray[i] % 2 == 0 && numerosArray[i] != 2)) {
                numerosRestantes[numerosFaltantes] = numerosArray[i];
                numerosFaltantes++;
            } else {
                boolean esPrimo = true;
                for (j = 2; j < numerosArray[i] / 2; j++) {
                    if (numerosArray[i] % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    numerosPrimos[primosTotal] = numerosArray[i];
                    primosTotal++;
                } else {
                    numerosRestantes[numerosFaltantes] = numerosArray[i];
                    numerosFaltantes++;
                }
            }
        }

        System.out.println("Array original: ");
        for (i = 0; i < 10; i++) {
            System.out.println("pos [" + i + "] = " + numerosArray[i]);
        }

        System.out.println("Array Ordenado: ");
        for (i = 0; i < primosTotal; i++) {
            System.out.println("pos [" + i + "] = " + numerosPrimos[i]);
        }

        for (i = 0; i < numerosFaltantes; i++) {
            System.out.println("pos [" + (i + primosTotal) + "] = " + numerosRestantes[i]);
        }
        
        sc.close();
    }
}
