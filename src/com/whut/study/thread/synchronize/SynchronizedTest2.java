package com.whut.study.thread.synchronize;

import java.util.Date;

/**
 * @author Administrator
 * @version 1.0.0
 * @date 2021/6/18 19:45
 * @desription
 *
 * 2、同步代码块传参this（锁住的是当前实例对象）
 *  同一个实例调用会阻塞
 *  不同实例调用不会阻塞
 *
 */
public class SynchronizedTest2 {
    //锁住了本类的实例对象
    public void test2() {
        synchronized (this) {
            try {
                System.out.println(Thread.currentThread().getName() + " test2 进入了同步块" + new Date());

                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " test2 休眠结束" + new Date());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTest2 st = new SynchronizedTest2();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " test 准备进入" + new Date());

            st.test2();
        }).start();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " test 准备进入" + new Date());
            st.test2();
        }).start();

    }
}