package io.github.linxiaobaixcg.singleton;

/**
 * @author lcq
 * @description: 内部类单例模式
 * @date 2021/4/20 16:59
 */
public class Inner {

    private Inner() {
    }

    private static class InnerHolder{
        private static Inner inner = new Inner();
    }

    public static Inner getInstance(){
        return InnerHolder.inner;
    }
}
