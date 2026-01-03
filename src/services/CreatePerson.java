package services;

import classes.Person;

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
        newPerson.setLife(100);
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
        System.out.println("Sua forca é "+ forca);



    }
}
