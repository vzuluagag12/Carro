package java.main.tuempresa.vehiculos;

public class Carroceria {
    public enum TipoCarroceria {
        INDEPENDIENTE,
        AUTOPORTANTE,
        TUBULAR
    }

    private TipoCarroceria tipo;
    private String color;

    public Carroceria(TipoCarroceria tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public void imprimir() {
        System.out.println("Carroceria: Tipo " + tipo.name() + ", Color " + color);
    }
}
