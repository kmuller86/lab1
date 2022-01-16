import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        int[] tablica = new int[5];
        for (int i = 0; i < 5; i++)
            //po co typuje pan i na int skoro i jest zawsze intem
            tablica [(int) i] = i +1;
        int zmienna = tablica[3];
        for (int i = 0; i < 5; i++)
            System.out.println("Kolejna komórka to: " + tablica[i]);
    }
}

/* miała być tablica double[];
double[] tablica = new double[5];
for (int i = 0; i < tablica.length; i++)
     tablica [i] = i + 1.3;
for (int i = 0; i < tablica.length; i++)
     System.out.println("Kolejna komórka to: " + tablica[i]);
*/
