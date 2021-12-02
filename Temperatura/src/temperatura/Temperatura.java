package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        //Variable que nos va a guardar las temperaturas introducidas.
        double temp1, temp2, tempmen, tempmay;
        //Variable que indica la cantidad que quiere introducir.
        int cantidad;
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenido al programa de las temperaturas!");
        System.out.println("¿Cuántas temperaturas desea introducir?");
        cantidad = leer.nextInt();

        System.out.println("Por favor, introduzca la temperatura.");
        temp1 = leer.nextDouble();
        for (int cont = 1; cont < cantidad; cont++) {
            System.out.println("Por favor, introduzca la temperatura.");
            System.out.println("La temperatura de referencia es " + temp1);
            temp2 = leer.nextDouble();
            if (temp2 > tempmay) {
                tempmay = temp2;
            }
            if (temp2 < tempmen) {
                tempmen = temp2;
            }

        }
        System.out.println("La temperatura mayor es " + tempmay + " y la menor es " + tempmen);
    }
}
