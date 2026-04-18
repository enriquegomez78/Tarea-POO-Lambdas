# Tarea POO: Utilidades de Colecciones con Lambdas y Streams

## Descripción del Proyecto
Este repositorio contiene la solución a la tarea de Programación Orientada a Objetos. Consiste en dos clases utilitarias (`OperacionesNumeros` y `OperacionesCadenas`) que demuestran el uso de métodos funcionales avanzados en Java para manipular colecciones de datos (`ArrayList`, `HashSet`, `HashMap`). 

Se implementan expresiones Lambda, la API de Streams y métodos nativos de las colecciones, garantizando el manejo de casos extremos como listas vacías y valores nulos.

## Lista de Métodos Implementados

1. **El Multiplicador**: Multiplica elementos de una lista por un factor usando `replaceAll()`.
2. **El Filtro Selectivo**: Elimina cadenas por letra inicial o longitud usando `removeIf()`.
3. **Conversor de Mayúsculas**: Transforma cadenas a mayúsculas usando `Stream` y `map()`.
4. **Cuadrados Únicos**: Filtra pares, los eleva al cuadrado y devuelve un `HashSet`.
5. **Mapa de Longitudes**: Crea un mapa palabra-longitud con `Collectors.toMap()`.
6. **Modificador de Inventario**: Imprime precios con 10% de descuento usando `forEach`.
7. **Contador de Frecuencias**: Cuenta apariciones de palabras usando `merge()`.
8. **Clasificador de Palabras**: Filtra palabras por umbral de frecuencia mínima.
9. **Deduplicación de Palabras**: Procesa frases, filtra por longitud y elimina duplicados.
10. **El Tope de Frecuencias**: Limita los valores de frecuencia a un máximo N usando `replaceAll()`.

## Instrucciones de Ejecución

1. Clona este repositorio.
2. Compila los archivos: `javac *.java`.
3. Ejecuta la clase de pruebas: `java Main`.

## Autor
Luis Enrique Gomez Maynez 
