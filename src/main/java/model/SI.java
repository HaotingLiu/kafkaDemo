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
    List<Task> list=new ArrayList<Task>();
    QueueClass calObject=new Calculate();
    QueueClass sqlObject=new callSql();
    QueueClass dirObject=new directAccess();
    public SI(List<Task> l){
        list=l;
    }
    public void enQueue(){
        for(int i)
    }//更改方向：应该同时生成任务并分配任务
    //更改方法：定时生成任务，使用静态工厂函数生成。并且同时分配任务
    public void distribute(){
        //这里加入线程池。然后扔进线程池。

        ExecutorService pool = Executors.newFixedThreadPool(6);

    }
}
