package model;

import types.Task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.RunnableFuture;

/**
 * Created by hliu on 5/24/2016.
 */
public class Calculate implements Runnable{
    Random ran=new Random();
    Task task =new Task("empty", ran.nextInt(1000000000),ran.nextInt(1000000000));
    private static Queue<Task> queue=new LinkedList<Task>();

    public Calculate(){
    }
    @Override
    public void run(){
        for(int i=0;i<100;++i){
            int tmp=task.getData1()*task.getData2();
        }
        for(int i=0;i<100;++i){
            int tmp=task.getData1()*task.getData2();
        }
        for(int i=0;i<100;++i){
            int tmp=task.getData1()*task.getData2();
        }
        for(int i=0;i<100;++i){
            int tmp=task.getData1()*task.getData2();
        }//learn how to rewrite this part with enum
    }
}
