package 简单难度;

import java.util.Arrays;

public class _453最小操作次数使数组元素相等 {
    public static int minMoves(int[] nums) {
        return Arrays.stream(nums).sum()-Arrays.stream(nums).min().getAsInt()*nums.length;
    }
    public static void main(String[] args){
        int[] data = {1, 2, 3};
        System.out.println(minMoves(data));
        data = new int[]{1, 1, 1};
        System.out.println(minMoves(data));
        data = new int[]{1, 3, 4};
        System.out.println(minMoves(data));
    }
}
