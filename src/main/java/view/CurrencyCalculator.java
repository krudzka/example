package view;

import com.sun.javafx.css.CalculatedValue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by RENT on 2017-03-02.
 */
public class CurrencyCalculator extends JFrame {

    private JPanel jPanel;
    private JTextField jTextField;
    private JTextArea jTextArea;
    private JButton jButton;
    private JComboBox jComboBox;


    public static void main(String[] args) {
        new CurrencyCalculator();
    }




    public CurrencyCalculator() throws HeadlessException {
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel jLabel = new JLabel("Podaj kwotę w PLN");
        jLabel.setSize(new Dimension(150, 100));
        jLabel.setLocation(10, 40);
        add(jLabel);

        JLabel jLabel1 = new JLabel("Kwota w walucie");
        jLabel1.setSize(new Dimension(150, 100));
        jLabel1.setLocation(10, 340);
        add(jLabel1);


        jButton = new JButton("Przelicz");
        jButton.setSize(new Dimension(100, 100));
        jButton.setBackground(Color.BLUE);
        jButton.setLocation(300, 250);
        add(jButton);

        jTextArea = new JTextArea();
        jTextArea.setSize(new Dimension(150, 100));
        jTextArea.setLocation(10, 100);
        add(jTextArea);

        jTextField = new JTextField();
        jTextField.setSize(new Dimension(150, 100));
        jTextField.setLocation(10, 400);
        add(jTextField);

        String[] combobox = new String[]{"EURO", "DOLAR", "FRANK"};
        jComboBox = new JComboBox<>(combobox);
        jComboBox.setSize(50, 150);
        jComboBox.setLocation(200, 200);
        add(jComboBox);
        setListiners();
    }


    private void setListiners() {
        jButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                convertion();


            }

            private void convertion() {
                try {

                    String money = (String) jComboBox.getSelectedItem();
                    String result = "EURO ";
                    switch (money) {
                        case "EURO":
                            result = String.valueOf(Double.valueOf(jTextArea.getText()) / 4.5);
                            break;
                        case "DOLAR":
                            result = String.valueOf(Double.valueOf(jTextArea.getText()) / 3.5);
                            break;
                        case "FRANK":
                            result = String.valueOf(Double.valueOf(jTextArea.getText()) / 4.0);
                            break;
                    }

                    jTextField.setText(result);
                } catch (NumberFormatException e1) {
                    jTextField.setText("Niepoprawna liczba");

                    JOptionPane.showMessageDialog(getParent(), "wrong number", "ERROR", JOptionPane.ERROR_MESSAGE);

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }


}


