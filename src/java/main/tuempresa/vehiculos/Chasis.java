package java.main.tuempresa.vehiculos;

public class Chasis {
    public enum TipoChasis {
        INDEPENDIENTE,
        MONOCASCO
    }

    private TipoChasis tipo;

    public Chasis(TipoChasis tipo) {
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println("Chasis: Tipo " + tipo.name());
    }
}
