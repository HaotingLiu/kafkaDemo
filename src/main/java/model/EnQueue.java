package model;

import types.Task;
import types.TaskFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by aznable on 2016/5/27.
 */
public class EnQueue implements Runnable {
    private List<QueueClass> queueList=new ArrayList<QueueClass>();
    Random r =new Random();

    public EnQueue(QueueClass q1, QueueClass q2, QueueClass q3){
        queueList.add(q1);
        queueList.add(q2);
        queueList.add(q3);
    }
    @Override
    public void run() {
        for(int i=0;i<1000000;++i){
            if(r.nextInt(10)>8) queueList.get(1).enQueue(TaskFactory.generate(String.valueOf(i), r.nextInt(), r.nextInt()));
            else queueList.get(0).enQueue(TaskFactory.generate(String.valueOf(i), r.nextInt(), r.nextInt()));
        }
    }

}
