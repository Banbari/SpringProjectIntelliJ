package org.vans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Triangle implements Shape{//implements ApplicationContextAware, BeanNameAware, InitializingBean,DisposableBean{
   private Point pointA;
   private Point pointB;
   private Point pointC;
   private ApplicationContext applicationContext;
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw()
    {
        System.out.println("Drawing Triangle");
        System.out.println("PointA : "+getPointA()+"PointB : "+getPointB()+"PointC : "+getPointC());
    }

    /*public void myInit()
    {
        System.out.println("MyInit Method called");
    }
    public void myDestroy()
    {
        System.out.println("My Destroy Method called");
    }*/
   /* @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is "+ s);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean has been initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean has been destroyed");
    }*/

    /*private String type;
    private int height;

    public Triangle() {
    }

    public Triangle(String type)
    {
        this.type=type;
    }
    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(int height) {
        this.height = height;
    }
    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void draw()
    {
        System.out.println("\n"+getType()+" Triangle Drawn"+"\nit's Height is : "+getHeight());
    }*/
}
