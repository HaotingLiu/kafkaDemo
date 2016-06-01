package types;

/**
 * Created by aznable on 2016/5/27.
 */
public class TaskFactory {
    private static void TaskFactor(){};
    public static Task generate(String s , int id1, int id2){
        return new Task(s, id1, id2);
    }
}
