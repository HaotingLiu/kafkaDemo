package model;

import types.Task;
import types.TaskFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hliu on 5/24/2016.
 */
public class directAccess implements Runnable, QueueClass{
    private static Queue<Task> queue=new LinkedList<Task>();
    public void getUrl(Task task) throws IOException {
        URL oracle = new URL("http://www.google.com");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.print("abort for Exception for reader");
        }
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
    @Override
    public void run(){
        while(true){
            if(!queue.isEmpty()){
                try {
                    getUrl(queue.poll());
                    System.out.print("the size for da queue"+queue.size()+"\n");
                } catch (IOException e) {
                    System.out.print("direct access fail");
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void enQueue(Task t) {
        queue.add(t);
    }
}
