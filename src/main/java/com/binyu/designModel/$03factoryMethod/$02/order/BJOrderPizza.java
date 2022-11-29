package com.binyu.designModel.$03factoryMethod.$02.order;



import com.binyu.designModel.$03factoryMethod.$02.pizza.Pizza;
import sun.util.locale.provider.SPILocaleProviderAdapter;

public class BJOrderPizza  extends OrderPizza{

    @Override
    public Pizza createPizza(String className) {
        Pizza pizza=null;
        try {
            pizza = (Pizza) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return pizza;
    }
}
