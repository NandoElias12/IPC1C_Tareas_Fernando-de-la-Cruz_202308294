/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1c_tareas_fernando.de.la.cruz_202308294;

/**
 *
 * @author nando_elias12
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[4];

        flota[0] = new Automovil("P-999XYZ", "Mazda", 300.0, 3);
        flota[1] = new Automovil("P-888ABC", "Nissan", 250.0, 2);
        flota[2] = new Motocicleta("M-555XYZ", "Suzuki", 200.0, 400);
        flota[3] = new Motocicleta("M-777DEF", "Italika", 120.0, 150);

        System.out.println("== FLOTA DE VEHICULOS ==");
        System.out.println();

        double totalFlota = 0.0;

        for (int i = 0; i < flota.length; i++) {
            double tarifaCalculada = flota[i].calcularTarifa();
            totalFlota += tarifaCalculada;

            System.out.println(flota[i].getPlaca() + " " + flota[i].getMarca() + " -> Q" + tarifaCalculada);
        }

        System.out.println();
        System.out.println("TOTAL DE LA FLOTA: Q" + totalFlota);
    }
}