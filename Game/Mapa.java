package Pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Mapa {

    Controle reg = new Controle();
    Scanner scan = new Scanner(System.in);
    int i, l, op;

    public Mapa() {

        for (i = 0; i < 6; i++) {

            Local local = new Local();
            reg.locais.add(local);
        }
    }

    public void menuCaution() {

        System.out.println("\n>>>>>> " + reg.yourLocation().getNome() + ": <<<<<<");

        if (reg.you().getLocal() == 2 && !reg.you().getClasse().equals("◄♦DEUS♦►")) {

            reg.you().setStatus("Amaldiçoado");
            reg.locais.get(5).getRouts().add(1);
            System.out.println(">>>> VOCÊ FOI AMALDIÇOADO!!! <<<<");
        }

        System.out.println("(1) BATALHAR");
        System.out.println("(2) VER STATUS");
        System.out.println("(3) VIAJAR");
        System.out.println("(4) SAIR");
        System.out.print("Resposta: ");
    }

    public void menuSafe() {

        System.out.println("\n>>>>>> " + reg.yourLocation().getNome() + ": <<<<<<");

        if (reg.you().getLocal() == 2 && !reg.you().getClasse().equals("◄♦DEUS♦►")) {

            reg.you().setStatus("Amaldiçoado");
            reg.locais.get(5).getRouts().add(1);
            System.out.println(">>>> VOCÊ FOI AMALDIÇOADO!!! <<<<");
        }

        System.out.println("(1) CURAR MALDIÇÃO");
        System.out.println("(2) VER STATUS");
        System.out.println("(3) VIAJAR");
        System.out.println("(4) SAIR");
        System.out.print("Resposta: ");
    }

    public void verStatus() {

        reg.you().ToString();
    }

    public void curar() {

        reg.you().setStatus("Saldável");
        reg.you().UpGeral(reg.you().getExp());
        System.out.println(">>>> Você foi Totalmente Curado!!! <<<<");
    }

    public void move() {

        System.out.println("\n>>>>>> VIAJAR: <<<<<<");
        for (i = 0; i < reg.yourLocation().getRouts().size(); i++) {

            System.out.println("(" + (i + 1) + ") " + reg.locais.get(reg.yourLocation().getRouts().get(i) - 1).getNome());
        }

        System.out.println("(0) VOLTAR");
        System.out.print("\nPara onde deseja ir: ");
        op = scan.nextInt();

        if (op > 0 && op <= reg.yourLocation().getRouts().size() /*&& reg.yourLocation().getMonstros().isEmpty()*/) {

            reg.you().setLocal(reg.yourLocation().getRouts().get(op - 1));

        } else {

            System.out.println(">>>> Você não pode ir para este Local!!! <<<<");

        }
    }

    public void batalha() {

        //???????????
    }

}
