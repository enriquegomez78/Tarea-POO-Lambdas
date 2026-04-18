import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class OperacionesCadenas {


     //2. El Filtro Selectivo

    public static void filtroSelectivo(ArrayList<String> lista, char letra, int n) {
        if (lista == null) return;
        String prefijo = String.valueOf(letra);
        lista.removeIf(s -> s == null || s.startsWith(prefijo) || s.length() < n);
    }


     //3. Conversor de Mayúsculas

    public static ArrayList<String> conversorMayusculas(ArrayList<String> lista) {
        if (lista == null) return new ArrayList<>();
        return lista.stream()
                .map(s -> s == null ? null : s.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
    }


     //5. Mapa de Longitudes

    public static HashMap<String, Integer> mapaDeLongitudes(ArrayList<String> palabras) {
        if (palabras == null) return new HashMap<>();
        return palabras.stream()
                .filter(p -> p != null)
                .collect(Collectors.toMap(p -> p, String::length, (e, n) -> e, HashMap::new));
    }


     //6. Modificador de Inventario

    public static void modificadorInventario(HashMap<String, Double> inventario) {
        if (inventario == null || inventario.isEmpty()) {
            System.out.println("El inventario está vacío o es nulo.");
            return;
        }
        System.out.println("--- Catálogo con 10% de Descuento ---");
        inventario.forEach((producto, precio) -> {
            if (producto != null && precio != null) {
                System.out.printf("Producto: %s | Precio Promoción: $%.2f%n", producto, precio * 0.90);
            }
        });
    }


     // 7. Contador de Frecuencias

    public static HashMap<String, Integer> contadorFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> frecuencias = new HashMap<>();
        if (palabras == null) return frecuencias;
        for (String palabra : palabras) {
            if (palabra != null) frecuencias.merge(palabra, 1, Integer::sum);
        }
        return frecuencias;
    }


     // 8. Clasificador de Palabras

    public static ArrayList<String> clasificadorPalabras(HashMap<String, Integer> frecuencias, int frecuenciaMinima) {
        if (frecuencias == null) return new ArrayList<>();
        return frecuencias.entrySet().stream()
                .filter(entry -> entry.getValue() != null && entry.getValue() >= frecuenciaMinima)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }


     // 9. Deduplicación de Palabras

    public static HashSet<String> deduplicacionPalabras(String frase, int longitudMinima) {
        if (frase == null || frase.trim().isEmpty()) return new HashSet<>();
        return Arrays.stream(frase.split("\\s+"))
                .filter(w -> w.length() >= longitudMinima)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }


    // 10. El Tope de Frecuencias

    public static void topeFrecuencias(HashMap<String, Integer> frecuencias, int topeN) {
        if (frecuencias == null) return;
        frecuencias.replaceAll((palabra, frec) -> (frec != null && frec > topeN) ? topeN : frec);
    }
}
