package com.binyu.designModel.$10composite.$01;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public University(String name, String age) {
        super(name, age);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
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
            System.out.print("college:"+component+" ");
            component.print();
        }
    }
}
