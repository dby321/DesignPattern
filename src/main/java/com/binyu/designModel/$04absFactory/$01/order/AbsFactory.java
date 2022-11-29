package com.binyu.designModel.$04absFactory.$01.order;

import com.binyu.designModel.$04absFactory.$01.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
