package FunctionalInterface.Supplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> audacious = () -> "Olá seja bem-vindo(a)";

        List<String> listAudacious = Stream.generate(audacious)
                .limit(5)
                .toList();

        listAudacious.forEach(System.out::println);
    }
}
