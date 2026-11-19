package pacotes;
import pacotes.Main;
import static pacotes.Cores.*;
import static pacotes.BDD.*;

import java.util.InputMismatchException;

public class Menu{
    String menu;
    public Menu(String menu){
        this.menu = menu;
    }
    public void exibirMenu(){
        int njog = 0;
        njog+=1;
        if (menu.equals("Inicial")){
            boolean teste = true;
            int menu;
            while (teste) {

                try {
                    System.out.println("===% MENU %===");
                    System.out.println("\n[1] Novo Jogo" +
                            "\n[2] Carregar Jogo" +
                            "\n[3] Sair");
                    System.out.print("\nEscolha: ");
                    menu = sc.nextInt();
                    sc.nextLine();

                } catch (InputMismatchException e) {
                    System.out.println("\nOpção inválida, digite novamente.\n");
                    sc.nextLine();
                    continue;
                }

                switch (menu) {
                    case 1:
                        int jog = 1;
                        Main jogo = new Main(jog);
                        jogo.iniciarjogo();
                        break;


                    case 2:
                        System.out.println("Em breve...");
                        System.exit(0);

                    case 3:
                        while (true) {
                            int opcao;
                            System.out.println(negrito + "\n$====$ || $====$\n" + reset);
                            System.out.println("Deseja realemente sair?");
                            System.out.println("[1] Não\n[2] Sim\n");
                            System.out.print("Escolha: ");
                            opcao = sc.nextInt();
                            System.out.println();

                            if (opcao == 2) {
                                System.out.println("Até mais!");
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
                        System.out.println();

                }
            }
        }
    }
}