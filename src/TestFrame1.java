import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by admin on 2017/8/4.
 */
public class TestFrame1{
    public static void main(String[] args) {
        Frame f = new Frame("HelloWorld");
        f.setBounds(300, 300, 500, 400);
        f.setVisible(true);
//        f.addWindowListener();
        //适配器模式
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
