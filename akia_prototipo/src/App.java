import java.util.InputMismatchException;
import java.util.Scanner;

import pacotes.Menu;
import pacotes.Main;

import static pacotes.Cores.*;


 public class App {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Menu men = new Menu("Inicial");


        
        String negrito = "\u001B[1m";
        String reset = "\u001B[0m";

        System.out.printf("==============================================================" );
         
    
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

        //Variavel
        int menu = 0;
        int opcao;

        
        

    }  
    
    
}