package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class Desafia4 {
    public static void main(String[] args) {
        // lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // removendo numeros impares
        numeros = numeros.stream().filter(x -> x % 2 ==0).sorted().toList();

        // imprimindo a lista
        System.out.println("Numeros pares: " + numeros);
    }
}
