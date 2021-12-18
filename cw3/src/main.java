import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj Imie:");
        String text = scan.next();
        System.out.print("Podaj Nazwisko :");
        String tex = scan.next();
        System.out.print("Podaj wiek:");
        int wiek = scan.nextInt();
        System.out.print("Podaj nr.indeksu:");
        int index = scan.nextInt();
        System.out.printf("Twoje imie  %s twoje nazwisko %s twoj wiek to %d i nr.ineksu to %d \n", text,tex,wiek,index);
        System.out.println("Twoje imie :" + text +"\ntwoje nazwisko:"+tex+"\ntwoj wiek:"+wiek+"\ntwoj nr.indeksu:"+index);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
        int liczbaA = 7;
        int liczbab = 5;
        int z,z1,z2,z3, z4;
        z=liczbaA+liczbab;
        z1 = liczbaA-liczbab;
        z2 = liczbaA*liczbab;
        z3 = liczbaA/liczbab;
        z4 = liczbaA%liczbab;
        System.out.print(z + "\n"+ z1+ "\n"+z2+"\n"+z3+"\n"+z4);
    }
}