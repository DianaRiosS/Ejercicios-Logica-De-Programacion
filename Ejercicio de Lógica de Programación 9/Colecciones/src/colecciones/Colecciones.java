package colecciones;

import java.util.Scanner;
import java.util.HashMap;


public class Colecciones {

	 public static void main(String [] args) {

	        boolean aux1; 

	        Scanner sc = new Scanner(System.in);
	        HashMap <String, String> diccionario = new HashMap<String, String>();

	        diccionario.put("mapa", "map");
	        diccionario.put("juego", "game");
	        diccionario.put("papel", "paper");
	        diccionario.put("historia", "history");
	        diccionario.put("palabra", "word");
	        diccionario.put("cancion", "song");
	        diccionario.put("paso", "step");
	        diccionario.put("voz", "voice");
	        diccionario.put("poder", "power");
	        diccionario.put("miel", "honey");
	        diccionario.put("celular", "cell phone");
	        diccionario.put("peluche", "teddy");
	        diccionario.put("cama", "bed");
	        diccionario.put("luces", "lights");
	        diccionario.put("espejo", "mirror");
	        diccionario.put("llave", "key");
	        diccionario.put("flor", "flower");
	        diccionario.put("viernes", "friday");
	        diccionario.put("mundo", "world");
	        diccionario.put("fiesta", "party");


	        System.out.println("Ingresa una palabra en español:");
	        String palabra = sc.nextLine().toLowerCase();
	        if(palabra.matches("^[a-zA-Z]+$")) {
	            aux1 = diccionario.containsKey(palabra);
	            if(aux1 == true) {
	                System.out.println(diccionario.get(palabra));
	            }else {
	                System.out.println("La palabra no se encuentra en el diccionario");
	            }
	        }else {
	            System.out.println("Solo se admiten letras");
	        }

	        sc.close();
	    }
}
