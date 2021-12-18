import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        int a = 25;


        if (a % 3 == 0) {
            System.out.println("Podzielny przez 3");
        }
        else {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        int index = 57084;
        String result = index % 2 == 0 ? "Parzysta" : "Nieparzysta";
        System.out.println(result);


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz liczbe1:");

        int x = scanner.nextInt();

        System.out.print("Wpisz liczbe2:");

        int y = scanner.nextInt();
        scanner.close();

        if (x % y == 0) {
            System.out.printf("%d jest podzielony na %d", x, y);
        }
        else {
            System.out.printf("%d nie podzielony na %d", x, y);
        }

    }
}