package edu.ibnotis.equipoaudio;

import java.util.ArrayList;

public class Principal {
    static void main() {

        Altavoz altavoz0 = new Altavoz("JBL", "pro", 100.00, 50.00, 200.00, false);
        Altavoz altavoz1 = new Altavoz("JBL", "noob", 100.00, 50.00, 200.00, true);
        Altavoz altavoz2 = new Altavoz("JBL", "ruben", 100.00, 50.00, 200.00, false);
        Altavoz altavoz3 = new Altavoz("JBL", "iker", 100.00, 50.00, 200.00, true);

        //altavoz0.sonar();

        Subwoofer subwoofer = new Subwoofer(15, 112, 65, 40.00,false);
        //subwoofer.sonar();

        EquipoAudio equipoAudio = new EquipoAudio();
        equipoAudio.setNombreComercial("EquipoNico");
        /*como podriamos añadir un altavoz usando el getter
        ArrayList<Altavoz> listaDeEquipoAudio= equipoAudio.getListaAltavoces();
        listaDeEquipoAudio.add(altavoz);
         */
       /* equipoAudio.anhadirAltavoz(altavoz0);
        equipoAudio.anhadirAltavoz(altavoz1);
        equipoAudio.anhadirAltavoz(altavoz2);
        equipoAudio.anhadirAltavoz(altavoz3);
*/
        equipoAudio.setSub(subwoofer);
        //equipoAudio.conectarSistema();
        //System.out.println(equipoAudio);

        equipoAudio.reproducirTest();
        System.out.println(equipoAudio.calcularPrecioTotal());

    }
}
