package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        double temp;
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenido al programa de las temperaturas!");

        for (int cont = 1; cont <= 5; cont++) {
            System.out.println("Por favor, introduzca la temperatura.");
            temp = leer.nextDouble();

            if (temp >= 0) {
                System.out.println("La temperatura es positiva.");
            } else {
                System.out.println("La temperatura es negativa.");
            }
        }
    }

}
