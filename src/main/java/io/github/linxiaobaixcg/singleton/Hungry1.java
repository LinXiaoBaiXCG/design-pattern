package io.github.linxiaobaixcg.singleton;

/**
 * @author lcq
 * @description: 饿汉式单例模式(改造)
 * @date 2021/4/20 16:04
 */
public class Hungry1 {

    private static Hungry1 hungry = null;

    static {
        hungry = new Hungry1();
    }

    private Hungry1() {
    }

    public static Hungry1 getInstance() {
        return hungry;
    }
}