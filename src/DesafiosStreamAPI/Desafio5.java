package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Desafio5 {
    public static void main(String[] args) {

        // lista de numeros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // calculando a media dos numeros maiores que 5
        double mediaNumerosMaioresQueCinco = numeros.stream()
                .mapToDouble(Integer::doubleValue)
                .filter(n -> n > 5)
                .average()
                .orElseThrow(() -> new NoSuchElementException("Não foi possivel encontrar a média"));

        // imprimindo a media
        System.out.println(mediaNumerosMaioresQueCinco);
    }
}

