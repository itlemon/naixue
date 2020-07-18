package cn.itlemon.naixue.reflection.classload;

/**
 * @author jiangpingping
 * @date 2020/7/16 22:18
 */
public class MethodHandleMainClass {

    private static int index;

    static {
        index = 10;
        System.out.println("MethodHandleTest init！");
    }

    public static void method(String message) {
        System.out.println("Print Message:" + message);
    }

}
