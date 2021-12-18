import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println(a & b);
        System.out.println(a & c);
        System.out.println(!a | b);
        System.out.println(a | c);
        System.out.println(!a ^ b);
        System.out.println(a ^ c);
        boolean x = true;
        boolean y = false;
        int z = 30;
        int q = 3;
        System.out.println((x|y) | (z < 100) & !(true)^(q == 5));
        boolean h = true, j = true, k = false;
        System.out.println(h | j & k);
    }
}