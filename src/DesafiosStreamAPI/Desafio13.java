package DesafiosStreamAPI;
import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Definindo o intervalo
        int inicioIntervalo = 5;
        int fimIntervalo = 10;

        // Filtrando os números que estão dentro do intervalo
        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(n -> n >= inicioIntervalo && n <= fimIntervalo)
                .toList();

        // Imprimindo o resultado
        System.out.println("Números no intervalo [" + inicioIntervalo + ", " + fimIntervalo + "]: " + numerosNoIntervalo);
    }
}
