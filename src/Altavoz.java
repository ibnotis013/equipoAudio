public class Altavoz {

    private String marca;
    private String modelo;
    private double precio;
    private double frecuenciaMinima;
    private double frecuenciaMaxima;
    protected boolean estaEncendido;


    public Altavoz(boolean estaEncendido, String marca, String modelo, double precio, double frecuenciaMinima, double frecuenciaMaxima) {
        this.estaEncendido = estaEncendido;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.frecuenciaMinima = frecuenciaMinima;
        this.frecuenciaMaxima = frecuenciaMaxima;
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



public void sonar(boolean estaEncendido){
        if(estaEncendido){
            this.estaEncendido = true;
            System.out.println("Bim bam bim bam");
            return;
        }
        this.estaEncendido = false;
        System.out.println("...");
    }
}

