package com.example.dependencyinjectionpracticeapplication.inter;
public interface Inter {
    void display();//one abstract method
    }
    class InterfaceImpl implements Inter {
        public void display(){
            System.out.println("Display Method");
    }
}
