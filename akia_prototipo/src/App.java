import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        String negrito = "\u001B[1m";
        String reset = "\u001B[0m";

        System.out.printf("===========================\n");
        System.out.println();
        System.out.println(negrito + "          AK'IA" + reset);
        System.out.println();
        System.out.printf("===========================\n");
        System.out.println();

        //Variavel
        int menu = 0;
        int opcao;


        while (true) {

        try {
            System.out.println("1. Novo Jogo\n2. Carregar Jogo\n3. Sair");
            System.out.print("\nDigite uma opção: ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
        } catch (InputMismatchException e) {
            System.out.println("\nOpção inválida, digite novamente.\n");
            sc.nextLine();
            continue;
        }

        switch (menu) {
             case 1:
                System.out.println("Digite o nome do personagem: ");
                iniciarjogo();
            break;
        
             case 2:
            System.out.println("Em breve...");
            System.exit(0);
            break;

             case 3:
            while (true) {
            System.out.println();
            System.out.println("Deseja realemente sair?");
            System.out.println("1. Não\n2. Sim\n");
            opcao = sc.nextInt();
            System.out.println("\nDigite uma opção: ");
            System.out.println();

            if (opcao == 2) {
                System.out.println("Obrigado por jogar!");
                System.exit(0);

            } else if (opcao == 1) {
                System.out.println("Voltando ao menu...");
                System.out.println();
                break;

            } else {
                System.out.println("Opção inválida, digite novamente.");
            }
        }
            break;
             default:
                System.out.println("\nOpção inválida, tente novamente.");
        }
    }
    }  
    
    private static void iniciarjogo(){
        System.out.println("oi");

    }  
}
    

