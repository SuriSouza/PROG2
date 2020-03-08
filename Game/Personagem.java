package Pacote;

import java.util.ArrayList;

public class Personagem {

    protected static int i = 0;
    private int id;
    private String nome;
    private String classe;
    private String status;
    private double exp;
    private double hp;
    private double mp;
    private double atk;
    private double esq;
    private double rFogo;
    private double rGelo;
    private double rFisica;
    private int local;

    private int iHp;
    private int cHp;
    private int tHp;

    private int iMp;
    private int cMp;
    private int tMp;

    private int cAtk;
    private int tAtk;

    private int cEsq;
    private int tEsq;

    private int cRfogo;
    private int tRfogo;

    private int cRgelo;
    private int tRgelo;

    private int cRfisica;
    private int tRfisica;

    public Personagem(String nome, int classe, int local) {

        this.i = i + 1;
        this.id = i;
        this.nome = nome;
        this.status = "Saudável";
        this.local = local;
        this.exp = 10;

        switch (classe) {

            case 1:
                Guerreiro();
                break;

            case 2:
                Mago();
                break;

            case 3:
                Ninja();
                break;

            case 4:
                Deus();
                break;

            case 5:
                Goblin();
                break;

            case 6:
                Fogo();
                break;

            case 7:
                Gelo();
                break;

            case 8:
                Dragao();
                break;
        }

    }

    public void Guerreiro() {

        this.classe = "Guerreiro";

        this.iHp = 20;
        this.cHp = 500;
        this.tHp = 250;

        this.iMp = 0;
        this.cMp = 10;
        this.tMp = 200;

        this.cAtk = 85;
        this.tAtk = 200;

        this.cEsq = 40;
        this.tEsq = 250;

        this.cRfogo = 10;
        this.tRfogo = 100;

        this.cRgelo = 15;
        this.tRgelo = 100;

        this.cRfisica = 46;
        this.tRfisica = 150;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void Mago() {

        this.classe = "Mago";

        this.iHp = 15;
        this.cHp = 300;
        this.tHp = 200;

        this.iMp = 90;
        this.cMp = 700;
        this.tMp = 200;

        this.cAtk = 40;
        this.tAtk = 200;

        this.cEsq = 20;
        this.tEsq = 200;

        this.cRfogo = 50;
        this.tRfogo = 110;

        this.cRgelo = 58;
        this.tRgelo = 110;

        this.cRfisica = 10;
        this.tRfisica = 180;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void Ninja() {

        this.classe = "Ninja";

        this.iHp = 21;
        this.cHp = 350;
        this.tHp = 150;

        this.iMp = 5;
        this.cMp = 20;
        this.tMp = 110;

        this.cAtk = 73;
        this.tAtk = 170;

        this.cEsq = 65;
        this.tEsq = 200;

        this.cRfogo = 18;
        this.tRfogo = 100;

        this.cRgelo = 19;
        this.tRgelo = 105;

        this.cRfisica = 22;
        this.tRfisica = 120;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void Deus() {

        this.classe = "◄♦DEUS♦►";

        this.iHp = 8000;
        this.cHp = 8000;
        this.tHp = 8000;

        this.iMp = 8000;
        this.cMp = 8000;
        this.tMp = 8000;

        this.cAtk = 8000;
        this.tAtk = 8000;

        this.cEsq = 8000;
        this.tEsq = 8000;

        this.cRfogo = 8000;
        this.tRfogo = 8000;

        this.cRgelo = 8000;
        this.tRgelo = 8000;

        this.cRfisica = 8000;
        this.tRfisica = 8000;
        this.exp = 8000;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void Goblin() {

        this.classe = "Goblin";

        this.iHp = 10;
        this.cHp = 900;
        this.tHp = 350;

        this.iMp = 0;
        this.cMp = 10;
        this.tMp = 100;

        this.cAtk = 105;
        this.tAtk = 400;

        this.cEsq = 10;
        this.tEsq = 100;

        this.cRfogo = 5;
        this.tRfogo = 100;

        this.cRgelo = 5;
        this.tRgelo = 100;

        this.cRfisica = 5;
        this.tRfisica = 180;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void Fogo() {

        this.classe = "Fogo";

        this.iHp = 90;
        this.cHp = 3200;
        this.tHp = 300;

        this.iMp = 100;
        this.cMp = 3000;
        this.tMp = 300;

        this.cAtk = 60;
        this.tAtk = 400;

        this.cEsq = 22;
        this.tEsq = 110;

        this.cRfogo = 500;
        this.tRfogo = 100;

        this.cRgelo = 10;
        this.tRgelo = 250;

        this.cRfisica = 130;
        this.tRfisica = 170;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void Gelo() {

        this.classe = "Gelo";

        this.iHp = 90;
        this.cHp = 3200;
        this.tHp = 300;

        this.iMp = 100;
        this.cMp = 3000;
        this.tMp = 300;

        this.cAtk = 60;
        this.tAtk = 400;

        this.cEsq = 22;
        this.tEsq = 110;

        this.cRfogo = 10;
        this.tRfogo = 250;

        this.cRgelo = 500;
        this.tRgelo = 100;

        this.cRfisica = 30;
        this.tRfisica = 170;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void Dragao() {

        this.classe = "Dragão";

        this.iHp = 200;
        this.cHp = 10000;
        this.tHp = 250;

        this.iMp = 500;
        this.cMp = 8000;
        this.tMp = 250;

        this.cAtk = 700;
        this.tAtk = 400;

        this.cEsq = 10;
        this.tEsq = 100;

        this.cRfogo = 500;
        this.tRfogo = 300;

        this.cRgelo = 500;
        this.tRgelo = 300;

        this.cRfisica = 800;
        this.tRfisica = 290;

        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();

    }

    public void UpHP() {

        this.hp = ((this.cHp * (1 - (Math.pow(2.71, (-this.exp / this.tHp))))) + this.iHp);
    }

    public void UpMP() {

        this.mp = ((this.cMp * (1 - (Math.pow(2.71, (-this.exp / this.tMp))))) + this.iMp);
    }

    public void UpAtk() {

        this.atk = (this.cAtk * (1 - (Math.pow(2.71, (-this.exp / this.tAtk)))));
    }

    public void UpEsq() {

        this.esq = (this.cEsq * (1 - (Math.pow(2.71, (-this.exp / this.tEsq)))));
    }

    public void UpRfogo() {

        this.rFogo = (this.cRfogo * (1 - (Math.pow(2.71, (-this.exp / this.tRfogo)))));
    }

    public void UpRgelo() {

        this.rGelo = (this.cRgelo * (1 - (Math.pow(2.71, (-this.exp / this.tRgelo)))));
    }

    public void UpRfisica() {

        this.rFisica = (this.cRfisica * (1 - (Math.pow(2.71, (-this.exp / this.tRfisica)))));
    }

    public void UpGeral(double exp) {

        this.exp = this.exp + exp;
        UpHP();
        UpMP();
        UpAtk();
        UpEsq();
        UpRfogo();
        UpRgelo();
        UpRfisica();
    }

    public int getId() {

        return id;
    }

    public double getExp() {

        return exp;
    }

    public String getClasse() {

        return classe;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public void setLocal(int local) {

        this.local = local;
    }

    public int getLocal() {

        return local;
    }

    public void ToString() {

        System.out.println("\n>>> AVATAR <<<");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Experiência: " + exp);
        System.out.printf("HP: " + "%.2f", hp);
        System.out.printf("\nMP: " + "%.2f", mp);
        System.out.printf("\nAtaque: " + "%.2f", atk);
        System.out.printf("\nEsquiva: " + "%.2f", esq);
        System.out.printf("\nResistência Fisica: " + "%.2f", rFisica);
        System.out.printf("\nResistência a Fogo: " + "%.2f", rFogo);
        System.out.printf("\nResistência a Gelo: " + "%.2f", rGelo);
        System.out.println("\nStatus: " + status);
        System.out.println("-------------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Local: " + local);
    }

}
