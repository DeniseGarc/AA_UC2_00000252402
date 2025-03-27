/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aa_uc2_00000252402;

/**
 *
 * @author Alicia Denise García Acosta 00000252402
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {3, 2, 1};
        System.out.print("Arreglo desordenado: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        Ordenamientos.quicksort(a, 0, a.length - 1);
        System.out.println("");
        System.out.print("Arreglo ordenado: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
