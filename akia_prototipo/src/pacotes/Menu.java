package pacotes;
import static pacotes.Cores.*;
import static pacotes.BDD.*;

import java.util.InputMismatchException;

public class Menu{
    String menu;
    public Menu(String menu){
        this.menu = menu;
    }
    public void exibirMenu(){
        if (menu.equals("Inicial")){
            boolean menu_w = true;
            int menu;
            while (menu_w) {

                try {
                    System.out.println("===% MENU %===");
                    System.out.println("""
                            
                            [1] Novo Jogo
                            [2] Carregar Jogo
                            [3] Sair""");
                    System.out.print("\nEscolha: ");
                    menu = sc.nextInt();
                    sc.nextLine();

                } catch (InputMismatchException e) {
                    System.out.println("\nOpção inválida, digite novamente.\n");
                    sc.nextLine();
                    menu = 0;
                    continue;
                }

                switch (menu) {
                    case 1:
                        menu_w = false;
                        break;

                    case 2:
                        System.out.println("Em breve...");
                        System.exit(0);

                    case 3:
                        boolean menu_ = true;
                        while (menu_) {
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
                                menu_ = false;
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
        // outros menus
    }
}