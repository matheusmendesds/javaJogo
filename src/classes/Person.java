package classes;

import java.util.Scanner;

public class Person {
    private String name;
    private int life ;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public Object criarPerson (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do Personagem:");
        String nome = scanner.nextLine();
        return nome;
    }
}
