import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {



		public static void main(String[] args) {
			// TODO Auto-generated method stub

			try (FileReader reader = new FileReader("file");
					BufferedReader buffer = new BufferedReader(reader)) {
				
				String line = buffer.readLine();
				while (line != null) {
					System.out.println(line);
					line = buffer.readLine();
				}
			} catch (FileNotFoundException e) {
				System.out.println("No se ha encontrado el fichero solicitado");
			} catch (IOException e) {
				System.out.println("Error al leer el fichero");
		}

	}

}
