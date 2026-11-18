package pacotes;
public class Menu{
    String menu;
    public Menu(String menu){
        this.menu = menu;
    }
    public void exibirMenu(){
        if (menu.equals("Inicial")){
            System.out.println("===% MENU %===");
            System.out.println("\n[1] Novo Jogo" +
                    "\n[2] Carregar Jogo" +
                    "\n[3] Sair");
            System.out.print("\nEscolha: ");
        }
    }
}