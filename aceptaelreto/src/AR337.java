/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=337
 * @result AC
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AR337 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.valueOf(br.readLine());
        for (int i = 0; i < casos; i++) {
            String superior = br.readLine();
            String inferior = br.readLine();
            System.out.println(dientes(superior, inferior));
        }        
    }

    private static String dientes(String superior, String inferior) {
        String[] sup = superior.split(" ");
        String[] inf = inferior.split(" ");
        
        int encaje = Integer.valueOf(sup[0]) + Integer.valueOf(inf[0]);
        
        for(int i=1; i<6; i++) {
            if((Integer.valueOf(sup[i]) + Integer.valueOf(inf[i])) != encaje)
                return "NO";
        }
        
        return "SI";
    }
}
