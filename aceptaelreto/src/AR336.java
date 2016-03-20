/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=336
 * @result RTE
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AR336 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        while(true) {
            linea = br.readLine();
            if(linea.isEmpty()|| linea.equals("0")) break;
            else System.out.println(tirayafloja(br.readLine().split(" ")));
        }
    }

    private static String tirayafloja(String[] pesos) {
        int longitud = pesos.length;
        int idx_left=0;
        int idx_right=longitud-1;
        int n_left = Integer.valueOf(pesos[idx_left]);
        int n_right = Integer.valueOf(pesos[idx_right]);
        int suma_left=n_left;
        int suma_right=n_right;
        
        if(longitud==2) {
            return "1 " + suma_left + " " + suma_right;
        }
        
        while((idx_right-idx_left)!=1) {
            if((suma_left == suma_right) && (idx_right-idx_left==2)) {
                return "NO JUEGAN";
            }
            if(suma_left < suma_right) {
                idx_left++;
                n_left = Integer.valueOf(pesos[idx_left]);
                suma_left += n_left;
            } else {
                idx_right--;
                n_right = Integer.valueOf(pesos[idx_right]);
                suma_right += n_right;
            }
        }
        
        return String.valueOf((idx_left+1) + " " + suma_left + " " + suma_right);
    }
}
