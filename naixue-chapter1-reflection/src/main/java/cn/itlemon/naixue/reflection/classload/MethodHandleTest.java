package cn.itlemon.naixue.reflection.classload;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @author jiangpingping
 * @date 2020/7/16 22:20
 */
public class MethodHandleTest {

    public static void main(String[] args) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        try {
            MethodHandle method = lookup.findStatic(MethodHandleMainClass.class, "method",
                    MethodType.methodType(void.class, String.class));
            method.invoke("Test init！");
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
