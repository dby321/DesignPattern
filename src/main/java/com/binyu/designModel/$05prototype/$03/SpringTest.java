package com.binyu.designModel.$05prototype.$03;

import com.binyu.designModel.$05prototype.$02.Sheep;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    private static Log log= LogFactory.getLog("mytest1");
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        log.info("hahaha");
        Sheep sheep1 = (Sheep) applicationContext.getBean("id01");
        System.out.println(sheep1);
        Sheep sheep2 = (Sheep) applicationContext.getBean("id01");
        System.out.println(sheep2);
        System.out.println(sheep1==sheep2);

    }
}
