/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nando_elias12
 */
public abstract class Vehiculo {
    private String placa;
    private String marca;
    private double tarifaBase;

    public Vehiculo(String placa, String marca, double tarifaBase) {
        this.placa = placa;
        this.marca = marca;
        this.tarifaBase = tarifaBase;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public abstract double calcularTarifa();
}
