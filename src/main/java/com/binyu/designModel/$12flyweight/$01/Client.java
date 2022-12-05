package com.binyu.designModel.$12flyweight.$01;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite news = webSiteFactory.getWebSiteCategory("news");
        news.use(new User("张三","10"));
        WebSite blogs = webSiteFactory.getWebSiteCategory("blogs");
        blogs.use(new User("李四","12"));
        WebSite news1 = webSiteFactory.getWebSiteCategory("news");
        news1.use(new User("王二","15"));
        System.out.println("网站的分类总共有"+webSiteFactory.getWebSiteCount());
    }
}
