public class Subwoofer extends Altavoz {

    private int pulgadas;
    private int potencia;
    private int frecuenciaCorte;
    private double precio;



    public Subwoofer(boolean estaEncendido, String marca, String modelo, double precio, double frecuenciaMinima, double frecuenciaMaxima, int pulgadas, int potencia, int frecuenciaCorte, double precio1) {
        super(estaEncendido, marca, modelo, precio, frecuenciaMinima, frecuenciaMaxima);
        this.pulgadas = pulgadas;
        this.potencia = potencia;
        this.frecuenciaCorte = frecuenciaCorte;
        this.precio = precio1;
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

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void sonar(){

        if (potencia<50){
            System.out.println("boom boom");
        }
        else if (potencia>50&&potencia<100){
            System.out.println("BOOM BOOM");
        }
        else if (potencia>100){
            System.out.println("!!!!!BOOOOOOOOM BOOOOOOOoOM!!!!");
        }
    }

}
