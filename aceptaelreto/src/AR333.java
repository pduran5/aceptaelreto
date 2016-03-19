/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=333
 * @result TLE
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AR333 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea;

        while (!(linea = br.readLine()).equals("0")) {
            System.out.println(bicapicua(linea));
        }
    }

    private static String bicapicua(String n) {
        int l = n.length();
        if(l==1) return "SI";

        for(int i=0; i<l/2; i++) {
            char inicio = n.charAt(i);
            char fin = n.charAt(l-i-1);
            if(inicio-fin != 0) return "NO";
        }

        return "SI";
    }
}
