package com.binyu.designModel.$05prototype.$04;

import java.io.*;

public class Sheep implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer age;
    private String color;

    private String address="蒙古羊";

    private Sheep2 friendSheep;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sheep2 getFriendSheep() {
        return friendSheep;
    }

    public void setFriendSheep(Sheep2 friendSheep) {
        this.friendSheep = friendSheep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 深拷贝，使用clone()
     * @return
     */
    @Override
    protected Object clone()  {
//        Sheep sheep=null;
//        try {
//            sheep= (Sheep) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//        return sheep;
        Sheep clone=null;
        try {
            clone = (Sheep)super.clone();
            clone.setFriendSheep(clone.getFriendSheep().clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }

    /**
     * 通过对象的序列化实现
     * @return
     */
    public Object deepClone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        try {
            // 序列化
           bos=new ByteArrayOutputStream();
           oos=new ObjectOutputStream(bos);
           oos.writeObject(this);

           // 反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            Sheep sheep= (Sheep) ois.readObject();
            return sheep;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public Sheep() {
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", friendSheep=" + friendSheep +
                '}';
    }
}
