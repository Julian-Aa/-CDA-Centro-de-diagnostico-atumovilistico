package src;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import util.Lista;
import util.Queve;

/**
 *
 * @author Acer
 */
public class CDA implements Serializable {

    private static Queve<Vehiculo> vehiculos;
    private static Lista<Vehiculo> historial;
    private String Recomendacion;

    /**
     *
     */
    public CDA() {
        this.vehiculos = Singleton.Singleton.getInstancia().getVehiculos();
        this.historial = Singleton.Singleton.getInstancia().getHistorial();
        this.Recomendacion = null;
    }

    /**
     *
     * @return
     */
    public String getRecomendacion() {
        return Recomendacion;
    }

    /**
     *
     * @param Recomendacion
     */
    public void setRecomendacion(String Recomendacion) {
        this.Recomendacion = Recomendacion;
    }

    /**
     *
     * @param vehiculo
     * @return
     */
    public boolean addQueve(Vehiculo vehiculo) {
        boolean confirmacion = false;
        if (vehiculos.add(vehiculo)) {
            serializarListaVehiculos();
            confirmacion = true;
        }
        return confirmacion;
    }

    /**
     *
     * @param dato
     */
    public void addInHead(Vehiculo dato) {
        vehiculos.addInHead(dato);
        serializarListaVehiculos();
    }

    /**
     *
     * @return
     */
    public Vehiculo poll() {
        Vehiculo dato = vehiculos.poll();
        serializarListaVehiculos();
        serializarListaHistorialVehiculos();
        return dato;
    }

    /**
     *
     * @return
     */
    public Vehiculo peek() {
        return vehiculos.peek();
    }

    /**
     *
     * @param i
     * @return
     */
    public Vehiculo obtenerDatoHistorial(int i) {
        return historial.obtenerDato(i);
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return vehiculos.isEmpty();
    }

    /**
     *
     * @param vehiculo
     */
    public void addHistorial(Vehiculo vehiculo) {
        historial.add(vehiculo);
        serializarListaHistorialVehiculos();
    }

    /**
     *
     * @param vehiculo
     * @param aprobo
     */
    public void noAproboVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        serializarListaVehiculos();
    }

    /**
     *
     * @return
     */
    public int size() {
        return vehiculos.size();
    }

    /**
     *
     * @return
     */
    public int sizeHistorial() {
        return historial.Size();
    }

    /**
     *
     * @param vehiculo
     * @return
     */
    public boolean validarPlaca(Vehiculo vehiculo) {
        Vehiculo vehiculoAux;
        boolean cierto = false;
        if (!vehiculos.isEmpty()) {
            for (int i = 0; i < vehiculos.size(); i++) {
                vehiculoAux = vehiculos.poll();
                if (vehiculoAux.getPlaca().equals(vehiculo.getPlaca())) {
                    cierto = true;
                }
                vehiculos.add(vehiculoAux);
            }
        }
        return cierto;
    }

    /**
     *
     */
    public static void serializarListaVehiculos() {
        try {
            FileOutputStream archivo = new FileOutputStream("vehiculos.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(vehiculos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     *
     */
    public static void serializarListaHistorialVehiculos() {
        try {
            FileOutputStream archivo = new FileOutputStream("historial.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(historial);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
