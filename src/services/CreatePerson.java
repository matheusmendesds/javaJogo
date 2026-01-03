package services;

import classes.Person;
import java.util.Timer;
import java.util.Scanner;

public class CreatePerson {
    int total = 60;
    int forca = 50;
    int vel = 50;
    int res = 50;
    int ptsForca;
    int ptsVel;
    int ptsRes;
    public void CreatingPerson() {
        Person newPerson = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inicio do Jogo");
        System.out.println("Nome:");
        String nome = "Personagem Principal";
        newPerson.setName(nome);
        System.out.println("Bem vindo , você é o "+ nome);

        System.out.println("Seu personagem possui três atributos :Força, Resistencia e Velocidade");
        System.out.println("Você começa com 50 pontos em cada atributo , agora divida mais 60 pontos entre os três atributos e sua vida inicial será calculada");
        System.out.println("Pontos para Força (0-50)");
        ptsForca = scanner.nextInt();

        if (ptsForca < 0 || ptsForca > 50)  {
            ptsForca = 0;
            System.out.println("Insira um numero entre 0 e 50");
            System.out.println("Pontos para Força (0-50)");
            ptsForca = scanner.nextInt();
            forca = forca + ptsForca;
        } else {
            forca = forca + ptsForca;
            System.out.println("Sua força é=" + forca);
        }
        int restantes = total - ptsForca;
        System.out.println("Pontos para velocidade"+", pontos restantes " + restantes);
        ptsVel = scanner.nextInt();
        if (ptsVel > restantes) {
            ptsVel = 0;
            System.out.println("Você não pontos suficientes, insira no maximo "+ restantes +" pontos");
            ptsVel = scanner.nextInt();
            vel = ptsVel + vel;
        } else {
            vel = ptsVel + vel;
        }

        restantes = total - ptsForca - ptsVel;

        System.out.println("Pontos para resistencia"+", pontos restantes " + restantes);
        ptsRes = scanner.nextInt();
        if(ptsRes > restantes) {
            ptsRes = 0;
            System.out.println("Você não pontos suficientes, insira no maximo "+ restantes +" pontos");
            ptsRes = scanner.nextInt();
            res = ptsRes + res;
        } else {
            res = ptsRes + res;
        }
        int vida = (forca + vel + res)/3;
        newPerson.setLife(vida);
        System.out.println("Sua forca é "+ forca);
        System.out.println("Sua velocidade é "+ vel);
        System.out.println("Sua forca é "+ res);
        System.out.println("Sua vida é " + vida);



    }
    public void fuga(int velVilao , int forVilao) {
        if (vel > velVilao ) {
            System.out.println("Você fugiu temporariamente, escolha sua proxima ação");
        } else if (vel == velVilao || forca > forVilao) {
            System.out.println("Ele quase te pegou mas você conseguir fugir, escolha sua proxima ação");
        } else {
            System.out.println("Você tentou fugir mas não foi rapido o suficiente , tente novamente");
        }
    }
    public void primeiraLuta() throws InterruptedException {
        String nomeVilao = "Ghost";
        int forcaVilao = 60;
        int velVilao = 80;
        int resVilao = 65;
        int vidaVIlao = (forcaVilao + velVilao + resVilao)/3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Não fique pensando no passado...");
        Thread.sleep(2000);
        System.out.println("O Fantasma está perto de você , o deseja fazer");
        System.out.println("1-Fugir 2-Lutar");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            fuga(velVilao,forcaVilao);
        }else {
            System.out.println("A luta vai começar");
        }
    }
}
