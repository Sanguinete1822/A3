import helper_classes.*;
import java.awt.Image;
import javax.swing.*;
import java.awt.Color;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("O Livro dos Algoritmos");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //frame.setSize(960, 640);//
     JPanel panel = new JPanel();
     panel.setPreferredSize(new java.awt.Dimension(960, 640));
     panel.setLayout(null);
     panel.setBackground(Color.BLACK);
     

     JLabel lblTitulo = new JLabel("O Livro dos Algoritmos");
     lblTitulo.setBounds(250, 35, 460, 40);
     lblTitulo.setFont(CustomFontLoader.loadFont("./GUIBuilder/resources/fonts/PressStart2P-Regular.ttf", 20));
     lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
     lblTitulo.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblTitulo);

     ImageIcon iconeLivro = new ImageIcon("./GUIBuilder/resources/Livro.png");
     JLabel lblLivro = new JLabel(iconeLivro);
     lblLivro.setBounds(380, 140, 200, 200);
     panel.add(lblLivro);

     JLabel lblCena = new JLabel("O Despertar...");
     lblCena.setBounds(380, 365, 200, 30); 
     lblCena.setHorizontalAlignment(SwingConstants.CENTER);
     lblCena.setFont(CustomFontLoader.loadFont("./GUIBuilder/resources/fonts/VT323-Regular.ttf", 30));
     lblCena.setForeground(Color.decode("#D9D9D9"));
     panel.add(lblCena);

     RoundedTextArea txtADialogo = new RoundedTextArea("Antes de compreender a máquina, você precisa aprender a falar com ela.",10,Color.decode("#979797"),1);
     txtADialogo.setBounds(180, 440, 600, 100);
     txtADialogo.setFont(CustomFontLoader.loadFont("./GUIBuilder/resources/fonts/Lexend.ttf", 16));
     txtADialogo.setBackground(Color.decode("#B2B2B2"));
     txtADialogo.setForeground(Color.decode("#353535"));
     txtADialogo.setLineWrap(true);
     txtADialogo.setWrapStyleWord(true);
     txtADialogo.setEditable(false);
     txtADialogo.setFocusable(false);
     txtADialogo.setBorder(new RoundedBorder(10, Color.decode("#979797"), 4));
     panel.add(txtADialogo);

     RoundedButton btnContinuar = new RoundedButton("Continuar");
     btnContinuar.setBounds(650, 550, 130, 35);
     btnContinuar.setRaio(30);
     btnContinuar.setCorBorda(Color.GRAY);
     btnContinuar.setEspessuraBorda(3);
     btnContinuar.setBackground(Color.decode("#444343"));
     btnContinuar.setForeground(Color.decode("#D9D9D9"));
     btnContinuar.setFont(CustomFontLoader.loadFont("./GUIBuilder/resources/fonts/Lato.ttf", 14));
     btnContinuar.setBorder(new RoundedBorder(10, Color.decode("#979797"), 4));
     btnContinuar.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(btnContinuar, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(btnContinuar);


     
     frame.add(panel);
     frame.pack();
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);

  }
}