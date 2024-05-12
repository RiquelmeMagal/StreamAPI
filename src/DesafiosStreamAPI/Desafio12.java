package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrando o produto de todos os números da lista
        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        // O método reduce() é usado para reduzir os elementos da stream a um único valor.
        // No caso, estamos multiplicando todos os números da lista.
        // O primeiro argumento de reduce() é o valor inicial da multiplicação (1 neste caso).
        // O segundo argumento é uma função de redução que multiplica dois números (a * b).

        // Imprimindo o resultado
        System.out.println(produto);
    }
}

