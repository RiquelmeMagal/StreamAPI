package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        // Criando a lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12);

        // Filtrando os números maiores que 10 e armazenando-os em uma nova lista
        List<Integer> numerosMaioresQueDez = numeros.stream().filter(n -> n > 10).toList();

        // Verificando se a lista contém algum número maior que 10
        boolean contemNumerosMaioresQueDez = numeros.stream().anyMatch(n -> n > 10);

        // Imprimindo o resultado
        if (contemNumerosMaioresQueDez) {
            // Se a lista contiver números maiores que 10, imprime os números
            System.out.println("Lista de numeros maiores que 10: " + numerosMaioresQueDez);
        } else {
            // Se a lista não contiver números maiores que 10, imprime uma mensagem indicando isso
            System.out.println("Não há numeros maiores que 10.");
        }
    }
}
