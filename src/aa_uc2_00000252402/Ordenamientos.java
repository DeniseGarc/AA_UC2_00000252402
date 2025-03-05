/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

}
