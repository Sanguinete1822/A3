import javax.swing.JFrame;
void main() {

    //Setando VAR e
    JFrame janela = new JFrame();
    GamePanel painel = new GamePanel();

    //cofigurando janela JFRAME
    janela.setTitle("Meu jogo");
    janela.setSize(800,600);
    janela.add(painel);
    janela.setVisible(true);

    //configs
    painel.requestFocusInWindow();
}
