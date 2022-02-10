package 集合.遍历;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {
    private static void initList() {
        for(int i = 0; i < 10; i++){
            list.add(String.valueOf(i));
        }
    }

    private static List<String> list = new LinkedList<>();

    public static void test01(List<String> lst){
        lst.removeIf(str -> Integer.valueOf(str)>1);
    }
    public static void test02(List<String> lst) throws Exception {
        Iterator<String> it = lst.iterator();
        while (it.hasNext()) {
            String str = it.next();
            try {
                if (Integer.parseInt(str) > 1) {
                    it.remove();
                }
            } catch (NumberFormatException e) {

            }
        }
    }
    public static List<String> test03(List<String> lst){
        return lst.stream().filter(str -> Integer.valueOf(str)<2).collect(Collectors.toList());
    }
    public static void main(String[] args){
        initList();
        list = test03(list);
        System.out.println(list);

    }
}
