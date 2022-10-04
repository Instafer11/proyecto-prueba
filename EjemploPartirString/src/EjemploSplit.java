import java.util.StringTokenizer;

public class EjemploSplit {

	public static void main(String[] args) {
		String frase = "Hola, esto es un ejemplo";
		
		String[] partes = frase.split(",");
		for (int i = 0; i <partes.length; i++) {
			System.out.println(partes[i]);
		}
		//
		StringTokenizer st = new StringTokenizer(frase, ", ");//con el espacio separa tanto por espacio como por la coma
		while (st.hasMoreTokens()) {
			
			String s = st.nextToken();
			System.out.println(s);
		}
	}


}
