package controladores;

import src.CDA;
import src.Vehiculo;

/**
 *
 * @author Acer
 */
public class ControladorRegistrar {

    private CDA controlador;

    /**
     *
     */
    public ControladorRegistrar() {
        controlador = new CDA();
    }

    /**
     *
     * @return
     */
    public CDA getControlador() {
        return controlador;
    }

    /**
     *
     * @param vehiculo
     * @return
     */
    public boolean addQueve(Vehiculo vehiculo) {
        return controlador.addQueve(vehiculo);
    }

    /**
     *
     * @param vehiculo
     */
    public void addHistorial(Vehiculo vehiculo) {
        controlador.addHistorial(vehiculo);
    }

    public boolean validarPlaca(Vehiculo vehiculo) {
        return controlador.validarPlaca(vehiculo);
    }
}
