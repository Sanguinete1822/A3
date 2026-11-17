
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        String negrito = "\u001B[1m";
        String reset = "\u001B[0m";

        System.out.printf("==============================================================" );
         
    
        System.out.println("""
                                                    
       ________ _________ ________ __________ ____ ________________ 
      |        |         |        |          |    |                |
      |  o  o  | *  *  * |  |‾‾|  | :  :  :  | [] |   []  []  []   |
      |  o  o  | *  *  * |  |  |  | :  :  :  | [] |   []  []  []   |
      |  o  o  | *  *  * |  |  |  | :  :  :  | [] |   []  []  []   |
      |  o  o  | *  *  * |  |__|  | :  :  :  | [] |   []  []  []   |
      |________|_________|__|__|__|__________|____|________________|
      |__|__|__|__|__|_ _|__|__|__|__|____|__|____|____|______|____|""");
      System.out.println();

        System.out.println("==============================================================\n");
        System.out.println(negrito + "                           AK'IA       ");
        System.out.println("                                                 ");
        System.out.printf("==============================================================\n");
        System.out.println();

        //Variavel
        int menu = 0;
        int opcao;


        while (true) {

        try {
            System.out.println(negrito + "===% MENU %===" + reset);

            System.out.println("\n[1] Novo Jogo" + 
                               "\n[2] Carregar Jogo" +
                               "\n[3] Sair" + reset);
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
                iniciarjogo();
                break;
            
        
             case 2:
                System.out.println("Em breve...");
                System.exit(0);
                
             case 3:
                while (true) {
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
    
    private static void iniciarjogo(){

        String negrito = "\u001B[1m";
        String reset = "\u001B[0m";
        String magenta = "\u001B[35m";
        String azul = "\u001B[36m";
        String azulClaro = "\u001B[34m";
        String vermelho = "\u001B[31m";
        String verde = "\u001B[32m";
        int progresso = 0;
        

        System.out.println();
        System.out.println(negrito + vermelho + "|INICIALIZANDO PROTOCOLO...|" + reset);
        System.out.println();

        
        System.out.println( negrito + "[SISTEMA]\n" + 
            azul + "\nIDENTIFICAÇÃO: JIN\n" + reset +
            magenta + "\nVocê é Jin, um contrabandista que sobrevive em uma sociedade devastada por uma catástrofe provocada pelo avanço da Inteligência Artificial.\n" + //
            "\n" + //
            "Após o colapso, a humanidade se dividiu entre aqueles que aderiram à tecnologia e aqueles que decidiram rejeitá-la.Recursos, territórios e oportunidades passaram a ser disputados entre os dois lados.\n" + //
            "\n" + //
            "Agora, Jin tem um objetivo, chegar ao núcleo onde reside a inteligência artificial responsável pela catástrofe e que continua alimentando o conflito.\n" + //
            "\n" + //
            "Para isso, será necessário aprender e aplicar conceitos em Java.\n" + reset + //
            "\n" + //
            negrito + azulClaro + "Sua jornada começa agora!\n" + reset);

            System.out.println(magenta + "Durante uma operação de contrabando, você encontrou o Nexus, um dispositivo capaz de armazenar,\n" + //
            "\n" + //
            "interpretar e organizar conhecimentos. Desde então, ele se tornou seu principal recurso para\n" + //
            "\n" + //
            "compreender e interagir com tecnologias desconhecidas.\n" + reset);

        System.out.print("[Aperte" + negrito + " ENTER " + reset + "para continuar]");
        sc.nextLine();
        System.out.println();

        System.out.println("=========================");
        System.out.println(negrito + "          AK'IA");
        System.out.println("=========================");
        System.out.println("CAPITULO I - PROLÓGO");
        System.out.println("Progresso: " + progresso + "/6");


        System.out.println("\n[1]|Continuar " + 
                               "\n[2] Fragmentos de Memórias" +
                               "\n[3] Sair" + reset);
        



        System.out.println();
        System.out.println();

        System.out.println(vermelho + negrito + "[CAPITULO I - PRIMEIRO CONTATO]\n" + reset);
        System.out.println(negrito + "[SISTEMA]\n" + verde + "LOCALIZAÇÃO IDENTIFICADA" + reset);
        System.out.println(negrito + "\nLaboratório 01\n" + reset);

        System.out.println("Depois de atravessar uma região de instalações abandonadas, você finalmente encontra um laboratório que parece ter permanecido isolado desde o colapso.\n" + //
        "\n" + //
        "Diferentemente dos outros lugares por onde passou, este ainda mantém seus sistemas de segurança ativos.\n" + //
        "\n" + //
        "À sua frente, uma enorme porta metálica impede a entrada. O acesso está bloqueado e não há sinais de funcionamento manual.\n" + //
        "\n" + //
        "É hora de recorrer ao dispositivo que você encontrou anteriormente.");

        

        





        





                        
                        

    }  
}