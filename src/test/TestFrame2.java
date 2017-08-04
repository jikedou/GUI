package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by admin on 2017/8/4.
 */
public class TestFrame2 {
    public static void main(String[] args) {
        Frame f = new Frame("按钮点击事件");
        f.setBounds(100, 100,800,400);
        Button button = new Button("11");
        button.setSize(5,5);

        Color c = new Color(200,100,100);
        Color c1 = new Color(100,50,50);
        button.setBackground(c);
        Button btn2 = new Button("22");
        btn2.setSize(5,5);

        f.add(button);
        f.add(btn2);
//        button.setVisible(true);
        button.addActionListener(new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
