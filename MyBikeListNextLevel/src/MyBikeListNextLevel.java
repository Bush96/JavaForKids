import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyBikeListNextLevel {

    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JButton button;
    JLabel label1;
    JLabel label2;
    JComboBox comboBox;
    TextField textField;

    public static void main(String[] args) throws BikeExeptionList {
        MyBikeListNextLevel bln = new MyBikeListNextLevel();
            bln.kill();
        }


    public void kill() throws BikeExeptionList {

        String[] items = {
                "Горник",
                "Взрослик",
                "Дамка"
        };

        frame = new JFrame("Bike Shop Next");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1 = new JPanel();
        panel2 = new JPanel();
        button = new JButton("Сделать заказ");
        comboBox = new JComboBox(items);
        textField = new TextField(20);
        label1 = new JLabel("Модель");
        label2 = new JLabel("Количество");
        panel1.add(label1);
        panel1.add(comboBox);
        panel2.add(label2);
        panel2.add(textField);
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
            message += "Выбрана модель " + comboBox.getSelectedItem() + "\n";
            message += "Количество " + textField.getText() + "\n";
            textField.getText().isEmpty();
            JOptionPane.showMessageDialog(null,
                        message,
                        "Output",
                        JOptionPane.PLAIN_MESSAGE);

            }
        }

        class BikeExeptionList extends Exception {
            public void no() {
                System.out.println("Введите цифры");
            }
        }
    }


