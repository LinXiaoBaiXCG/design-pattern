package io.github.linxiaobaixcg.singleton;

/**
 * @author lcq
 * @description: 懒汉式单例模式
 * 线程不安全
 * @date 2021/4/20 16:12
 */
public class Lazy {

    private static Lazy lazy = null;

    private Lazy() {
    }

    public static Lazy getInstance() {
        if (lazy == null) {
            return lazy = new Lazy();
        }
        return lazy;
    }
}
