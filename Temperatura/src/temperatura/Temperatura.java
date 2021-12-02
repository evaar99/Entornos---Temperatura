package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        
        //Variable que nos va a guardar la temperatura introducida.
        double temp;
        //Variable que indica la cantidad que quiere introducir.
        int cantidad;
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenido al programa de las temperaturas!");
        System.out.println("¿Cuántas temperaturas desea introducir?");
        cantidad = leer.nextInt();

        for (int cont = 1; cont <= cantidad; cont++) {
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
