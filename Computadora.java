package mx.unam.aragon.model.Computadora;

import java.util.Arrays;

public class Computadora {
    private  String marca;
    private float precio;
    //Crea el objeto teclado ya que de eso se compone la computadora (Composicion)
    private Teclado teclado;
    //Haces el arreglo del objeto monitor para declarar el tamano de la composicion
    private Monitor[] monitores;

    public Computadora(){
        this.marca = "Lanix";
        this.precio = 3200.34f;
        //Se crea el objeto teclado de la computadora con sus componentes del constructor
        this.teclado =new Teclado();
        //Se crea el espacio en memoria para los monitores que tendra la computadora (declara dos objetos monitores vacios)
        this.monitores =new Monitor[2];
    }

    //Permite pasar desde afuera los monitores a la computadora (de la clase monitor a un atrubuto/composicion de la computadora
    public void setMonitores(Monitor[] monitores) {
        this.monitores = monitores;
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

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor[] getMonitores() {
        return monitores;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", teclado=" + teclado +
                ", monitores=" + Arrays.toString(monitores) +
                '}';
    }
}
