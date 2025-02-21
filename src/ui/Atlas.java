/*
* Analisis
* Descripcion del programa:
* Entradas:
* Salidas: 
* Ejemplo:
*/

package ui;

import java.util.Scanner;

public class Atlas {

	private Scanner escaner;

    // Declaracion de constantes (completar)
    final double COSTO_TRAYECTO_AVION = 250000;
    final double COSTO_Noches = 150000;

	private Atlas() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{   
        int edad, docu,noches;
        // Declaracion de info a pedir del usuario (completar)
        String nombre, ciudad, estancia;
        // Saludo
        System.out.println("Bienvenido al programa de viajes EVENTOS ATLAS realizado por los estudiantes de Algoritmos y programacion I de la Universidad ICESI.");
        // Pedir info al usuario (completar)
        System.out.println("Cual es tu nombre?");
        nombre = escaner.nextLine();

        // ...
        System.out.println("Bienvenido " + nombre + "!");
        // ...

        // Declaracion de salidas calculadas (completar)
        System.out.println(nombre + " Ahora necesitare tu edad");
        edad = escaner.nextInt();
         System.out.println(nombre + " Ahora por favor dame tu numero de documento");
         docu = escaner.nextInt();
         System.out.println(nombre + " ," + edad +" anos, documento " + docu);
         System.out.println(nombre + " Cuantas noches te vas a quedar?");
         noches = escaner.nextInt();
         escaner.nextLine();
        double totalTransporte;
        // Calculo de salidas mediante metodos (completar)
        totalTransporte = calcularTotalTransporte(); // aqui podrian faltar parametros
        double totalNoches = calcularTotalNoches(noches); 
        System.out.println("Por " + noches + " noches serian " +totalNoches + " pesos");
        System.out.println("De que ciudad vienes?");
        ciudad = escaner.nextLine();
       estancia = ciudadesta(ciudad);
       System.out.println(estancia , totalTransporte);

	}

	public static void main(String[] args) {
		Atlas mainApp = new Atlas();
		mainApp.run();
	}

    // Completar metodos para calcular salidas

    /**
	 * Descripción: El método ... permite calcular ...
	 * @param 
	 * @return 
	 */
    public double calcularTotalTransporte() {
        return COSTO_TRAYECTO_AVION * 2;
    }
public double calcularTotalNoches(int noches) {
        return COSTO_Noches * noches;
    }
    public void ciudadesta(String ciudad double totalTransporte) {

        if (ciudad.equals("bogota")){
            System.out.println("De acuerdo");
        }
        else {
        System.out.println("De ida y vuelta desde " + ciudad + " hasta Bogota en avion costaria " + totalTransporte );
        }
        
    }

	

	
}