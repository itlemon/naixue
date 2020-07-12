package cn.itlemon.naixue.reflection.classloader;

import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义ClassLoader
 *
 * @author jiangpingping
 * @date 2020/7/12 15:12
 */
public class CustomClassLoader extends ClassLoader {

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
            // 从classpath下加载指定的类
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
}
