package pacotes;
import pacotes.Main;

import java.util.Scanner;

import static pacotes.Cores.negrito;
import static pacotes.Cores.reset;

public class Menu{
    String menu;
    public Menu(){
    }
    public void exibirMenu(){
        boolean e =true;
        while (e) {
            Scanner sc = new Scanner(System.in);
            int menu;
            System.out.println("===% MENU %===");
            System.out.println("\n[1] Novo Jogo" +
                    "\n[2] Carregar Jogo" +
                    "\n[3] Sair");
            System.out.print("\nEscolha: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1, 2, 3 -> {break;}
                default -> {
                    System.out.println("\nOpção inválida, tente novamente.");
                    System.out.println();
                    menu = 0;
                }
            }
            switch (menu) {
                case 1:
                    e = false;
                    break;

                case 2:
                    System.out.println("Em breve...");
                    System.exit(0);

                case 3:
                    boolean r=true;
                    while (r) {
                        System.out.println(negrito + "\n$====$ || $====$\n" + reset);
                        System.out.println("Deseja realemente sair?");
                        System.out.println("[1] Não\n[2] Sim\n");
                        System.out.print("Escolha: ");
                        menu = sc.nextInt();
                        System.out.println();
                        switch(menu) {
                            case 1,2: {break;}
                            default: menu=0;}
                        switch (menu){
                            case 1:
                                System.out.println("Voltando ao menu...");
                                System.out.println();
                                r = false;
                                break;
                            case 2:
                                System.out.println("Até mais!");
                                System.exit(0);
                        }
                    }
            }
        }
        }
    }
