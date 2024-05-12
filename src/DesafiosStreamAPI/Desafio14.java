package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;


public class Desafio14 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        // Encontrar o maior número primo
        int maiorNumeroPrimo = numeros.stream()
                .filter(Desafio14::ehPrimo) // Filtra apenas os números primos
                .mapToInt(Integer::intValue) // Converte para IntStream
                .max() // Encontra o maior número
                .orElse(0); // Se não houver número primo, retorna 0

        // Imprimir o resultado
        System.out.println("Maior número primo: " + maiorNumeroPrimo);
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

