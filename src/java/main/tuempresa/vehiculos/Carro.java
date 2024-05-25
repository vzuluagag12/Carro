package java.main.tuempresa.vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private Motor motor;
    private Chasis chasis;
    private Carroceria carroceria;
    private Llanta[] llantas;
    private Asiento[] asientos;
    private List<Accesorio> accesorios;

    public Carro(Motor motor, Chasis chasis, Carroceria carroceria, Llanta[] llantas, Asiento[] asientos) {
        this.motor = motor;
        this.chasis = chasis;
        this.carroceria = carroceria;
        this.llantas = llantas;
        this.asientos = asientos;
        this.accesorios = new ArrayList<>();
    }

    public void agregarAccesorio(Accesorio accesorio) {
        this.accesorios.add(accesorio);
    }

    public void imprimirDetalles() {
        System.out.println("\nDetalles del Carro:");
        System.out.println("-------------------------");
        motor.imprimir();
        chasis.imprimir();
        carroceria.imprimir();
        for (Llanta llanta : llantas) {
            llanta.imprimir();
        }
        for (Asiento asiento : asientos) {
            asiento.imprimir();
        }
        for (Accesorio accesorio : accesorios) {
            accesorio.imprimir();
        }
    }

    public static Carro crearCarroBase() {
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis(Chasis.TipoChasis.MONOCASCO);
        Carroceria carroceria = new Carroceria(Carroceria.TipoCarroceria.TUBULAR, "Rojo");
        Llanta[] llantas = new Llanta[]{
                new Llanta("Goodyear", 25, 20, 15),
                new Llanta("Goodyear", 25, 20, 15),
                new Llanta("Goodyear", 25, 20, 15),
                new Llanta("Goodyear", 25, 20, 15)
        };
        Asiento[] asientos = new Asiento[]{
                new Asiento("Cuero", true),
                new Asiento("Tela", true),
                new Asiento("Tela", false)
        };
        return new Carro(motor, chasis, carroceria, llantas, asientos);
    }
}
