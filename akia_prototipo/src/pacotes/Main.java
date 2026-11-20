package pacotes;

import java.util.Scanner;

import static pacotes.Cores.*;

public class Main {
    public Main(){    }
    public static void iniciarjogo(){
        System.out.print("==============================================================" );
        System.out.println("""
                                                   \s
       ________ _________ ________ __________ ____ ________________\s
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
        System.out.print("==============================================================\n");
        System.out.println();

        new Menu().exibirMenu();

        Scanner sc = new Scanner(System.in);
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

        System.out.println("""
               \s
                [1]|Continuar\s
                [2] Fragmentos de Memórias
                [3] Sair""");

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
