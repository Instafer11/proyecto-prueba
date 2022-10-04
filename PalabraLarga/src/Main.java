		import java.util.*;
public class Main {

	public static void main(String[] args) {
		

		        Scanner tec = new Scanner(System.in);
		        String palabra, palabra2;
		        int ncarac1, ncarac2;
		        palabra2 = "";
		 
		               do{
		                   System.out.println("Dame una palabra");
		                   palabra = tec.nextLine();
		                   ncarac1 = palabra.length();
		                            //System.out.println(ncarac1);  
		                   ncarac2= palabra2.length();
		                         //System.out.println(ncarac2);
		                         if(ncarac2<ncarac1){
		                             palabra2 = palabra;
		                            }
		 
		               }    while ( ncarac1 > 0);
		                        System.out.println("la palabra mas larga es: " + palabra2);
		 
		   }
		

	}


