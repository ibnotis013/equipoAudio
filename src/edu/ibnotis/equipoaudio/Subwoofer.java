package edu.ibnotis.equipoaudio;

public class Subwoofer {

    private int pulgadas;
    private int potencia;
    private int frecuenciaCorte;
    private double precio;

    public Subwoofer() {}

    public Subwoofer(int pulgadas, int potencia, int frecuenciaCorte, double precio) {
        this.pulgadas = pulgadas;
        this.potencia = potencia;
        this.frecuenciaCorte = frecuenciaCorte;
        this.precio = precio;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getFrecuenciaCorte() {
        return frecuenciaCorte;
    }

    public void setFrecuenciaCorte(int frecuenciaCorte) {
        this.frecuenciaCorte = frecuenciaCorte;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Subwoofer{" +
                "pulgadas=" + pulgadas +
                ", potencia=" + potencia +
                ", frecuenciaCorte=" + frecuenciaCorte +
                ", precio=" + precio +
                '}';
    }

    public void sonar(){
        if(potencia<50){
            System.out.println("boom boom");
        }
        else if(potencia<=100){
            System.out.println("BOOM BOOM");
        }
        else{
            System.out.println("!!!!BOOOOOM BOOOOOM¡¡¡¡");
        }
    }


}
