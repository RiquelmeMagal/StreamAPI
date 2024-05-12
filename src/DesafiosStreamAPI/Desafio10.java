package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        // Filtrando os valores ímpares múltiplos de 3 ou de 5
        List<Integer> numerosDivisieisPor3e5 = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra apenas números ímpares
                .filter(n -> (n % 3 == 0 || n % 5 == 0)) // Filtra apenas números divisíveis por 3 ou por 5
                .toList();

        // Imprimindo o resultado
        System.out.println(numerosDivisieisPor3e5);
    }
}
