import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyBikeList {
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JButton button;
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;

    public static void main(String[] args) {
        MyBikeList bl = new MyBikeList();
        bl.go();
    }

    public void go() {
        frame = new JFrame("Bike Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel();
        panel2 = new JPanel();
        button = new JButton("Сделать заказ");
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        label1 = new JLabel("Количество");
        label2 = new JLabel("Модель");

        panel1.add(textField1);
        panel1.add(label1);
        panel2.add(textField2);
        panel2.add(label2);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        frame.getContentPane().add(BorderLayout.NORTH, panel2);
        frame.setSize(400, 200);
        frame.setVisible(true);

        button.addActionListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Заказ сделан!\n";
            message += "Выбрана модель " + textField2.getText() + "\n";
            message += "Количество " + textField1.getText() + "\n";
            JOptionPane.showMessageDialog(null,
                    message,
                    "Output",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }
}
