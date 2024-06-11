import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceLogin extends JFrame {
    private JTextField textField1;
    private JButton button;

    private String senhaVer;

    public InterfaceLogin() {
        // Configurações básicas da janela
        setTitle("Interface do Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);


        // Inicializa os componentes
        initializeUI();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Ação a ser realizada quando o botão for clicado
                    setSenhaVer(textField1.getText());
                    Banco verificar = new Banco(getSenhaVer());
                    verificar.Login();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "ERRO: insira dados válidos");
                }
            }
        });
    }

    private void initializeUI() {
        // Criando os componentes
        textField1 = new JTextField(10);
        button = new JButton("login");

        // Configurando o layout
        setLayout(new GridLayout(4, 2, 5, 5));

        // Adicionando os componentes à interface
        add(new JLabel("        senha: "));
        add(textField1);
        add(button);
    }

    public String getSenhaVer() {
        return senhaVer;
    }

    public void setSenhaVer(String senhaVer) {
        this.senhaVer = senhaVer;
    }
}
