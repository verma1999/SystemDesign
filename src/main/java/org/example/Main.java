package org.example;

import org.example.designPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        int obj1  = Singleton.getInstance().hashCode();
        int obj2  = Singleton.getInstance().hashCode();
        System.out.println("obj1 = " + obj1 + " objj2 = "+obj2);
        System.out.println("Hello world!");
    }
}