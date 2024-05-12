package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        //Lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Ordenação de numeros
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        //Imprimindo numeros ordenados
        System.out.println(numerosOrdenados);
    }
}
