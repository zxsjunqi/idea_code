package com.example.springboot.manager;

public class springbootManager {
    private int count = 0;

              private static springbootManager instance = new springbootManager();

             private springbootManager(){}

              public static springbootManager getInstance(){
                 return instance;
             }

             public synchronized void addCount(int i){
                 count = count + i;
             }

             public synchronized  void minusCount(int i){
                count = count -i;
             }

            public int getCount(){
                 return count;
             }

             public void initCount(int i){
                 count = i;
             }
}
