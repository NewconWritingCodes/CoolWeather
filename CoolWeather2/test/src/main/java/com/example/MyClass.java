package com.example;


class MyThread extends Thread{
    public void run(){
        System.out.println("blah");
    }
}

class MyThread2 implements Runnable{
    public void run(){
        System.out.println("blah");
    }
}
public class MyClass {
    public static void main(String[] args) {
//        new MyThread().start();
//
//        MyThread2 myThread2 = new MyThread2();
//        new Thread(myThread2).start();

        new Thread()
        {
            public void run() {
                System.out.println("blah");
            }
        }.start();

//        new Thread(new Runnable(){
//            public void run(){
//                System.out.println("blah");
//            }
//        }).start();



    }
}
