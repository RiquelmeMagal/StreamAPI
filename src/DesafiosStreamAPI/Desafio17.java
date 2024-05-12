package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Filtrar números primos
        List<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17::ehPrimo)
                .toList();

        // Exibir o resultado no console
        System.out.println("Números primos: " + numerosPrimos);
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
