package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificando se todos os números são distintos
        boolean numerosSemDistincao = numeros.stream().distinct().count() == numeros.size();
        // O método distinct() garante que apenas valores distintos permaneçam na stream.
        // Em seguida, contamos quantos elementos distintos existem na stream e comparamos com o tamanho da lista original.
        // Se o número de elementos distintos for igual ao tamanho da lista original, significa que todos os números são distintos.

        // Imprimindo o resultado
        if (numerosSemDistincao) {
            System.out.println("Todos os números na lista são distintos.");
        } else {
            System.out.println("Há numeros repetidos.");
        }
    }
}

