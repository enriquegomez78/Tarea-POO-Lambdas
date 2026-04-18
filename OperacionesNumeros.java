import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class OperacionesNumeros {


     // 1. El Multiplicador: Multiplica cada número de la lista por el factor dado usando replaceAll() y lambda.

    public static void multiplicarLista(ArrayList<Integer> lista, int factor) {
        if (lista == null) return;
        lista.replaceAll(n -> n == null ? null : n * factor);
    }


     // 4. Cuadrados Únicos Filtra los pares, los eleva al cuadrado y los guarda en un HashSet.

    public static HashSet<Integer> cuadradosUnicos(ArrayList<Integer> lista) {
        if (lista == null) return new HashSet<>();

        Set<Integer> resultado = lista.stream()
                .filter(n -> n != null && n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toSet());

        return new HashSet<>(resultado);
    }
}
