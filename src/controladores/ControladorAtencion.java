package controladores;

import src.CDA;
import src.Vehiculo;

/**
 *
 * @author Acer
 */
public class ControladorAtencion {

    CDA controlador;

    /**
     *
     */
    public ControladorAtencion() {
        controlador = new CDA();
    }

    /**
     *
     * @return
     */
    public Vehiculo peek() {
        return controlador.peek();
    }

    /**
     *
     * @param vehiculo
     * @param aprobo
     */
    public void noAproboVehiculo(Vehiculo vehiculo) {
        controlador.noAproboVehiculo(vehiculo);
    }

    /**
     *
     * @return
     */
    public Vehiculo poll() {
        return controlador.poll();
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return controlador.isEmpty();
    }

    /**
     *
     * @param dato
     */
    public void addInHead(Vehiculo dato) {
        controlador.addInHead(dato);
    }

    /**
     *
     * @param vehiculo
     */
    public void addHistorial(Vehiculo vehiculo) {
        controlador.addHistorial(vehiculo);
    }
}
