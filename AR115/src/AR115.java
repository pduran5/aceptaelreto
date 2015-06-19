/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=115
 * @result AC // Tiempo: 1.841 // Memoria: 3585 // Pos: 51
 */

import java.util.Scanner;

public class AR115 {

	public static boolean isKaprekar(long n) {
        long esquerra=n*n, dreta=0, decena=1;
        boolean resultat=false; // Suposem que NO es un numero de Kaprekar
        while(esquerra>0 && !resultat) { // Mentres no s'hagin separat totes les xifres i NO sigui Kaprekar
            dreta=dreta+esquerra%10*decena; // separo una a la dreta
            esquerra=esquerra/10;
            decena=decena*10;
            resultat=dreta>0 && esquerra+dreta==n; //si la dreta no es 0 i la suma de les parts es el numero, llavors es Kaprekar
        }
        return resultat;
    }
    
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n;
        do {
            n=in.nextLong();
            if (n>0) System.out.println(isKaprekar(n)?"SI":"NO");
        } while (n>0);
        in.close();
    }

}
