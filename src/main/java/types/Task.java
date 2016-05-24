package types;

/**
 * Created by hliu on 5/24/2016.
 */
public class Task {
    private String type;
    private final int data1;
    private final int data2;

    public Task(String t, int d1, int d2) {
        type = t;
        data1 = d1;
        data2 = d2;
    }
    public int getData1(){
        return data1;
    }
    public int getData2(){
        return data2;
    }
}
