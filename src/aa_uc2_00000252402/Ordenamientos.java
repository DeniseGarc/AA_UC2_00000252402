package aa_uc2_00000252402;

/**
 *
 * @author Alicia Denise García Acosta 00000252402
 */
public class Ordenamientos {

    /**
     * Implementa el algoritmo de ordenamiento de Burbuja para ordenar un
     * arreglo de enteros de menor a mayor.
     *
     * @param a Un arreglo de enteros a ordenar.
     * @return El arreglo ordenado en orden ascendente.
     *
     * Precondiciones: - El arreglo de entrada no debe ser nulo. - Puede
     * contener cualquier conjunto de enteros, incluidos valores repetidos.
     *
     * Postcondiciones: - El arreglo devuelto tendrá los mismos elementos que el
     * original, pero ordenados en orden ascendente.
     */
    public static int[] burbuja(int[] a) {
        for (int i = 1; i < a.length; i++) { // asignacion: 1 comparacion: n incremento: n-1  total = 2n
            for (int j = 0; j < a.length - i; j++) { // asignacion: n-1  comparacion: (n^2+n)/2 - 1 incrementos: (n^2-n)/2  total = n^2+n-2
                if (a[j] > a[j + 1]) { // comparacion (n^2-n)/2 
                    int aux = a[j]; // asignacion: (n^2-n)/2
                    a[j] = a[j + 1]; // asignacion: (n^2-n)/2
                    a[j + 1] = aux; // asignacion: (n^2-n)/2
                } // total interno: 2n^2 - 2n
            }
        }
        return a; // salida: 1
    }// total: 3n^2 + n - 1
    // Orden de crecimiento -> O(n^2)

    /**
     * Implementa el algoritmo de ordenamiento de Inserción para ordenar un
     * arreglo de enteros de menor a mayor.
     *
     * @param a Un arreglo de enteros a ordenar.
     * @return El arreglo ordenado en orden ascendente.
     *
     * Precondiciones: - El arreglo de entrada no debe ser nulo. - Puede
     * contener cualquier conjunto de enteros, incluidos valores repetidos.
     *
     * Postcondiciones: - El arreglo devuelto tendrá los mismos elementos que el
     * original, pero ordenados en orden ascendente.
     */
    public static int[] insercion(int[] a) {
        for (int i = 1; i < a.length; i++) { // asignacion: 1 comparacion: n incremento: n-1  total = 2n
            int valorActual = a[i]; // asignacion: n-1
            int j = i - 1; // (asignacion: 1 operacion: 1 )*n-1  total = 2n-2
            while (j >= 0 && a[j] > valorActual) { // comparacion: n^2 - 1 
                a[j + 1] = a[j]; // (operacion: 1 + asignacion: 1)*((n^2-n/2) total = n^2 - n
                j--; // operacion: (n^2-n)/2
            }
            a[j + 1] = valorActual; // (operacion: 1 asignacion: 1)*n-1  total = 2n-2
        }
        return a; // salida: 1
    } // total: 2n^2 + (n^2-n)/2 + 6n - 5
    // orden de crecimiento -> O(n^2)

    /**
     * Implementa el algoritmo de ordenamiento por Selección para ordenar un
     * arreglo de enteros de menor a mayor.
     *
     * @param a Un arreglo de enteros a ordenar.
     * @return El arreglo ordenado en orden ascendente.
     *
     * Precondiciones: - El arreglo de entrada no debe ser nulo. - Puede
     * contener cualquier conjunto de enteros, incluidos valores repetidos.
     *
     * Postcondiciones: - El arreglo devuelto tendrá los mismos elementos que el
     * original, pero ordenados en orden ascendente.
     */
    public static int[] seleccion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) { // asignacion: 1 comparacion: n incremento: n-1    total= 2n
            int minIndex = i; // asignacion: n-1
            for (int j = i + 1; j < a.length; j++) { //asignacion: n-1 comparacion: ((n^2+n)/2) - 1 incrementos: (n^2-n)/2 
                if (a[j] < a[minIndex]) { // comparaciones: (n^2-n)/2
                    minIndex = j; // asignaciones: (n^2-n)/2
                }
            }
            int aux = a[minIndex]; //asignacion: n-1
            a[minIndex] = a[i]; //asignacion: n-1
            a[i] = aux; //asignacion: n-1
        }
        return a; // salida: 1
    } // total: 2n^2 + 6n - 6
    // orden de crecimiento -> O(n^2)

    /**
     * Implementa el algoritmo de ordenamiento Quick Sort para ordenar un
     * arreglo de enteros de menor a mayor. Se basa en la estrategia de divide y
     * venceras, eligiendo un pivote y particionando el arreglo en dos partes:
     * una con elementos menores y otra con elementos mayores al pivote. Luego,
     * aplica recursivamente el mismo procedimiento a cada sublista.
     *
     * @param a Un arreglo de enteros a ordenar.
     * @param desde Índice inicial del subarreglo a ordenar.
     * @param hasta Índice final del subarreglo a ordenar.
     *
     * Precondiciones: - El arreglo de entrada no debe ser nulo. - Puede
     * contener cualquier conjunto de enteros, incluidos valores repetidos. -
     * Los índices "desde" y "hasta" deben estar dentro de los límites del
     * arreglo.
     *
     * Postcondiciones: - El arreglo original será modificado para quedar
     * ordenado en orden ascendente.
     */
    public static void quicksort(int[] a, int desde, int hasta) {
        if (desde < hasta) { // comparacion: 2n-1 
            int pivote = particionar(a, desde, hasta); // asignacion: n-1 
            // aplicar quick sort en la sublista izquierda
            quicksort(a, desde, pivote - 1);
            // aplicar quick sort en la sublista derecha
            quicksort(a, pivote + 1, hasta);
        }// total: 2n^2 + (3n^2 + 11n)/2 + n - 9
    }
    // orden de crecimiento peor de los casos -> O(n^2)
    // orden de crecimiento caso promedio -> O(n log n)

    /**
     * Realiza la partición de un subarreglo en torno a un pivote, moviendo los
     * elementos menores al pivote hacia la izquierda y los mayores hacia la
     * derecha. Luego, coloca el pivote en su posición final dentro del arreglo.
     *
     * @param a Un arreglo de enteros a particionar.
     * @param desde Índice inicial del subarreglo a particionar.
     * @param hasta Índice final del subarreglo a particionar (el pivote se
     * elige aquí).
     * @return La posición final del pivote en el arreglo después de la
     * partición.
     */
    private static int particionar(int[] a, int desde, int hasta) {
        // Se toma el último elemento como pivote
        int pivote = a[hasta]; // asignacion: n-1
        int i = desde - 1; // asignacion: n-1 
        for (int j = desde; j < hasta; j++) { //asignacion: n-1 comparacion: (n(n + 1)/2)-1 incremento (n(n - 1)/2)
            if (a[j] <= pivote) { // comparacion: (n(n - 1)/2)
                i++; // incremento: (n(n - 1)/2)
                int aux = a[j]; // asignacion: (n(n - 1)/2)
                a[j] = a[i]; // asignacion: (n(n - 1)/2)
                a[i] = aux; // asignacion: (n(n - 1)/2)
            }
        }
        // Se coloca el pivote en su posición correcta
        int temp = a[i + 1]; // asignacion: n-1
        a[i + 1] = a[hasta]; // asignacion: n-1
        a[hasta] = temp; // asignacion: n-1
        // Se devuelve la posición final del pivote
        return i + 1; // salida: n-1
    }
}
