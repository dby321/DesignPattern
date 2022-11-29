package com.binyu.principle.$03.$03;

public class DependencyInversion {
    /**
     * 接口的依赖关系传递
     * @param args
     */
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);
    }
}
interface IOpenAndClose{
    public void open(ITv tv);
}
interface ITv{
    public void play();
}
class ChangHong implements ITv {

    @Override
    public void play() {
        System.out.println("长虹TV播放...");
    }
}
class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITv tv) {
        tv.play();
    }
}


