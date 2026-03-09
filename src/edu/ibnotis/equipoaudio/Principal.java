package edu.ibnotis.equipoaudio;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private static final int SISTEMA_AUDIO_20 = 2;
    private static final int SISTEMA_AUDIO_51 = 5;
    static Scanner sc = new Scanner(System.in);
    private static EquipoAudio equipoAudio;
    private static ArrayList<EquipoAudio> equipoAudioList;

    static void main() {

       /* Altavoz altavoz0 = new Altavoz("JBL", "pro", 100.00, 50.00, 200.00, false);
        Altavoz altavoz1 = new Altavoz("JBL", "noob", 100.00, 50.00, 200.00, true);
        Altavoz altavoz2 = new Altavoz("JBL", "ruben", 100.00, 50.00, 200.00, false);
        Altavoz altavoz3 = new Altavoz("JBL", "iker", 100.00, 50.00, 200.00, true);
        Subwoofer subwoofer = new Subwoofer(15, 112, 65, 40.00, false);
*/

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
                    break;
                case 2:
                    encenderYProbar();
                    break;
                case 3:
                    System.out.println(equipoAudio.calcularPrecioTotal());
                    break;
                default:
                    System.out.println("debes de escoger una opcion entre 1, 2 ,3");
                    break;

            }
        } while (flag);
    }

    public static void configurarEquipo() {

        boolean flag = true;
        int opcion;
        do {

            System.out.println("opcion 1 configura un equipo 2.0\n" +
                    "opcion 2 configura un equipo 2.1\n" +
                    "opcion 3 configura un equipo 5.1\n" +
                    "escoge una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    equipoAudio = configurarAltavoces(SISTEMA_AUDIO_20);
                    flag = false;

                    break;
                case 2:
                    equipoAudio = configurarAltavoces(SISTEMA_AUDIO_20);
                    equipoAudio.setSub(configurarSubwoofer());
                    flag = false;
                    break;
                case 3:
                    equipoAudio = configurarAltavoces(SISTEMA_AUDIO_51);
                    equipoAudio.setSub(configurarSubwoofer());
                    flag = false;
                    break;
                default:
                    flag = true;
                    break;
            }
        } while (flag);

    }

    public static EquipoAudio configurarAltavoces(int numAltavoz) {
        System.out.println("ponle nombre a tu equipo de audio");
        sc.nextLine();
        String nombreEquipoAudio = sc.nextLine();
        EquipoAudio equipoAudio = new EquipoAudio();
        equipoAudio.setNombreComercial(nombreEquipoAudio);
        System.out.println("crea tu altavoz");
        for (int i = 0; i < numAltavoz; i++) {
            equipoAudio.getListaAltavoces().add(new Altavoz());
            Altavoz altavoz = equipoAudio.getListaAltavoces().get(i);
            sc.nextLine();
            System.out.println("inserta la marca");
            altavoz.setMarca(sc.nextLine());
            System.out.println("inserta el modelo");
            altavoz.setModelo(sc.nextLine());
            System.out.println("inserta el precio");
            altavoz.setPrecio(sc.nextDouble());
            System.out.println("inserta la frecuencia minima");
            altavoz.setFrecuenciaMinima(sc.nextDouble());
            System.out.println("inserta la frecuencia maxima");
            altavoz.setFrecuenciaMaxima(sc.nextDouble());
            System.out.println("esta encendido(true/false)");
            altavoz.setEstaEncendido(sc.nextBoolean());
        }
        return equipoAudio;
    }

    public static Subwoofer configurarSubwoofer() {
        Subwoofer subwoofer = new Subwoofer();
        System.out.println("crea tu subwoofer");
        System.out.println("pulgadas del subwoofer");
        subwoofer.setPulgadas(sc.nextInt());
        System.out.println("dime la potencia");
        subwoofer.setPotencia(sc.nextInt());
        System.out.println("dime la frecuencia");
        subwoofer.setPotencia(sc.nextInt());
        System.out.println("dime el precio");
        subwoofer.setPrecio(sc.nextDouble());
        System.out.println("esta encendidio (true /false)");
        subwoofer.setEstaEncendido(sc.nextBoolean());
        return subwoofer;
    }


    public static void encenderYProbar() {
        equipoAudio.conectarSistema();
        equipoAudio.reproducirTest();
    }

}
