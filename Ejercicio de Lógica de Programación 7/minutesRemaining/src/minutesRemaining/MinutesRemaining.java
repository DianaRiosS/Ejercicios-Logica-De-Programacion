package minutesRemaining;

import java.util.Scanner;

public class MinutesRemaining {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dia;
        int hora, minutos, minutosTotales = 0;

        while (true) {
            int diasFaltantes = 0;
         // Pide el día de la semana hasta que sea válido
            do {
                System.out.println("Ingresa un día de la semana (Lunes-Viernes)");
                dia = sc.nextLine().toLowerCase();
            } while (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") && !dia.equals("viernes"));

            // Pide la hora hasta que sea válida
            do {
                System.out.println("Ingresa una hora en formato 24hrs:");
                hora = sc.nextInt();
            } while (hora < 0 || hora > 23);

            // Pide los minutos hasta que sean válidos
            do {
                System.out.println("Ingresa los minutos:");
                minutos = sc.nextInt();
            } while (minutos < 0 || minutos > 59);

            if (dia.equals("viernes")) {
                if (hora == 15) {
                    if (minutos > 0) {
                        diasFaltantes = 7; // Si es viernes a las 15:00 con minutos, son 7 días
                        minutosTotales = (diasFaltantes * 24 * 60) - minutos;
                    } else {
                        System.out.println("Justo a tiempo");
                        break;
                    }
                } else {
                    minutosTotales = ((15 - hora) * 60) - minutos;
                }
            } else {
                switch (dia) {
                    case "lunes":
                        diasFaltantes = 4;
                        break;

                    case "martes":
                        diasFaltantes = 3;
                        break;

                    case "miercoles":
                        diasFaltantes = 2;
                        break;

                    case "jueves":
                        diasFaltantes = 1;
                        break;
                }
                minutosTotales = (diasFaltantes * 24 * 60) + ((15 - hora) * 60) - minutos;
            }
            break;
        }
        System.out.println("Los minutos que faltan son: " + minutosTotales);
        sc.close();
    }

}
