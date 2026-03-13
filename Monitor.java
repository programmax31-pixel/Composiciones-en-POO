package mx.unam.aragon.model.Computadora;

public class Monitor {
    private String marca;
    private float precio;

    public Monitor() {
        this.marca= "ASUS";
        this.precio= 2199.5f;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
