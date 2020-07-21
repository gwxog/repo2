package cn.itcast.aop_xml;

public class UserImpl implements User {

    public void work() {
        System.out.println("我爱加班!!");
    }

    public void addUser() {
        System.out.println("添加用户");
    }

    public void deleteUser() {
        System.out.println("删除用户");

    }

    public void updateUser() {
        System.out.println("修改用户");
        int i = 1/0;
    }

    public void queryUser() {
        System.out.println("查询用户");
    }

    public void batchDeleteUser() {
        System.out.println("批量删除用户");
        int i = 1/0;
    }
}
