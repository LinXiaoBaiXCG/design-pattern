package io.github.linxiaobaixcg.singleton;

/**
 * @author lcq
 * @description: 懒汉式单例模式(改造)
 * 线程不安全，但效率比1好
 * @date 2021/4/20 16:12
 */
public class Lazy2 {

    private static Lazy2 lazy = null;

    private Lazy2() {
    }

    public static Lazy2 getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                return lazy = new Lazy2();
            }
        }
        return lazy;
    }
}
