/**
 * @author EllaNoSeDeJava (CEROCA)
 * @see https://www.aceptaelreto.com/problem/statement.php?id=335
 * @result AC
 */

import java.util.Scanner;

public class AR335v2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int casos = lector.nextInt();
        
        for (int i = 0; i < casos; i++) {
            long filas_piramide = lector.nextLong();
            long canicas_2d=0;
            long canicas_3d=0;
            
            for(int j = 1; j <= filas_piramide; j++) {
                canicas_2d += j;
                canicas_3d += canicas_2d;
            }
            
            System.out.println(canicas_3d);
        }     
    }
}

