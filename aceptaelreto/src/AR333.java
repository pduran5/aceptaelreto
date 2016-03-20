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
        String inverso = new StringBuilder(n).reverse().toString();
        if(n.equals(inverso)) return "NO";
        return "SI";
    }
}
