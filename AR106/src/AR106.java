import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Peter
 * @see https://www.aceptaelreto.com/problem/statement.php?id=106
 * @result RTE
 */

public class AR106 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream out = new BufferedOutputStream(System.out);

		String linea;
		while(!(linea=br.readLine()).equals("0")) {
			int longitud=linea.length();
			char[] line=new char[13];

			String salida="";
						
			if(longitud<8) {
				linea=String.format("%08d", Integer.parseInt(linea));
			} else if(longitud>=8 && longitud<=13) {
				linea=String.format("%013d", Long.parseLong(linea));
				line=linea.toCharArray();
				char c1=line[0];
				char c2=line[1];
				char c3=line[2];
				
				if (c1=='0') salida="SI EEUU\n";
				else if (c1=='3' && c2=='8' && c3=='0') salida="SI Bulgaria\n";
				else if (c1=='5') {
					if (c2=='0') salida="SI Inglaterra\n";
					else if (c2=='3' && c3=='9') salida="SI Irlanda\n";
					else if (c2=='6' && c3=='0') salida="SI Portugal\n";
				} else if (c1=='7') {
					if (c2=='0') salida="SI Noruega\n";
					else if (c2=='5' && c3=='9') salida="SI Venezuela\n";
				} else if (c1=='8' && c3=='0') {
					if (c2=='5') salida="SI Cuba\n";
					if (c2=='9') salida="SI India\n";
				} else salida="SI Desconocido\n";
			}
			
			if (isEAN(linea))
				if(salida.equals("")) out.write(("SI\n").getBytes());
				else out.write((salida).getBytes());
			else out.write(("NO\n").getBytes());
			out.flush();
		}
	}

	private static boolean isEAN(String linea) {
		char[] line = linea.toCharArray();
		int suma;
		
		if(line.length==8)
			suma = line[7]-48 + (line[6]-48)*3 + line[5]-48 + (line[4]-48)*3 + line[3]-48 + (line[2]-48)*3 + line[1]-48 + (line[0]-48)*3;
		else
			suma = line[12]-48 + (line[11]-48)*3 + line[10]-48 + (line[9]-48)*3 + line[8]-48 + (line[7]-48)*3 + line[6]-48 + (line[5]-48)*3 + line[4]-48 + (line[3]-48)*3 + line[2]-48 + (line[1]-48)*3 + line[0] - 48;	
		
		if(suma%10==0) return true;
		else return false;
	}
}