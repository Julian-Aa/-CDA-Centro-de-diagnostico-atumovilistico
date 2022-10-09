package controladores;

import src.CDA;
import src.Vehiculo;

/**
 *
 * @author Acer
 */
public class ControladorHistorial {

    CDA controlador;

    /**
     *
     */
    public ControladorHistorial() {
        this.controlador = new CDA();
    }

    /**
     *
     * @param i
     * @return
     */
    public Vehiculo obtenerDatoHistorial(int i) {
        return controlador.obtenerDatoHistorial(i);
    }

    /**
     *
     * @return
     */
    public int size() {
        return controlador.sizeHistorial();
    }

}
