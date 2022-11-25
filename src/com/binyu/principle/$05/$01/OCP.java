package com.binyu.principle.$05.$01;


public class OCP {
    /**
     * 没有做到对拓展开放（对提供方），对修改关闭（对使用方）
     * @param args
     */
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
    }
}
class GraphicEditor{
    public void drawShape(Shape s){
        if(s.m_type==1){
            drawRectangle(s);
        }else if(s.m_type==2){
            drawCircle(s);
        }
    }
    public void drawRectangle(Shape shape){
        System.out.println("绘制矩形");
    }
    public void drawCircle(Shape shape){
        System.out.println("绘制圆形");
    }
    public void drawTriangle(Shape shape){
        System.out.println("绘制三角形");
    }
}
class Shape{
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type=1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}
class Triangle extends Shape{
    Triangle(){
        super.m_type=3;
    }
}
