
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FileCopySwing extends Component {
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JButton button1;
    JButton button2;
    JButton buttonCopy;
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;
    JFileChooser fileChooserFrom;
    JFileChooser fileChooserTo;

    public static void main(String[] args) {
        FileCopySwing fc = new FileCopySwing();
        fc.go();
    }

    public void go() {
        frame = new JFrame("File Copy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();
        fileChooserFrom = new JFileChooser();
        fileChooserTo = new JFileChooser();

        label1 = new JLabel("Copy from: ");
        label2 = new JLabel("Copy to: ");

        textField1 = new JTextField(20);
        textField2 = new JTextField(20);


        button1 = new JButton("Browser");
        button1.addActionListener(new fileChooserListenerFrom());
        button2 = new JButton("Browser");
        button2.addActionListener(new fileChooserListenerTo());
        buttonCopy = new JButton("Copy");
        buttonCopy.addActionListener(new CopyListener());

        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(button1);

        panel2.add(label2);
        panel2.add(textField2);
        panel2.add(button2);

        frame.getContentPane().add(BorderLayout.SOUTH, buttonCopy);
        frame.getContentPane().add(BorderLayout.NORTH, panel1);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);

        frame.setSize(500, 200);
        frame.setVisible(true);

    }


    class fileChooserListenerFrom implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = fileChooserFrom.showOpenDialog(frame.getContentPane());

            if (i == JFileChooser.APPROVE_OPTION) {

                File selectedFile = fileChooserFrom.getSelectedFile(); //
                textField1.setText(selectedFile.getName());

            }
        }
    }

    class fileChooserListenerTo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int i = fileChooserTo.showOpenDialog(frame.getContentPane());

            if (i == JFileChooser.APPROVE_OPTION) {

                File selectedFile = fileChooserTo.getSelectedFile(); //
                textField2.setText(selectedFile.getName());
            }
        }
    }

    class CopyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            FileWriter myFileOff = null;
            BufferedWriter buffOff = null;
            FileReader myFile = null;
            BufferedReader buff = null;
            try {
                myFile = new FileReader(fileChooserFrom.getSelectedFile());
                buff = new BufferedReader(myFile);
                while (true) {
// считывается строка из файла scores.txt
                    String line = buff.readLine();
// проверка достижения конца файла
                    if (line == null) break;
                    System.out.println("Содержание файла: "+ line);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    buff.close();
                    myFile.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            try {
                myFileOff = new FileWriter(fileChooserTo.getSelectedFile());
                buffOff = new BufferedWriter(myFileOff);
                File x = fileChooserFrom.getSelectedFile();
                buffOff.write(String.valueOf(x));                          //зашел я тута в тупик, копируется ерунда а не информация
                System.out.println("А скопировали мы :" + x);              //а так все гуд, только это не нащупал
            } catch (IOException exi) {
                exi.printStackTrace();
            } finally {
                try {
                    buffOff.close();
                    myFileOff.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}