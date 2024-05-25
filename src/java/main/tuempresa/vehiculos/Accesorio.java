package java.main.tuempresa.vehiculos;

public class Accesorio {
    private String descripcion;

    public Accesorio(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void imprimir() {
        System.out.println("Accesorio: " + descripcion);
    }
}

