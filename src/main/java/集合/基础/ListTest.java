package 集合.基础;


import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author lysoy
 */

public class ListTest {


    public static void linkedListTest(int cnt){
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < cnt; i++) {
            linkedList.add(1);
        }
    }


    public static void arrayListTest(int cnt){
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cnt; i++) {
            arrayList.add(1);
        }
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        ListTest.arrayListTest(1000);
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");
    }
}
