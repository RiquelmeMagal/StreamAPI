package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Variavel que armazena a soma dos numeros pares
        int somaDosNnumerosPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2);

        // Valor total da soma dos numeros pares
        System.out.println("Soma dos numeros pares" + somaDosNnumerosPares);
    }
}
