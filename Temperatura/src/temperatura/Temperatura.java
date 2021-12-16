package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        //Variable que nos va a guardar las temperaturas introducidas.
        double temp[], tempmay = Double.MIN_VALUE, tempmen = Double.MAX_VALUE;
        //Array que guarda el nombre de los municipios.
        String municipio[];
        //Variable que indica la cantidad que quiere introducir.
        int cantidad;

        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenido al programa de las temperaturas!");
        System.out.println("¿Cuántas temperaturas desea introducir?");
        cantidad = leer.nextInt();
        temp = new double[cantidad];
        municipio = new String[cantidad];

        //System.out.println("Por favor, introduzca la temperatura.");
        //temp1 = leer.nextDouble();
        for (int cont = 0; cont < cantidad; cont++) {
            System.out.print("Por favor, introduzca la temperatura.");
            temp[cont] = leer.nextDouble();
            System.out.print("¿Cómo se llama el municipio?");
            municipio[cont] = leer.next();

            //Indicaremos si la temperatura es positiva o negativa
            if (temp[cont] < 0) {
                System.out.println("La temperatura esta en negativo");

            } else {
                System.out.println("La temperatura esta en positivo");

            }
            if (cont == 1) {
                tempmay = temp[cont];
                tempmen = temp[cont];

            } else {
                if (temp[cont] > tempmay) {
                    tempmay = temp[cont];
                }
                if (temp[cont] < tempmen) {
                    tempmen = temp[cont];
                }
            }

        }
        System.out.println("La temperatura mayor es " + tempmay + " y la menor es " + tempmen);
        System.out.println("Las temperaturas y municipios introducidos son: ");
        for (int i = 0; i < temp.length; i++) {
            System.out.println((municipio[i]) + " : " + (temp[i]));
        }
        
    }
}
