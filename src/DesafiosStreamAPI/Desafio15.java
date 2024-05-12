package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        // Verifica se a lista contém pelo menos um número negativo
        boolean temNumeroNegativo = numeros.stream().anyMatch(n -> n < 0);

        // Se houver número(s) negativo(s), imprime a lista de números negativos
        if (temNumeroNegativo) {
            // Filtra os números negativos
            List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0).toList();
            System.out.println("Números negativos na lista: " + numerosNegativos);
        } else {
            // Se não houver número(s) negativo(s), imprime uma mensagem
            System.out.println("Não há números negativos na lista.");
        }
    }
}
