package io.github.linxiaobaixcg.singleton;

/**
 * @author lcq
 * @description: 双重检验
 * 线程安全；延迟加载；效率较高。
 * @date 2021/4/20 16:57
 */
public class DoubleCheck {

    private static DoubleCheck doubleCheck = null;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (DoubleCheck.class) {
                if (doubleCheck == null) {
                    return doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
