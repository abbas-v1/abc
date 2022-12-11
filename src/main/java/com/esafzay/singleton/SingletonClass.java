package com.esafzay.singleton;

public class SingletonClass {

    private static SingletonClass instance = null;

    private SingletonClass() {
        // private
    }

    public static SingletonClass getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (SingletonClass.class) {
            if (instance == null) {
                instance = new SingletonClass();
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        SingletonClass instace1 = SingletonClass.getInstance();
        SingletonClass instace2 = SingletonClass.getInstance();

        if (instace1 != instace2) {
            System.out.println("Singleton failed");
        } else {
            System.out.println("Singleton is a success");
        }
    }






}
