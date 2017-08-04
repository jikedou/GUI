import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by admin on 2017/8/4.
 */
public class TestFrame {
    public static void main(String[] args) {
        Frame f=new Frame("欢迎登陆");
//        f.setLocation(100, 100);//设置窗口的左上角位置
//        f.setSize(500, 500);//设置窗口的大小
        f.setBounds(100,100,500,300);
//        f.setTitle("欢迎登陆");//设置窗口的标题，可以直接在初始化的时候天剑title
        Color color=new Color(200, 200, 200);
        f.setBackground(color);//设置窗口的背景颜色
        f.setVisible(true);//设置窗口的可见与不可见,最后设置这个属性
        f.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("关闭");
                f.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub

            }
        });
    }
}
