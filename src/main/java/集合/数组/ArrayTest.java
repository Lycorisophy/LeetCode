package 集合.数组;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
//        getStringArrayFromObjectArray2();
        getIntegerArrayFromObjectArray();
        getStringArrayFromObjectArray1();
        getStringArrayFromObjectArray2();
    }

    private static void copySelf() {
        int[] ids = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(ids));
        //System.arraycopy(src, srcPos, dest, destPos, length);
        // 把从索引0开始的2个数字复制到索引为3的位置上
        System.arraycopy(ids, 0, ids, 3, 2);
        System.out.println(Arrays.toString(ids));//[1, 2, 3, 1, 2]
    }

    private static void copyToOther() {
        int[] ids = { 1, 2, 3, 4, 5 };
        //将数据的索引1开始的3个数据复制到目标的索引为0的位置上
        int[] other = new int[5];
        System.arraycopy(ids, 1, other, 0, 3);
        System.out.println(Arrays.toString(ids));//[1, 2, 3, 4, 5]深复制
        System.out.println(Arrays.toString(other));//[2, 3, 4, 0, 0]
    }

    //如果是类型转换问题，获取整形
    private static void getIntegerArrayFromObjectArray() {
        Object[] obj1 = { 1, 2, 3, "4", "5" };
        Integer[] obj2 = new Integer[5];

        try {
            System.arraycopy(obj1, 0, obj2, 0, obj1.length);
        } catch (Exception e) {
            System.out.println("transfer exception:"+e);
        }
        System.out.println(Arrays.toString(obj1));
        System.out.println(Arrays.toString(obj2));
    }

    //获取Object数组中的字符串类型数据
    private static void getStringArrayFromObjectArray1() {
        Object[] obj3 = { 1, 2, 3, "4", "5" };
        String[] obj4 = new String[5];
        try {
            System.arraycopy(obj3, 2, obj4, 2, 3);
        } catch (Exception e) {
            //transfer exception:java.lang.ArrayStoreException
            System.out.println("transfer exception:"+e);
        }
        System.out.println(Arrays.toString(obj3));
        //[null, null, null, null, null]
        System.out.println(Arrays.toString(obj4));
    }

    //获取Object数组中的字符串类型数据
    private static void getStringArrayFromObjectArray2() {
        Object[] obj3 = { 1, 2, 3, "4", "5" };
        String[] obj4 = new String[5];
        try {
            System.arraycopy(obj3, 3, obj4, 3, 2);
        } catch (Exception e) {
            System.out.println("transfer exception:"+e);
        }
        System.out.println(Arrays.toString(obj3));
        //[null, null, null, 4, 5]
        System.out.println(Arrays.toString(obj4));
        obj3[3] = "zhangssan";
        System.out.println("查看是浅复制还是深复制~~~~~");
        System.out.println(Arrays.toString(obj3));
        System.out.println(Arrays.toString(obj4));
    }
}



