package model;

import types.Task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.RunnableFuture;

/**
 * Created by hliu on 5/24/2016.
 * finished
 */
public class Calculate implements Runnable, QueueClass {
    private static Queue<Task> queue = new LinkedList<Task>();

    public Calculate() {
    }

    @Override
    public void run() {
        while (true) {
            if (!queue.isEmpty()) {
                Task task = queue.poll();
                for (int i = 0; i < 100; ++i) {
                    int tmp = task.getData1() * task.getData2();
                }
                for (int i = 0; i < 100; ++i) {
                    int tmp = task.getData1() * task.getData2();
                }
                for (int i = 0; i < 100; ++i) {
                    int tmp = task.getData1() * task.getData2();
                }
                for (int i = 0; i < 100; ++i) {
                    int tmp = task.getData1() * task.getData2();
                }//learn how to rewrite this part with enum
                System.out.print("the size of cal queue"+ queue.size()+"\n");
            }
        }
    }

    @Override
    public void enQueue(Task t) {
        queue.add(t);
    }
}
