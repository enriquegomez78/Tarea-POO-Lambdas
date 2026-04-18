import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("   PRUEBAS DE OPERACIONES CON NÚMEROS    ");
        System.out.println("=========================================");

        // 1. El Multiplicador
        System.out.println("\n--- 1. El Multiplicador ---");
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Antes: " + numeros);
        OperacionesNumeros.multiplicarLista(numeros, 10);
        System.out.println("Después (Factor 10): " + numeros);

        // 4. Cuadrados Únicos
        System.out.println("\n--- 4. Cuadrados Únicos ---");
        ArrayList<Integer> conDuplicados = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 4, 5, 6, 7));
        System.out.println("Original con duplicados: " + conDuplicados);
        HashSet<Integer> cuadrados = OperacionesNumeros.cuadradosUnicos(conDuplicados);
        System.out.println("HashSet resultante (pares al cuadrado): " + cuadrados);

        System.out.println("\n=========================================");
        System.out.println("   PRUEBAS DE OPERACIONES CON CADENAS    ");
        System.out.println("=========================================");

        // 2. El Filtro Selectivo
        System.out.println("\n--- 2. El Filtro Selectivo ---");
        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("manzana", "pera", "uva", "platano", "melon"));
        System.out.println("Antes: " + palabras);
        OperacionesCadenas.filtroSelectivo(palabras, 'm', 4);
        System.out.println("Después (sin 'm' y long >= 4): " + palabras);

        // 3. Conversor de Mayúsculas
        System.out.println("\n--- 3. Conversor de Mayúsculas ---");
        ArrayList<String> listaMinusculas = new ArrayList<>(Arrays.asList("java", "poo", "streams"));
        System.out.println("Antes: " + listaMinusculas);
        System.out.println("Después (Mayúsculas): " + OperacionesCadenas.conversorMayusculas(listaMinusculas));

        // 5. Mapa de Longitudes
        System.out.println("\n--- 5. Mapa de Longitudes ---");
        ArrayList<String> listaPalabras = new ArrayList<>(Arrays.asList("java", "programacion", "poo", "java"));
        System.out.println("Lista: " + listaPalabras);
        System.out.println("Mapa resultante: " + OperacionesCadenas.mapaDeLongitudes(listaPalabras));

        // 6. Modificador de Inventario
        System.out.println("\n--- 6. Modificador de Inventario ---");
        HashMap<String, Double> inventario = new HashMap<>();
        inventario.put("Laptop", 1000.0);
        inventario.put("Mouse", 25.50);
        inventario.put("Teclado", null); // Edge case
        OperacionesCadenas.modificadorInventario(inventario);

        // 7. Contador de Frecuencias
        System.out.println("\n--- 7. Contador de Frecuencias ---");
        ArrayList<String> repetidas = new ArrayList<>(Arrays.asList("Luis", "Cecilia", "Enrique", "Cecilia", "Luis", "Luis"));
        HashMap<String, Integer> mapaFrecuencias = OperacionesCadenas.contadorFrecuencias(repetidas);
        System.out.println("Palabras: " + repetidas);
        System.out.println("Frecuencias: " + mapaFrecuencias);

        // 8. Clasificador de Palabras
        System.out.println("\n--- 8. Clasificador de Palabras ---");
        System.out.println("Frecuencias originales: " + mapaFrecuencias);
        System.out.println("Palabras con frecuencia >= 2: " + OperacionesCadenas.clasificadorPalabras(mapaFrecuencias, 2));

        // 9. Deduplicación de Palabras
        System.out.println("\n--- 9. Deduplicación de Palabras ---");
        String frase = "El carro va muy rapido y el carro suena muy fuerte";
        System.out.println("Frase original: " + frase);
        System.out.println("HashSet (>= 3 letras, sin duplicados): " + OperacionesCadenas.deduplicacionPalabras(frase, 4));

        // 10. El Tope de Frecuencias
        System.out.println("\n--- 10. El Tope de Frecuencias ---");
        System.out.println("Frecuencias antes del tope: " + mapaFrecuencias);
        OperacionesCadenas.topeFrecuencias(mapaFrecuencias, 2);
        System.out.println("Frecuencias después del tope (Max 2): " + mapaFrecuencias);
    }
}

