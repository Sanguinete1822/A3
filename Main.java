import javax.swing.JFrame;
void main() {

//Setando VAR e
    //Biblioteca JFrame, que cria uma janela vazia mas pode ser configurada para criar objetos dentro
    JFrame janela = new JFrame();
    //Bibliotea JPanel com classe GamePanel, permite a criação de objetos configuráveis e codáveis dentro de
    //uma janela JFrame
    GamePanel painel = new GamePanel();

//cofigurando janela JFRAME
    //Título da Janela
    janela.setTitle("Meu jogo");
    //Tamanho da Janela
    janela.setSize(800,600);
    //de onde será tirada a configuração da janela (no caso painel que é a classe GamePanel) (janela.add procura
    //o construtor na classe que reside no painel e roda aquele código
    janela.add(painel);
    //Torna a JFrame visível com true e invisível com false
    janela.setVisible(true);

//configs
    //requisita um foco nas ações do usuário na tela configurada de painel, tornando possível usar o Scanner na
    //classe Game Panel
    painel.requestFocusInWindow();
}
