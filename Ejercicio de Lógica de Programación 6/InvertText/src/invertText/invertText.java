package invertText;

import java.util.Scanner;

public class invertText {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase: ");
        String palabra = sc.nextLine();

        if(palabra == null || palabra == "") {
            System.out.println("No");
        }else {
            for(int i = palabra.length()-1; i>=0; i--) {
                System.out.print(palabra.charAt(i));
            }
        }

        sc.close();
    }
}
