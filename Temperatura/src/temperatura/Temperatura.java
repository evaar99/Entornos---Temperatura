package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        //Variable que nos va a guardar las temperaturas introducidas.
        double temp , tempmen=1000, tempmay=-1000;
        //Variable que indica la cantidad que quiere introducir.
        int cantidad;
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenido al programa de las temperaturas!");
        System.out.println("¿Cuántas temperaturas desea introducir?");
        cantidad = leer.nextInt();

        //System.out.println("Por favor, introduzca la temperatura.");
        //temp1 = leer.nextDouble();
        for (int cont = 1; cont <= cantidad; cont++) {
            System.out.println("Por favor, introduzca la temperatura.");
            temp = leer.nextDouble();
            if (temp > tempmay) {
                tempmay = temp;
            }
            if (temp < tempmen) {
                tempmen = temp;
            }

        }
        System.out.println("La temperatura mayor es " + tempmay + " y la menor es " + tempmen);
    }
}
