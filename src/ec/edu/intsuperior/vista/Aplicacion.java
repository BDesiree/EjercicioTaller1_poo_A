package ec.edu.intsuperior.vista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @autor Desiree Bajaña
 */
public class Aplicacion {

    public static void main(String[] args) {

        Aplicacion.juegoAdivinar();
    }

    public static void juegoAdivinar() {

        Scanner leer = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 5 + 1);
        Random sr = new Random();
        aleatorio = 0 + sr.nextInt(5);
        int oportunidades = 1;
        int num;
        System.out.println("El juego consiste en adivinar el numero aleatorio");
        System.out.println("Elija un numero entre el 0 y 5");
        while (oportunidades <= 3) {
            System.out.println("Tu intento Nro. " + oportunidades);
            num = Integer.parseInt(leer.nextLine());

            if (aleatorio == num) {
                System.out.println("Felicidades has acertado, el número era el: " + aleatorio);
                System.exit(0);
            } else {
                System.out.println("Tienes otra oportunidad");
                oportunidades++;

            }

        }

    }
}
