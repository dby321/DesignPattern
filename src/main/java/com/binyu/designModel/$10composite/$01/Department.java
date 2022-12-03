package com.binyu.designModel.$10composite.$01;

import java.util.ArrayList;
import java.util.List;

/**
 * 由于它是叶子结点，所以不需要add和remove
 */
public class Department extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public Department(String name, String desc) {
        super(name, desc);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    protected void print() {
        System.out.println("-----name:"+getName()+"-----");
        System.out.println("-----desc:"+getDesc()+"-----");
        for(OrganizationComponent component:organizationComponents){
            System.out.print("component:"+component+" ");
        }
    }
}
