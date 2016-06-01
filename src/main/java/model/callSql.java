package model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.mock.staticmock.MockStaticEntityMethods;
import types.Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.*;

/**
 * Created by hliu on 5/24/2016.
 */
/*@SpringBootApplication
public class callSql implements Runnable, QueueClass{
*//*    private Queue<Task> queue=  new LinkedList<Task>();
    public static void findTask(int id){
        SpringApplication.run(callSql.class);
        for(int i=0;i<10000;++i){
            find((long)id+i);
        }
    }//这里需要加入sql数据库
    Random ran=new Random();
    @Override
    public void run() {
        findTask(ran.nextInt());
    }

    @Override
    public void enQueue(Task t) {

        queue.add(t);
    }*//*
}
@Entity
class inventoryAir{
    private @Id @GeneratedValue Long id;
    private String airlineName, departure, arrival, availabiliy;
    private inventoryAir(){};

    public inventoryAir(String a, String b, String c, String d){
        this.airlineName=a;
        this.departure=b;
        this.arrival=c;
        this.availabiliy=d;
    }
}*/



