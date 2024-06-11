import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JButton ativar;
    JButton desativar;
    JLabel label;
    MyFrame (){

        ImageIcon iconButton = new ImageIcon("poop.png");

        ativar = new JButton();
        ativar.setText("ativar");
        ativar.setBounds(100,300,100,40);
        ativar.setFont(new Font("Comic Sans",Font.BOLD,15));
        ativar.addActionListener(this);

        desativar = new JButton();
        desativar.setText("desativar");
        desativar.setBounds(200,300,100,40);
        desativar.setFont(new Font("Comic Sans",Font.BOLD,15));
        desativar.addActionListener(this);

        

        button = new JButton(); // criar botão
        button.setBounds(100,100,200,200); // adicionar tamanho
        button.addActionListener( e -> System.out.println("poop") ); // implementa uma
        // um Listener para o botão
        button.setText("poop");
        button.setFocusable(false);// adiciona o botão 'focável'
        button.setIcon(iconButton);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(ativar);
        this.add(desativar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == desativar){
            button.setEnabled(false);
        } else if(e.getSource() == ativar){
            button.setEnabled(true);
        }
    }
}
