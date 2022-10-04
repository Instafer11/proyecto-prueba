
package Paket;

import java.io.FileWriter;
import java.io.IOException;

public class Numeros {

	public static void main(String[] args) {
		
		try (FileWriter fichero = new FileWriter("salida.txt")) {
		
		for(int i= 0; i < 100; i++) {
			if ( i% 2 == 0) {
				fichero.write(Integer.toString(i));
				fichero.write("\n");
			}
		}
		}catch (IOException e) {
		System.out.println("Error al abrir fichero");
	}
	}
}
