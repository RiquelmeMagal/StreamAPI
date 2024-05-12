package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        // Encontrando a soma dos quadrados de todos os números da lista
        int somaDosQuadrados = numeros.stream()
                .mapToInt(x -> x * x) // Mapeia cada número para o seu quadrado
                .sum(); // Encontra a soma dos quadrados

        // Imprimindo o resultado
        System.out.println("Soma dos quadrados dos numeros: " + somaDosQuadrados);
    }
}
