package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Desafio7 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrando o segundo maior número da lista
        Optional<Integer> segundoMaiorNumero = numeros.stream()
                .sorted(Comparator.reverseOrder()) // Ordenando os números em ordem decrescente
                .skip(1) // Pula o primeiro elemento, que é o maior número
                .findFirst(); // Encontra o próximo número, que será o segundo maior

        // Verificando se o segundo maior número foi encontrado e imprimindo o resultado
        if (segundoMaiorNumero.isPresent()) {
            System.out.println("O segundo maior número da lista é: " + segundoMaiorNumero.get());
        } else {
            System.out.println("Não foi possível encontrar o segundo maior número da lista.");
        }
    }
}
