package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calculando a soma de todos os números usando a Stream API
        int somaDeTodosOsNumeros = numeros.stream().reduce(0, Integer::sum);
        // O método reduce() é usado para reduzir os elementos da stream a um único valor.
        // No caso, estamos somando todos os números na lista.
        // O primeiro argumento de reduce() é o valor inicial da soma (0 neste caso).
        // O segundo argumento é uma função de redução que adiciona dois números (Integer::sum).

        // Imprimindo a soma de todos os números
        System.out.println(somaDeTodosOsNumeros);
    }
}
