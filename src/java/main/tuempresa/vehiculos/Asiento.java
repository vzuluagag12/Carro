package java.main.tuempresa.vehiculos;

public class Asiento {
    private String tipoMaterial;
    private boolean tieneFunda;

    public Asiento(String tipoMaterial, boolean tieneFunda) {
        this.tipoMaterial = tipoMaterial;
        this.tieneFunda = tieneFunda;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public boolean tieneFunda() {
        return tieneFunda;
    }

    public void imprimir() {
        System.out.println("Asiento: Material " + tipoMaterial + ", " + (tieneFunda ? "Con funda" : "Sin funda"));
    }
}
