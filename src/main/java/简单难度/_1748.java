package 简单难度;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class _1748 {
    private static int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> state = new HashMap<>();
        for(Integer num:nums) {
            if(!state.containsKey(num)){
                ans += num;
                state.put(num, 1);
            }
            else if(state.get(num).intValue() == 1) {
                ans -= num;
                state.replace(num, 2);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(_1748.sumOfUnique(new int[]{1, 2, 3, 2}));
        System.out.println(_1748.sumOfUnique(new int[]{1,1,1,1,1}));
        System.out.println(_1748.sumOfUnique(new int[]{1,2,3,4,5}));
    }
}
