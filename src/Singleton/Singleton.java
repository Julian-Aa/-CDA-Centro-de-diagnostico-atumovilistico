package Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import src.Vehiculo;
import util.Lista;
import util.Queve;

/**
 *
 * @author Acer
 */
public class Singleton implements Serializable {

    private static Singleton instancia = new Singleton();
    private static Queve<Vehiculo> vehiculos;
    private static Lista<Vehiculo> historial;

    /**
     *
     */
    public Singleton() {
        leerDatos();
        leerDatosH();
    }

    /**
     *
     * @return
     */
    public static Singleton getInstancia() {
        return instancia;
    }

    /**
     *
     * @return
     */
    public Queve<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     *
     * @return
     */
    public Lista<Vehiculo> getHistorial() {
        return historial;
    }

    private void leerDatos() {
        try {
            FileInputStream archivo = new FileInputStream("vehiculos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            vehiculos = (Queve<Vehiculo>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            vehiculos = new Queve<Vehiculo>();
        }
    }

    private void leerDatosH() {
        try {
            FileInputStream archivo = new FileInputStream("historial.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            historial = (Lista<Vehiculo>) lector.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            historial = new Lista<Vehiculo>();
        }
    }
}
