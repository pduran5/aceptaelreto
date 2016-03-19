/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=335
 * @result TLE
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AR335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.valueOf(br.readLine());
        for (int i = 0; i < casos; i++) {
            System.out.println(canicas(Integer.valueOf(br.readLine())));
        }     
    }

    private static int canicas(int altura) {
        int suma = 0;
        
        for(int i=1; i<=altura; i++)
            suma += i;
        
        if(altura!=1)
            suma += canicas(altura-1);

        return suma;
    }
}
