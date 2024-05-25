package java.main.tuempresa.vehiculos;

public class Motor {
    private double volumen;

    public Motor(double volumen) {
        this.volumen = volumen;
    }

    public void imprimir() {
        System.out.println("Motor: Volumen " + volumen + " litros");
    }
}
