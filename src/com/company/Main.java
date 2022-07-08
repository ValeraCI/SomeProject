package com.company;

public class Main {

    volatile static int a = 5;
    volatile static int b = 5;

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(new ThreadAdd());
        Thread thread2 = new Thread(new ThreadDic());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(a);
        System.out.println(b);
    }
}
class ThreadAdd implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 20000; i++){
            Main.a+=1;
            Main.b+=1;
        }
    }
}

class ThreadDic implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 20000; i++){
            Main.a-=1;
            Main.b-=1;
        }
    }
}