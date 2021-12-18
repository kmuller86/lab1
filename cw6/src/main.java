import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        int[] tablica = new int[5];
        for (int i = 0; i < 5; i++)
            tablica [(int) i] = i +1;
        int zmienna = tablica[3];
        for (int i = 0; i < 5; i++)
            System.out.println("Kolejna komórka to: " + tablica[i]);
    }
}