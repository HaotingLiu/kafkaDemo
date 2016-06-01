package model;

import types.Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hliu on 5/26/2016.
 */
public class SI {
    private final int nodeNum=20;
    QueueClass calObject=new Calculate();
    //QueueClass sqlObject=new callSql();
    QueueClass dirObject=new directAccess();
    public SI(){
    }
    public void distribute(){
        //这里加入线程池。然后扔进线程池。

        ExecutorService pool = Executors.newFixedThreadPool(6);
        for(int i=100;i>=0;--i){
            Runnable taskc=new Calculate();
           // Runnable tasks=new callSql();
            Runnable taskd=new directAccess();
            Runnable q=new EnQueue(calObject, dirObject, calObject);
            pool.execute(q);
            pool.execute(taskc);
            //pool.execute(tasks);
            pool.execute(taskd);
        }


    }
}
