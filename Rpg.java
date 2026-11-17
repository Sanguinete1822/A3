import javax.swing.*;
import java.awt.*;

public class Rpg {
    public static void main(String[] args) {

        JFrame tela = new JFrame("Jogo");
        tela.setSize(960,640);
        gamePanel cenario = new gamePanel();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.add(cenario);
        cenario.setBackground(Color.BLACK);

        JLabel rotulo = new JLabel();

        JTextArea areaTexto = new JTextArea(10,30);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        cenario.add(scrollPane, BorderLayout.CENTER);
        tela.add(cenario);

        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        }
    }
