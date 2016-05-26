import model.SI;
import types.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hliu on 5/26/2016.
 */
public class testOldModel {
    private static final int testNum=1000000000;
    public static void main(String[] args){
        List<Task> listOfTask=new ArrayList<Task>();
        for(int i=0;i<testNum;++i){
            for(int j=0;j<testNum;++j)
            listOfTask.add(new Task("task"+String.valueOf(i)+String.valueOf(j), i, j ));
        }
        //这里加入计时
        SI si=new SI(listOfTask);
        si.distribute();
        //停止计时采用两种方法，或者采用手动相减，或者寻找新方法。
    }
}
