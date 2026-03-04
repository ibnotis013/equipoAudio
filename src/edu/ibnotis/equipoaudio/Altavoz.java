package edu.ibnotis.equipoaudio;

public class Altavoz {

    private String marca;
    private String modelo;
    private double precio;
    private double frecuenciaMinima;
    private double frecuenciaMaxima;
    private boolean estaEncendido;

    public Altavoz() {
    }

    public Altavoz(String marca, String modelo, double precio, double frecuenciaMinima, double frecuenciaMaxima, boolean estaEncendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.frecuenciaMinima = frecuenciaMinima;
        this.frecuenciaMaxima = frecuenciaMaxima;
        this.estaEncendido = estaEncendido;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFrecuenciaMinima() {
        return frecuenciaMinima;
    }

    public void setFrecuenciaMinima(double frecuenciaMinima) {
        this.frecuenciaMinima = frecuenciaMinima;
    }

    public double getFrecuenciaMaxima() {
        return frecuenciaMaxima;
    }

    public void setFrecuenciaMaxima(double frecuenciaMaxima) {
        this.frecuenciaMaxima = frecuenciaMaxima;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    @Override
    public String toString() {
        return "Altavoz{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", frecuenciaMinima=" + frecuenciaMinima +
                ", frecuenciaMaxima=" + frecuenciaMaxima +
                ", estaEncendido=" + estaEncendido +
                '}';
    }


    public void sonar() {
        if (estaEncendido) {
            System.out.println("Bim bam bim bam");
        } else {
            System.out.println("...");
        }
    }

}
