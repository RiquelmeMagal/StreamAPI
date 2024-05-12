package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(p -> p.length() > 5)
                .forEach(System.out::println);

        PredicateExample exemplo = new PredicateExample();
        exemplo.maisDeCinco(palavras);
    }

    final void maisDeCinco(List<String> listaDePalavras) {
        for (String palavra : listaDePalavras) {
            if (palavra.length() > 5) {
                System.out.println(palavra);
            }
        }
    }
}
