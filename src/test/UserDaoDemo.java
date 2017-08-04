package test;

/**
 * Created by admin on 2017/8/4.
 * 问题：
 *      接口方法比较多   实现类(仅仅使用一个，也得把其他的实现，哪怕是空实现)
 * 解决方案：
 *      接口方法比较多===适配器类（去实现接口，仅仅空实现）===实现类（用哪个重写那个）
 */
public class UserDaoDemo extends UserAdapter {
    public static void main(String[] args) {
//        UserDao ud = new UserDaoImpl();
//        ud.add();
//        UserDaoDemo udd = new UserDaoDemo();
//        UserDaoImpl udi = new UserDaoImpl();
//        udi.add();
        UserDaoDemo udd = new UserDaoDemo();

    }
}
