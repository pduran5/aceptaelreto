/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=340
 * @result AC
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AR340 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.valueOf(br.readLine());
        for (int i = 0; i < casos; i++) {
            System.out.println(cerillas(br.readLine()));
        }
    }

    public static int cerillas(String dimension) {
        String[] split = dimension.split(" ");
        int n = Integer.valueOf(split[0]);
        int m = Integer.valueOf(split[1]);
        // verticales = (n+1)*m;
        // horizontales = n*(m+1);
        // total = (n+1)*m + n*(m+1) = n*m + m + n*m + n = 2*n*m + n + m
        int total = 2*n*m + n + m;
        return total;
    }
}
