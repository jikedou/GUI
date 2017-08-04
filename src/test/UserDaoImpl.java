package test;

/**
 * Created by admin on 2017/8/4.
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void del() {
        System.out.println("删除");

    }

    @Override
    public void update() {
        System.out.println("更改");

    }

    @Override
    public void find() {

        System.out.println("查找");
    }
}
