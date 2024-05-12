package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        // Filtrar números pares e ímpares
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        // Imprimir os resultados
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números ímpares: " + numerosImpares);
    }
}
