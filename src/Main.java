import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame jframe = testFrame();
        JPanel jpanel = new JPanel();

        jframe.add(jpanel);

        JButton red = new JButton("RED");
        JButton green = new JButton("GREEN");
        JButton blue = new JButton("BLUE");

        jpanel.add(red);
        jpanel.add(green);
        jpanel.add(blue);

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpanel.setBackground(Color.RED);
            }
        });
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpanel.setBackground(Color.GREEN);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpanel.setBackground(Color.BLUE);
            }
        });
    }

    static JFrame testFrame() {
        JFrame jframe = new JFrame();

        jframe.setBounds(700, 700, 400, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);

        return jframe;
    }


}