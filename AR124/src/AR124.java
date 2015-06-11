/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=124
 * @result TLE
 */

import java.util.Scanner;

public class AR124 {
    public static void main(String[] args) {
        String cadena,num1,num2,mayor,menor;
        int pos,llevo,cont,longitud,acarreo,dif;
        Scanner in = new Scanner(System.in);
      
        cadena=in.nextLine();
      
        pos=cadena.indexOf(" ", 0);
        num1=cadena.substring(0, pos);
        num2=cadena.substring(pos+1);

        while(Character.getNumericValue(num1.charAt(0))!=0 || Character.getNumericValue(num2.charAt(0))!=0) {
            cont=llevo=0;
            if (num1.length()<num2.length()) {
                mayor=num2;
                menor=num1;
            } else {
                mayor=num1;
                menor=num2;
            }
            longitud=mayor.length();
            dif=mayor.length()-menor.length();
            for (int i = longitud-1; i >=0; i--) {
                acarreo=0;
                acarreo+=llevo;
                acarreo+=Character.getNumericValue(mayor.charAt(i));
                if(i-dif>=0) acarreo+= Character.getNumericValue(menor.charAt(i-dif));
                else llevo=0;
              
                if (acarreo>9) {
                	llevo= acarreo/10;
                    ++cont;
                } else llevo=0;
                if (llevo==0 && (i-dif<0)) break;
            }
            System.out.println(cont);
            cadena=in.nextLine();
      
            pos=cadena.indexOf(" ", 0);
            num1=cadena.substring(0, pos);
            num2=cadena.substring(pos+1);
          
        }
    }
}
