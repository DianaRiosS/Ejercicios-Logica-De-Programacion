package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Dictionary {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Inicializamos el Scanner para recibir datos
        
        HashMap<String, String> dictionary = new HashMap<String, String>(); //Variable tipo HashMap con llave y valor tipo String
        
        Random random = new Random(); // Iniciamoz el Random
        
        int numberRandom, j, i;  //Declaramos variables que nos serviran para hacer recorridos en arrays o guardar posiciones
        int rightWords = 0; // variable para contar las palabras correctas
        int wrongWords = 0; // variable para contar las palabras incorrectas
        String keyPosition = null; // variable para obtener la posicion de la llave a buscar 
        String valuePosition = null; // variable para obtener la posicion del valor a buscar 
        String word; // variable que almacenara las palabras ingresadas por el usuario

        /* Agregamos las palabras al diccionario, todas con su respectiva llave y valor*/
        dictionary.put("mapa", "map");
        dictionary.put("juego", "game");
        dictionary.put("papel", "paper");
        dictionary.put("historia", "history");
        dictionary.put("palabra", "word");
        dictionary.put("cancion", "song");
        dictionary.put("paso", "step");
        dictionary.put("voz", "voice");
        dictionary.put("poder", "power");
        dictionary.put("miel", "honey");
        dictionary.put("celular", "cell phone");
        dictionary.put("peluche", "teddy");
        dictionary.put("cama", "bed");
        dictionary.put("luces", "lights");
        dictionary.put("espejo", "mirror");
        dictionary.put("llave", "key");
        dictionary.put("flor", "flower");
        dictionary.put("viernes", "friday");
        dictionary.put("mundo", "world");
        dictionary.put("fiesta", "party");
        /* Terminamos de agregar elementos al HashMap*/

        for (i = 0; i < 5; i++) { // Inicioamos un for para que el proceso de pedirle al usuario una palabra se realice 5 veces
            j = 0; // Inicializar j en 0 para que coincida con los índices de HashMap
            numberRandom = random.nextInt(20); // Indicamos el rango para el numero random/aleatorio a generar (0 - 20)
            for (Map.Entry<String, String> entry : dictionary.entrySet()) { //Recorremos el arreglo
                if (j == numberRandom) { // se evalua si la posicion en el arreglo es igual al numero random para mostrar esa palabra a traducir
                    valuePosition = entry.getValue(); // se obtiene el valor de la posicion
                    keyPosition = entry.getKey(); // se obtiene la llave de la posicion
                    System.out.println("Ingresa la traducción de esta palabra: " + keyPosition); // se muestra el mensaje al usuario con la palabra a traducir
                    word = sc.nextLine(); //almacenamos la palabra en la variable word
                    if (word.equalsIgnoreCase(valuePosition)) { // hacemos una comparación sin tomar en cuenta mayúsculas y minúsculas
                        rightWords++; // si la palabra es correcta se aumenta en 1 el contador de palabras correctas
                    } else {
                        wrongWords++; // si la palabra es incorrecta se aumenta en 1 el contador de palabras incorrectas
                    }
                    break; // salir del bucle una vez que se ha encontrado la palabra
                }
                j++; // se aumenta en 1 el valor de j para recorrer los subindices del HashMap
            }
        }
        System.out.println("El total de palabras correctas son: " + rightWords); // se muestra un mensaje al usuario con el numero de palabras correctas
        System.out.println("El total de palabras incorrectas son: " + wrongWords); // se muestra un mensaje al usuario con el numero de palabras incorrectas

        sc.close(); // Cerramos el Scanner
    }
}
