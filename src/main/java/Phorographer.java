package main.java;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Phorographer {
    @Pointcut("execution(* main.java.Camera.takeAPicture(..))")

    public void takeAPicture(){
        System.out.println("Snap!");
    }
    @Before("takeAPicture()")
    public void prepareToSnap(){
        System.out.println("Getting ready to take a picture...");
    }
    @Before("takeAPicture()")
    public void setLights(){System.out.println("Setting lights...");}
    @AfterReturning("takeAPicture()")
    public void printPhoto(){ System.out.println("Print!...Print!");}
    @Before("takeAPicture()")
    public void smile(){System.out.println("Smiiiiiiileeeee:))");}

}
