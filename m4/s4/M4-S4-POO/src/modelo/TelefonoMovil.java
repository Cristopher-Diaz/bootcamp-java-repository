package modelo;

public class TelefonoMovil {

    private String modelo;
    private String marca;
    private int n_camaras;
    private String color;

    public TelefonoMovil(String modelo, String marca, int n_camaras, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.n_camaras = n_camaras;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getN_camaras() {
        return n_camaras;
    }

    public void setN_camaras(int n_camaras) {
        this.n_camaras = n_camaras;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void llamar(String contacto) {
        System.out.println("Llamando a " + contacto);
    }

    public void encenderLinterna () {
        System.out.println("Linterna encendida");
    }

    @Override
    public String toString() {
        return "TelefonoMovil{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", n_camaras=" + n_camaras +
                ", color='" + color + '\'' +
                '}';
    }
}
