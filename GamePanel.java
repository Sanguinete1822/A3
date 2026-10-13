import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GamePanel extends JPanel implements KeyListener {

//Variáveis globais
    //posição (x,y) lembrando que a linha das coordenadas deste gráfico são contrárias
    int y = 50;
    int x = 100;

    //velocidade da bola
    int velocy = 0;
    int velocx = 0;

    //gravidade
    int gravidade = 1;

    //indicador para chão
    boolean naBase ;

    //movimentos
    boolean esquerda = false;
    boolean direita = false;
    boolean pulo = false;

//funcionamento

    //timer de ações
    Timer tim = new Timer(10, e ->{
        atualizar();
        repaint();
    });

    //Construtor (o que é executado pelo Main)
    public GamePanel(){
        addKeyListener(this);
        setFocusable(true);
        tim.start();
    }

    //Override permite alterar o funcionamento de um objeto
    @Override

    //objeto
    protected void paintComponent(Graphics rec) {
        //apaga toda a tela a cada ciclo de repaint()
        super.paintComponent(rec);
        //Objeto preenchido de forma oval chamado de "rec" com posições variáveis e tamanhos constantes
        rec.fillOval(x,y,50,50);
    }

    //controle de movimentação e posição da bolinha ( atualizar está sendo chamado a cada *Timer(>>x<<,y)
    //linha 27)
    void atualizar() {
        //pulo (getHeight pega o tamanho da janela naquele momento e torna isso em valor)
        if (y < getHeight() - 50 ){
            velocy += gravidade;
            y += velocy;
        }else {
            y = getHeight() - 50;
            velocy = 0;
        }
        if (y < getHeight() -50){
            naBase = false;
        } else {
            naBase = true;
        }
        if (!esquerda){
            velocx = 0;
        } else {
            velocx = -1;
            x += velocx;
        }
        if (!direita){
            velocx = 0;
        }else {
            velocx = 1;
            x += velocx;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    //Teclas pressionadas ( quando pressionado uma vez e solto na mesma hora, o valor é chamado duas vezes
    //quando clicado e quando solto (press e realeas), já quando a tecla é pressionada, ela é chamada uma vez
    // e depois de um delay ~500ms ela é chamada até ser solta
    public void keyPressed(KeyEvent e) {
        System.out.println("Tecla pressionada: " + e.getKeyCode());
        // coloca o código da tecla pressionada na variável tecla
        int tecla = e.getKeyCode();
        if (tecla == KeyEvent.VK_SPACE && naBase || tecla == 38 && naBase) {
            System.out.println("Pulou!!");
            velocy = -20;
            y += velocy;
        }
        if (tecla == 39){
            direita = true;
        }
        if (tecla == 37){
            esquerda = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        //falsifica o movimento para deseterniza-lo quando a tecla é solta (realease)
        System.out.println("Tecla solta: " + e.getKeyCode());
        int tecla = e.getKeyCode();
        if (tecla == KeyEvent.VK_SPACE && naBase || tecla == 38 && naBase) {
            pulo = false;
        }
        if (tecla == 39){
            direita = false;
        }
        if (tecla == 37){
            esquerda = false;
        }
    }
}
