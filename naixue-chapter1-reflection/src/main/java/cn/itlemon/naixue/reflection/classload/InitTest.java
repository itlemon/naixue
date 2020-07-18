package cn.itlemon.naixue.reflection.classload;

/**
 * @author jiangpingping
 * @date 2020/7/16 22:49
 */
public class InitTest {

    public static void main(String[] args) {
        // 通过子类来引用父类静态变量
        System.out.println(SonClass.index);
    }
}
