import java.util.ArrayList;

public class EquipoAudio {
    private String nombreComercial;
    private ArrayList<ComponentesAudio>  ComponentesAudio;
    private Subwoofer sub;

    public EquipoAudio(String nombreComercial, ArrayList<ComponentesAudio> ComponentesAudio, Subwoofer sub) {
        this.nombreComercial = nombreComercial;
        this.ComponentesAudio = ComponentesAudio;
        this.sub = sub;
    }

    public void añadirAltavoz(ComponentesAudio a){
    this.ComponentesAudio.add(a);
    }

    public void conectarSistema(){
    }




}
