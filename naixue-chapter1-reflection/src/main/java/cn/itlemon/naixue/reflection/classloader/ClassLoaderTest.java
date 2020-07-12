package cn.itlemon.naixue.reflection.classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * 类加载器测试类
 *
 * @author jiangpingping
 * @date 2020/7/9 22:21
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader loader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] bytes = new byte[is.available()];
                    is.read(bytes);
                    return defineClass(name, bytes, 0, bytes.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException();
                }
            }
        };
        Object instance = loader.loadClass(ClassLoaderTest.class.getName()).newInstance();
        System.out.println(instance.getClass());
        System.out.println(instance instanceof ClassLoaderTest);
    }

}
