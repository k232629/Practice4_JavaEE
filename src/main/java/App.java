package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  App {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Camera myCamera = (Camera)context.getBean("camera");
        myCamera.takeAPicture();
        Contestant contestant = (Contestant) context.getBean("camera");
        contestant.receiveMoney();


        ((ClassPathXmlApplicationContext)context).close();


    }
}