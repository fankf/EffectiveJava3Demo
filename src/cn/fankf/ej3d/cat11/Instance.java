package cn.fankf.ej3d.cat11;

//饿汉式单例
public class Instance {

    private static Instance instant = new Instance();

    private Instance(){}

    public static Instance instance(){
        return instant;
    }
}
