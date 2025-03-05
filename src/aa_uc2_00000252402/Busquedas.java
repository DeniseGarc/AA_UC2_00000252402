/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aa_uc2_00000252402;

/**
 *
 * @author Alici
 */
public class Busquedas {

    /**
     * Método que ordena un arreglo de enteros de menor a mayor.
     *
     * @param a arreglo de enteros
     * @return arreglo de enteros ordenado de menor a mayor
     */
    public static int[] burbuja(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        return a;
    }

}
