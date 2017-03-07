package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by RENT on 2017-03-01.
 */
public class WindowNullLayout extends JFrame {
    private JButton jButton;
    private JTextField jTextField;
    private JTextArea textArea;

    public WindowNullLayout() throws HeadlessException {
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);


        jButton = new JButton("Click me");
        jButton.setSize(200,50);
        jButton.setLocation(0,0);
        add(jButton);

        jTextField = new JTextField();
        jTextField.setSize(new Dimension(300, 100));
        jTextField.setLocation(0,100);
        add(jTextField);

        textArea = new JTextArea();
        textArea.setSize(new Dimension(300, 100));
        textArea.setLocation(0,250);
        add(textArea);

        setListiners();


    }

    private void setListiners() {
        jButton.addMouseListener(new MouseListener() {
                                     @Override
                                     public void mouseClicked(MouseEvent e) {
                                         textArea.setText("Witaj : " + jTextField.getText());

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




