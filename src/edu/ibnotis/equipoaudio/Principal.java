package edu.ibnotis.equipoaudio;

import java.util.ArrayList;
import java.util.Scanner;
public class Principal {
    static Scanner sc = new Scanner(System.in);
    static void main() {

        Altavoz altavoz0 = new Altavoz("JBL", "pro", 100.00, 50.00, 200.00, false);
        Altavoz altavoz1 = new Altavoz("JBL", "noob", 100.00, 50.00, 200.00, true);
        Altavoz altavoz2 = new Altavoz("JBL", "ruben", 100.00, 50.00, 200.00, false);
        Altavoz altavoz3 = new Altavoz("JBL", "iker", 100.00, 50.00, 200.00, true);
        Subwoofer subwoofer = new Subwoofer(15, 112, 65, 40.00, false);


        dibujarMenu();
        System.out.println("elija una opcion");


    }

    public static void dibujarMenu() {
        boolean flag = true;
        int opcion;
        do {
            System.out.println("1. configurar equipo\n" +
                    "2. encender y producir test\n" +
                    "3. mostrar presupuesto");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    configurarEquipo();
                    flag = false;
                    break;
                case 2:
                    flag = false;
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("debes de escoger una opcion entre 1, 2 ,3");
                    flag = true;
                    break;

            }
        } while (flag);
    }

    public static void configurarEquipo() {

        boolean flag;
        int opcion;
        do {

            System.out.println("opcion 1 configura un equipo 2.0\n" +
                    "opcion 2 configura un equipo 2.1\n" +
                    "opcion 3 configura un equipo 5.1\n" +
                    "escoge una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Altavoz altavoz0 = new Altavoz("JBL", "pro", 100.00, 50.00, 200.00, false);
                    Altavoz altavoz1 = new Altavoz("JBL", "noob", 100.00, 50.00, 200.00, true);
                    EquipoAudio equipoAudio = new EquipoAudio();
                    equipoAudio.setNombreComercial("EquipoAudioLedo");
                    equipoAudio.getListaAltavoces().add(altavoz0);
                    equipoAudio.getListaAltavoces().add(altavoz1);
                    flag = false;
                    System.out.println(equipoAudio);
                    break;
                case 2:
                    flag = false;
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    flag = true;
                    break;
            }
        } while (flag);

    }
}
