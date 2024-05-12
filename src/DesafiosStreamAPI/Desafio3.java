package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {

        // Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -1, -2);

        // Filtrando se há algum numero negativo
        List<Integer> numerosNegativos = numeros.stream().filter(n -> n < 0).toList();

        // Verificando se TODOS os numeros são positivos, returna um boolean
        boolean ehPositivo = numeros.stream().allMatch(n -> n > 0);

        // Condição que diz se tudo é positivo ou há algum negativo.
        if (ehPositivo) {
            System.out.println("Todos os números são positivos");
        } else {
            System.out.println("Nem todos os numeros são positivos: " + numerosNegativos);
        }

    }
}
