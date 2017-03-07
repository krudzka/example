package view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Created by RENT on 2017-03-01.
 */
public class MyWindow extends JFrame {
    private JButton jButton;
    private JTextField jTextField;
    private JTextArea textArea;
    private final JComboBox<String> jComboBox; // ale tego stringa wcale nie trzeba deklarowac, wtedy bedziemy miec obiekty po prostu
    private MyPanel myPanel;


    public static void main(String[] args) {
        MyWindow myWindow = new MyWindow();
    }

    public MyWindow() throws HeadlessException {
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        jButton = new JButton("Click me");
        add(jButton);

        jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(300, 100));
        add(jTextField);

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(300, 100));
        add(textArea);

        jComboBox = new JComboBox<String>();
        jComboBox.setPreferredSize((new Dimension(100, 200)));
        add(jComboBox);

        DefaultComboBoxModel<String> aModel = new DefaultComboBoxModel<String>();
        jComboBox.setModel(aModel);

        aModel.addElement("Audi");
        aModel.addElement("Volksvagen");
        aModel.addElement("Mazda");

        jComboBox.getSelectedItem(); // zwraca wybrany element

        JScrollBar jScrollBar = new JScrollBar();
        add(jScrollBar);

        JCheckBox jCheckBox = new JCheckBox();
        add(jCheckBox);

        JColorChooser jColorChooser = new JColorChooser();
        add(jColorChooser);

        JLabel jLabel = new JLabel("Podaj imie"); // taka etykieta
        add(jLabel);

        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(300, 300));
        jPanel.setBackground(Color.BLUE);
        add(jPanel);
        jPanel.add(jCheckBox);
        jPanel.setBorder(new LineBorder(Color.GREEN));

        myPanel = new MyPanel();
        myPanel.setPreferredSize(new Dimension(400, 400));
        myPanel.setBackground(Color.YELLOW);
        add(myPanel);



        setListiners();


    }

    private void setListiners() {

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {


            }


            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e.getKeyChar());
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("Enter pressed");
                }
                System.out.println(e.getKeyCode());

            }
        });


        jComboBox.addActionListener(new AbstractAction() {// to nasluchuje czy sie dzieje jakas akcja z naszym comboboxem
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("Item: " + jComboBox.getSelectedItem());

            }
        });
        jButton.addMouseListener(new MouseListener() {
                                     @Override
                                     public void mouseClicked(MouseEvent e) {
                                         // textArea.setText("Witaj : " + jTextField.getText());
                                         textArea.setText("Item: " + jComboBox.getSelectedItem());
                                         myPanel.animate();


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
                                 }
        );
    }
}




