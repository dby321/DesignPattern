package com.binyu.designModel.$03factoryMethod.$02.order;





import com.binyu.designModel.$03factoryMethod.$02.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public abstract  Pizza createPizza(String orderType);
}
