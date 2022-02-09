package 普通难度;

import java.util.Arrays;

public class _1405 {
    static class Pair{
        int freq;
        char ch;
        public Pair(int freq, char ch) {
            this.freq = freq;
            this.ch = ch;
        }
    }
    public static String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();
        Pair[] arr = {new Pair(a, 'a'), new Pair(b, 'b'), new Pair(c, 'c')};

        while (true) {
            Arrays.sort(arr, (p1, p2) -> p2.freq - p1.freq);
            boolean hasNext = false;
            for (Pair pair : arr) {
                if (pair.freq <= 0) {
                    break;
                }
                int m = res.length();
                if (m >= 2 && res.charAt(m - 2) == pair.ch && res.charAt(m - 1) == pair.ch) {
                    continue;
                }
                hasNext = true;
                res.append(pair.ch);
                pair.freq--;
                break;
            }
            if (!hasNext) {
                break;
            }
        }

        return res.toString();
        }

    public static void main(String[] args){
        System.out.println(_1405.longestDiverseString(1, 1, 7));
        System.out.println(_1405.longestDiverseString(2,2,1));
        System.out.println(_1405.longestDiverseString(7,1,0));
    }
}
