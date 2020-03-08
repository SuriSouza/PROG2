package Pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Local {

    protected static int j = 0;
    private int id;
    private String nome;
    private ArrayList<Integer> monstros = new ArrayList<Integer>();
    private ArrayList<Integer> players = new ArrayList<Integer>();
    private ArrayList<Integer> routs = new ArrayList<Integer>();
    Controle reg = new Controle();
    Scanner scan = new Scanner(System.in);

    public Local() {

        this.j = j + 1;
        this.id = j;

        switch (this.id) {

            case 1:
                createCircFogo();
                break;

            case 2:
                createDeserto();
                break;

            case 3:
                createChernobyl();
                break;

            case 4:
                createEraGelo();
                break;

            case 5:
                createPantano();
                break;

            case 6:
                createCentro();
                break;
        }
    }

    public void createCircFogo() {

        this.nome = "CIRCULO DE FOGO";
        Personagem dragao = new Personagem("Dragão", 8, id);
        this.monstros.add(dragao.getId());
        this.routs.add(id + 1);
        reg.personagens.add(dragao);
    }

    public void createDeserto() {

        this.nome = "DESERTO";
        this.routs.add(id + 1);
        this.routs.add(id - 1);
    }

    public void createChernobyl() {

        this.nome = "CHERNOBYL";

        for (int i = 0; i < 1; i++) {

            Personagem fogo = new Personagem("Fogo", 6, id);
            reg.personagens.add(fogo);
            this.monstros.add(fogo.getId());
        }
        this.routs.add(id + 1);
        this.routs.add(id - 1);
    }

    public void createEraGelo() {

        this.nome = "ERA DO GELO";

        for (int i = 0; i < 1; i++) {

            Personagem gelo = new Personagem("Gelo", 7, id);
            reg.personagens.add(gelo);
            this.monstros.add(gelo.getId());
        }
        this.routs.add(id + 1);
        this.routs.add(id - 1);
    }

    public void createPantano() {

        this.nome = "PÂNTANO";

        for (int i = 0; i < 1; i++) {

            Personagem goblin = new Personagem("Goblin", 5, id);
            reg.personagens.add(goblin);
            this.monstros.add(goblin.getId());
        }
        this.routs.add(id + 1);
        this.routs.add(id - 1);
    }

    public void createCentro() {

        this.nome = "CENTRO";
        createAvatar();
        this.routs.add(id - 1);
        this.players.add(reg.personagens.size());
    }

    public void createAvatar() {

        System.out.println("BEM VINDO AO JOGO!!!\n");

        System.out.print("Digite o Nome do seu Avatar: ");
        String name = scan.next();

        System.out.print("\n(1)Guerreiro\n(2)Mago\n(3)Ninja\n(4)DEUS\n\nEscolha a sua Classe: ");
        int type;

        do {

            type = scan.nextInt();
            if (type > 0 && type < 5) {

                Personagem you = new Personagem(name, type, id);
                reg.personagens.add(you);

            } else {

                System.out.print(">>>> MSG: Digite uma opcao valida!!! -> ");
            }
        } while (type > 4 || type < 1);
    }

    public int getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public ArrayList<Integer> getMonstros() {

        return monstros;
    }

    public ArrayList<Integer> getPlayers() {

        return players;
    }

    public ArrayList<Integer> getRouts() {

        return routs;
    }

}
