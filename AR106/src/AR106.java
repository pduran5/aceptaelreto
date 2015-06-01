import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=106
 * @result AC // Tiempo: 0.636 // Memoria: 3585 // Posicion: 240
 */

public class AR106 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea;
		while(!(linea=br.readLine()).equals("0")) {
		
			int longitud = linea.length();
			
			if(longitud<8)
				linea=String.format("%08d", Long.parseLong(linea));
			else if(longitud>8 && longitud<13)
				linea=String.format("%013d", Long.parseLong(linea));
			
			boolean k=false;
			String pais="";
			
			k = isEAN(linea);
			
			if (longitud>8 && longitud<=13) {
				int c1 = linea.charAt(0)-48;
				int c2 = linea.charAt(1)-48;
				int c3 = linea.charAt(2)-48;
				
				if (c1==0) pais="EEUU";
				else if (c1==3 && c2==8 && c3==0) pais="Bulgaria";
				else if (c1==5 && c2==0) pais="Inglaterra";
				else if (c1==5 && c2==3 && c3==9) pais="Irlanda";
				else if (c1==5 && c2==6 && c3==0) pais="Portugal";
				else if (c1==7 && c2==0) pais="Noruega";
				else if (c1==7 && c2==5 && c3==9) pais="Venezuela";
				else if (c1==8 && c2==5 && c3==0) pais="Cuba";
				else if (c1==8 && c2==9 && c3==0) pais="India";
				else pais="Desconocido";
			}
			if (k==true) {
				System.out.print("SI");
				if(pais.equals(""))
					System.out.print("\n");
				else
					System.out.println(" "+pais);
	
			} else
				System.out.println("NO");
		}
	}

	private static boolean isEAN(String linea) {
		int longitud = linea.length();
		int dc = linea.charAt(longitud-1)-48;
		int suma=0;
		for (int i=1; i<longitud; i++) {
			int n = linea.charAt(longitud-i-1)-48;
			if(i%2!=0) suma=suma+n*3;
			else suma=suma+n;
		}
		suma=suma+dc;
		
		if(suma%10==0) return true;
		else return false;
	}
}
