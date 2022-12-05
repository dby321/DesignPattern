package com.binyu.designModel.$12flyweight.$01;

public class ConcreteWebSite extends WebSite{
    private String type="";
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为"+type+",使用者："+user);
    }

    public ConcreteWebSite(String type) {
        this.type = type;
    }
}
