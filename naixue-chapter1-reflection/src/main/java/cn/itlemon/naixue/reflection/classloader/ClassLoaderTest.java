package cn.itlemon.naixue.reflection.classloader;

/**
 * 类加载器测试类
 *
 * @author jiangpingping
 * @date 2020/7/9 22:21
 */
public class ClassLoaderTest {

    private static int index = 10;

    public static void main(String[] args) throws ClassNotFoundException {
        // 首先打印出main方法中ClassLoaderTest的类加载器
        System.out.println("ClassLoaderTest默认加载器是：" + ClassLoaderTest.class.getClassLoader());
        CustomClassLoader loader = new CustomClassLoader();
        // 使用我们自定义的类加载器再次加载一遍
        Class<?> aClass = loader.loadClass(ClassLoaderTest.class.getName());
        System.out.println("ClassLoaderTest加载器是：" + aClass.getClassLoader());
        System.out.println("不同类加载器加载的ClassLoaderTest的Class是否相等：" + aClass.equals(ClassLoaderTest.class));
    }

}
