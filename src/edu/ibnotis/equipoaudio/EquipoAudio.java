package edu.ibnotis.equipoaudio;

import java.util.ArrayList;

public class EquipoAudio {


    private String nombreComercial;
    private ArrayList<Altavoz> listaAltavoces = new ArrayList<>();
    private Subwoofer sub;

    public EquipoAudio(){}

    public EquipoAudio(String nombreComercial, ArrayList<Altavoz> listaAltavoces, Subwoofer sub) {
        this.nombreComercial = nombreComercial;
        this.listaAltavoces = listaAltavoces;
        this.sub = sub;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public ArrayList<Altavoz> getListaAltavoces() {
        return listaAltavoces;
    }

    public void setListaAltavoces(ArrayList<Altavoz> listaAltavoces) {
        this.listaAltavoces = listaAltavoces;
    }

    public Subwoofer getSub() {
        return sub;
    }

    public void setSub(Subwoofer sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "EquipoAudio{" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", listaAltavoces=" + listaAltavoces +
                ", sub=" + sub +
                '}';
    }

    public void anhadirAltavoz(Altavoz a){
        this.listaAltavoces.add(a);
        System.out.println("altavoz "+a.getMarca()+" anhadido a la lista "+this.listaAltavoces+" del equipo de audio "+this.nombreComercial);
    }

    public void conectarSistema(){
        for(Altavoz a : this.listaAltavoces){
            if(!a.isEstaEncendido()){//si no esta encendido
                a.setEstaEncendido(true);
            }
        }
        if(this.sub!=null){
            this.getSub().setEstaEncendido(true);
        }
        else{
            System.out.println("no tienes subwoofer");
        }
    }

    public void reproducirTest(){
        for(Altavoz a : this.listaAltavoces){
            a.sonar();
        }
        if(this.sub!=null){
            this.sub.sonar();
        }
        else {
            System.out.println("este equipo no cuenta con subwoofer");
        }
    }

    public double calcularPrecioTotal(){
        double sumaPrecio = 0.0;
        int numAltavoces=0;
        for(Altavoz a : this.listaAltavoces){
            numAltavoces++;
            System.out.println("el altavoz numero "+numAltavoces+", tiene el precio: "+a.getPrecio());
            sumaPrecio+=a.getPrecio();
        }
        if(this.sub!=null){
            System.out.println(sub.getPrecio());
            return sumaPrecio+=this.sub.getPrecio();
        }
        return sumaPrecio;
    }

        /*    • Atributos: nombreComercial (String), listaAltavoces (un ArrayList de objetos Altavoz) y sub
    (un único objeto Subwoofer).
    • Métodos obligatorios:
        1. añadirAltavoz(Altavoz a): Agrega un altavoz a la colección.
        2. conectarSistema(): Cambia el estado estaEncendido a true en todos los altavoces del equipo.
        3. reproducirTest(): Hace que todos los altavoces de la lista y el subwoofer (si existe) ejecuten
        su metodo sonar().
        4. calcularPrecioTotal(): Devuelve la suma de los precios de todos los altavoces instalados más el
         precio del subwoofer. ¡Cuidado con los valores nulos!*/
}
