import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JOptionPane =    pop up a standard dialog box that prompts users for a value
        //                  or informs them of something.


        // tipos de mensagem
//        JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is some useless info :D","title",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"really","title",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"your computer has virus","title",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Call tech support now","title",JOptionPane.ERROR_MESSAGE);

        // retorna um valor para a variavel answer = 1,2,-1
//        int answer = JOptionPane.showConfirmDialog(null,"bro, do you even code? ", "this is my title",JOptionPane.YES_NO_CANCEL_OPTION);

        // retorna um valor para a variavel name
//        String name = JOptionPane.showInputDialog("What is your name?: ");
//        System.out.println("hello "+name);

        String [] responses = {"no, you're awesome!","thank you!","*blush*" };
        // ImageIcon icon = new ImageIcon("smile.png");


        int answer = JOptionPane.showOptionDialog(null,
                "You are awesome! ",
                "secret message",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,responses,
                0 );

        if (answer == 0){
            JOptionPane.showMessageDialog(null,"wow","title",JOptionPane.INFORMATION_MESSAGE);
        } else if (answer == 1) {
            JOptionPane.showMessageDialog(null,"WOW","title",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"bla bla","title",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}