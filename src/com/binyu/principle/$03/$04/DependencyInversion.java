package com.binyu.principle.$03.$04;

public class DependencyInversion {
    /**
     * 构造器的依赖关系传递
     * @param args
     */
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open();
    }
}
interface IOpenAndClose{
    public void open();
}
interface ITv{
    public void play();
}
class ChangHong implements ITv{

    @Override
    public void play() {
        System.out.println("长虹TV播放...");
    }
}
class OpenAndClose implements IOpenAndClose{
    private ITv tv;

    public OpenAndClose(ITv tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}


