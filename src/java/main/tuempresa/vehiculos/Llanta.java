package java.main.tuempresa.vehiculos;

public class Llanta {
    private String marca;
    private int diametroRin;
    private int altura;
    private int anchura;

    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public void imprimir() {
        System.out.println("Llanta: " + marca + " - Diametro: " + diametroRin + " pulgadas, Altura: " + altura + " pulgadas, Anchura: " + anchura + " pulgadas");
    }
}
