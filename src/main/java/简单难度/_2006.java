package 简单难度;

import java.util.HashMap;
import java.util.Map;

public class _2006 {
    public static int countKDifference(int[] nums, int k) {
        int res = 0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for(int num: nums) {
            res += cnt.getOrDefault(num - k, 0);
            res += cnt.getOrDefault(num + k, 0);
            cnt.put(num,cnt.getOrDefault(num, 0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(_2006.countKDifference(new int[]{1,2,2,1}, 1));
        System.out.println(_2006.countKDifference(new int[]{1,3}, 3));
        System.out.println(_2006.countKDifference(new int[]{3,2,1,5,4}, 2));
    }
}
