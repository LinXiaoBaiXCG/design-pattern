package io.github.linxiaobaixcg.singleton;

/**
 * @author lcq
 * @description: 懒汉式单例模式(改造)
 * 线程安全，但效率低
 * @date 2021/4/20 16:12
 */
public class Lazy1 {

    private static Lazy1 lazy = null;

    private Lazy1() {
    }

    public static synchronized Lazy1 getInstance() {
        if (lazy == null) {
            return lazy = new Lazy1();
        }
        return lazy;
    }
}
