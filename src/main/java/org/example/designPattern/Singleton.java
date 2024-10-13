/*
The Singleton pattern ensures a class has only one
instance and provides a global point of access to it.
 */
package org.example.designPattern;

public class Singleton {

    //Not thread Safe, If multiple threads then multiple objects will call
//    private static Singleton uniqueInstance;
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getInstance(){
//        if(uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

    //1. Thread Safe - but it is costly - can decreas perfommance factor by 100
    private static Singleton uniqueInstance;

    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //2. Thread Safe - create an eager instantiation
//    private static Singleton uniqueInstance = new Singleton();
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getInstance(){
//        return uniqueInstance;
//    }

    //3. Thread Safe - Double check locking (works with java 5 and above)
//    private volatile static Singleton uniqueInstance;
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getInstance(){
//        if(uniqueInstance == null){
//            synchronized (Singleton.class){
//                if(uniqueInstance == null){
//                    uniqueInstance = new Singleton();
//                }
//            }
//        }
//        return uniqueInstance;
//    }


}
