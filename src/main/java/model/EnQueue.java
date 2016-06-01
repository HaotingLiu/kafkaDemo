package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aznable on 2016/5/27.
 */
public class EnQueue implements Runnable {
    private List<QueueClass> queueList=new ArrayList<QueueClass>();
    public void EnQueue(QueueClass q1, QueueClass q2, QueueClass q3){
        queueList.add(q1);
        queueList.add(q2);
        queueList.add(q3);
    }
    @Override
    public void run(Task t) {
        for(int i=0;i<1000000;++i){
            queueList.get(i%3).enQueue();
        }
    }

}
