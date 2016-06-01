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
        //这里加入计时
        SI si=new SI();
        si.distribute();
        //停止计时采用两种方法，或者采用手动相减，或者寻找新方法。
    }
}
