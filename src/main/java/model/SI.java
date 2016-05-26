package model;

import types.Task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hliu on 5/26/2016.
 */
public class SI {
    private final int nodeNum=20;
    List<Task> list=new ArrayList<Task>();
    public SI(List<Task> l){
        list=l;
    }
    public void distribute(){
        //这里加入线程池。然后扔进线程池。
    }
}
