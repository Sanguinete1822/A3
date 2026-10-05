import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class GamePanel extends JPanel implements KeyListener {
    int y = 50;
    int x = 100;
    int velocy = 0;
    int velocx = 0;
    int gravidade = 1;
    boolean naBase ;
    boolean esquerda = false;
    boolean direita =false;
    Timer tim = new Timer(10, e ->{
        atualizar();
        repaint();
    });
    public GamePanel(){
        addKeyListener(this);
        setFocusable(true);
        tim.start();
    }
    @Override
    protected void paintComponent(Graphics rec) {
        super.paintComponent(rec);
        rec.fillOval(x,y,50,50);
    }
    void atualizar() {
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
        if (esquerda){
            velocx = -1 ;
            x += velocx;
        }
        if (direita){
            velocx = 1;
            x += velocx;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Tecla: " + e.getKeyCode());
        int tecla = e.getKeyCode();
        if (tecla == KeyEvent.VK_SPACE && naBase || tecla == 38 && naBase) {
            System.out.println("Pulou!!");
            velocy = -20;
            y += velocy;
        }
        if (tecla == 39){
            direita = true;
        }else {
            direita = false;
        }
        if (tecla == 37){
            esquerda = true;
        } else {
            esquerda = false;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}