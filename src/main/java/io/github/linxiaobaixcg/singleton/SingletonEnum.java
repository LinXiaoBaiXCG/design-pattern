package io.github.linxiaobaixcg.singleton;

/**
 * 极推荐使用
 */
public enum SingletonEnum {

    instance;

    private String singleton = null;

    private SingletonEnum(){
        singleton = new String();
    }

    public String getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        String a = SingletonEnum.instance.getInstance();
        String b = SingletonEnum.instance.getInstance();
        System.out.println(a==b);
    }
}
