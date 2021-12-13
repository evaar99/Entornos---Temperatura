package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        //Variable que nos va a guardar las temperaturas introducidas.
        double temp, tempmay = 0, tempmen = 0;
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
            //Indicaremos si la temperatura es positiva o negativa
            if (temp < 0) {
                System.out.println("La temperatura esta en negativo");

            } else {
                System.out.println("La temperatura esta en positivo");

            }
            if(cont==1){
                tempmay = temp;
                tempmen = temp;
                
            }
            else{
                if (temp > tempmay) {
                tempmay = temp;
            }
            if (temp < tempmen) {
                tempmen = temp;
            }
            }
            

        }
        System.out.println("La temperatura mayor es " + tempmay + " y la menor es " + tempmen);
    }
}
