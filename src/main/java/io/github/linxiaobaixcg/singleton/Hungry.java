package io.github.linxiaobaixcg.singleton;

/**
 * @author lcq
 * @description: 饿汉式单例模式
 * @date 2021/4/20 16:04
 */
public class Hungry {

    private static Hungry hungry = new Hungry();

    private Hungry() {
    }

    public static Hungry getInstance() {
        return hungry;
    }
}