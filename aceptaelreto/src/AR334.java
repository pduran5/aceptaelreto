/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=334
 * @result AC
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AR334 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.valueOf(br.readLine());
        for (int i = 0; i < casos; i++) {
            System.out.println(origen(br.readLine()));
        }     
    }

    private static String origen(String nombre) {
        String nacionalidad = "";
        int n=0;
        
        if(nombre.endsWith("IX")) { nacionalidad="GALO"; n++; }
        if(nombre.endsWith("US") || nombre.endsWith("UM")) { nacionalidad="ROMANO"; n++; }
        if(nombre.endsWith("IC")) { nacionalidad="GODO"; n++; }
        if(nombre.endsWith("AS")) { nacionalidad="GRIEGO"; n++; }
        if(nombre.endsWith("AF")) { nacionalidad="NORMANDO"; n++; }
        if(nombre.endsWith("IS") || nombre.endsWith("OS") || nombre.endsWith("AX")) { nacionalidad="BRETON"; n++; }
        if(nombre.endsWith("EZ")) { nacionalidad="HISPANO"; n++; }
        if(nombre.endsWith("A")) { nacionalidad="INDIO"; n++; }
        if(nombre.startsWith("MAC")) { nacionalidad="PICTO"; n++; }
        if(nacionalidad.isEmpty()) nacionalidad="PLUS ULTRA";
        if(n>1) nacionalidad="MULATO";
        
        return nacionalidad;
    }
}
