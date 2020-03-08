package Pacote;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Controle reg = new Controle();
        Scanner scan = new Scanner(System.in);
        Mapa play = new Mapa();
        int l, op = 0;

        do {

            if (reg.yourLocation().getMonstros().isEmpty()) {

                play.menuSafe();

                op = scan.nextInt();
                switch (op) {

                    case 1:
                        //Curar Maldição
                        play.curar();
                        System.out.println(">>>> Precione Enter para Continuar... <<<<");
                        System.in.read();
                        break;

                    case 2:
                        //Ver Status
                        play.verStatus();
                        System.out.println(">>>> Precione Enter para Continuar... <<<<");
                        System.in.read();
                        break;

                    case 3:
                        //Viajar
                        play.move();
                        break;

                    case 4:
                        System.out.println(">>>> MSG: Saindo do programa...!!! <<<<\n>>>> Precione Enter para Continuar... <<<<");
                        System.in.read();
                        System.exit(0);
                        break;

                    default:
                        System.out.println(">>>> MSG: Digite uma opcao valida!!! <<<<\n>>>> Precione Enter para Continuar... <<<<");
                        System.in.read();
                }

            } else {

                play.menuCaution();

                op = scan.nextInt();
                switch (op) {

                    case 1:
                        //Batalhar
                        break;

                    case 2:
                        //Ver Status
                        play.verStatus();
                        System.out.println(">>>> Precione Enter para Continuar... <<<<");
                        System.in.read();
                        break;

                    case 3:
                        //Viajar
                        play.move();
                        break;

                    case 4:
                        System.out.println(">>>> MSG: Saindo do programa...!!! <<<<\n>>>> Precione Enter para Continuar... <<<<");
                        System.in.read();
                        System.exit(0);
                        break;

                    default:
                        System.out.println(">>>> MSG: Digite uma opcao valida!!! <<<<\n>>>> Precione Enter para Continuar... <<<<");
                        System.in.read();
                }
            }
        } while (op != 4);
    }
}
