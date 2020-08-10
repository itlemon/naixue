package cn.itlemon.naixue.utils;

/**
 * @author jiangpingping
 * @date 2020/7/19 23:15
 */
public class ReferenceTest {

    public static void main(String[] args) {
//        Object o = new Object();
//        test(o);
        System.out.println("12234".hashCode());
        System.out.println("22234".hashCode());
//        String test = "qqwee";
//        int i = test.hashCode();
//        System.out.println(i);
        String a = new String("qqwee");
        int i1 = a.hashCode();
        System.out.println(i1);
    }

    public static void test(Object o) {

    }


}
