package cn.itlemon.naixue.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangpingping
 * @date 2020/7/19 20:30
 */
public class FinalTest {

    private static final Map<String, Object> map = new HashMap<>();

    public static void main(String[] args) {
        String a = "a";
        Field[] fs = a.getClass().getDeclaredFields();
        System.out.println(a + " " + a.hashCode());
        for (Field f : fs) {
            if (f.getName().equals("value")) {
                System.out.println(f.getName());
                f.setAccessible(true);
                try {
                    char[] o = (char[]) f.get(a);
                    o[0] = 'b';
//                    char[] c = {'a', 'b'};
                    f.set(a, o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(a + " " + a.hashCode());
        System.out.println();
    }
}
