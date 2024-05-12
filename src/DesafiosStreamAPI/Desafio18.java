package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 1, 1, 1, 1, 1, 1);

        // Verificar se todos os números são iguais
        boolean todosIguais = numeros.stream()
                .distinct()
                .count() == 1;

        // Exibir o resultado no console
        if (todosIguais) {
            System.out.println("Todos os números são iguais.");
        } else {
            System.out.println("Os números não são todos iguais.");
        }
    }
}
