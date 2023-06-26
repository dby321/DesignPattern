package com.binyu.designModel.$14template.$01;

public abstract class SoyMilk {
    public final void make(){
        select();
        addIngredients();
        soak();
        beat();
        printInfo();
    }
    private void select(){
        System.out.println("第一步，选黄豆");
    }
    public abstract void addIngredients();

    private void soak(){
        System.out.println("第三步，浸泡黄豆");
    }
    private void beat(){
        System.out.println("第四步，黄豆放进豆浆机去打碎");
    }

    /**
     * 钩子方法
     */
    public void printInfo(){

    }
}
