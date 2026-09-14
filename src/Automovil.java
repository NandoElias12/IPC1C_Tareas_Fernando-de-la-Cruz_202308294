/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nando_elias12
 */
public class Automovil extends Vehiculo {
    private int pasajeros;

    public Automovil(String placa, String marca, double tarifaBase, int pasajeros) {
        super(placa, marca, tarifaBase);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase() + (pasajeros * 15.0);
    }
}
