/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=335
 * @result AC
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AR335 {
    public static void main(String[] args) throws IOException {
        // Piramide canicas de altura n: numero tetraedrico
        // Total = n*(n+1)*(n+2)/6
        
        // Canicas en la base: n + (n-1) + (n-2) + ... + 3 + 2 + 1 = (n+1) * n/2
        // Canicas en el 2o nivel: (n-1) + (n-2) + ... + 3 + 2 + 1 = n * (n-1)/2
        // Canicas en el 3r nivel: (n-2) + (n-3) + ... + 3 + 2 + 1 = (n-1) * (n-2)/2
        // Total: (n+1)*n/2 + n*(n-1)/2 + (n-1)*(n-2)/2 + ... + 3*2/2 + 2*1/2
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.valueOf(br.readLine());
        for (int i = 0; i < casos; i++) {
            long n = Integer.valueOf(br.readLine());
            long suma = n * (n + 1);
            // n*(n-1) sera siempre divisible por 2. dividimos ya
            suma = suma / 2;
            suma = suma * (n + 2);
            suma = suma / 3;
            System.out.println(suma);
        }     
    }
}
