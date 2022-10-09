package src;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Vehiculo implements Serializable {

    private Propietario propietario;
    private String cantLlantas;
    private String placa;
    private String color;
    private String modelo;
    private String marca;
    private String tipo;
    private int puestos;

    /**
     *
     * @param propietario
     * @param cantLlantas
     * @param placa
     * @param color
     * @param modelo
     * @param marca
     * @param tipo
     * @param puestos
     */
    public Vehiculo(Propietario propietario, String cantLlantas, String placa, String color, String modelo, String marca, String tipo, int puestos) {
        this.propietario = propietario;
        this.cantLlantas = cantLlantas;
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
        this.puestos = puestos;
    }

    /**
     *
     * @return
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario
     */
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    /**
     *
     * @return
     */
    public String getCantLlantas() {
        return cantLlantas;
    }

    /**
     *
     * @param cantLlantas
     */
    public void setCantLlantas(String cantLlantas) {
        this.cantLlantas = cantLlantas;
    }

    /**
     *
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public int getPuestos() {
        return puestos;
    }

    /**
     *
     * @param puestos
     */
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

}
