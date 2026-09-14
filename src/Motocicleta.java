/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nando_elias12
 */
public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String placa, String marca, double tarifaBase, int cilindrada) {
        super(placa, marca, tarifaBase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularTarifa() {
        if (cilindrada > 250) {
            return getTarifaBase() * 0.8;
        } else {
            return getTarifaBase() * 1.10;
        }
    }
}