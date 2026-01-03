import services.CreatePerson;
import services.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.CriarMenu();
        int opcao = scanner.nextInt();
        if (opcao == 1){
            System.out.println("inicio");
            CreatePerson newPerson = new  CreatePerson();
            newPerson.CreatingPerson();


        } else if (opcao == 2){
            System.out.println("configuraçoes");
        } else if (opcao == 3) {
            System.out.println("saiu");

        } else {
            System.out.println("Erro");
        }

    }
}