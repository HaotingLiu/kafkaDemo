package model;

import types.Task;

/**
 * Created by hliu on 5/24/2016.
 */
public class Calculate {
    private final int data1;
    private final int data2;
    public Calculate(Task task){
        data1=task.getData1();
        data2=task.getData2();
    }
    public void doTheCalculation(){
        for(int i=0;i<100;++i){
            int tmp=data1*data2;
        }
        for(int i=0;i<100;++i){
            int tmp=data1*data2;
        }
        for(int i=0;i<100;++i){
            int tmp=data1*data2;
        }
        for(int i=0;i<100;++i){
            int tmp=data1*data2;
        }//learn how to rewrite this part with enum
    }
}
