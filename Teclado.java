package mx.unam.aragon.model.Computadora;

public class Teclado {
    private String marca;
    private float precio;

    public Teclado() {
        this.marca ="Logitech";
        this.precio =2379.4f;
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
        return "Teclado{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
