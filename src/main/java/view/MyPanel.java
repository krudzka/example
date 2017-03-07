package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RENT on 2017-03-01.
 */
public class MyPanel extends JPanel {
    public int y = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//
//        g.setColor(Color.RED);
//        g.drawLine(10, y, 50, y);
//        g.drawOval(150,y,200,y);
        g.setColor(Color.BLUE);
//        g.drawLine(10,10,100,10);
//
//        g.drawLine(10,10,55,88);
//        g.drawLine(100,10,55,88);




    }

    public void animate() {
        Timer timer = new Timer(10, null);  //pierwsze to opoznienie w ms
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y++;
                repaint();

                if (y >= getHeight()) {
                    timer.stop();
                }
            }
        });
        timer.start();
    }
}
