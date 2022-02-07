package 简单难度;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class _884 {
    public static String[] uncommonFromSentences(String s1, String s2) {
        java.lang.String s3 = s1 + " " + s2;
        Map<String, Integer> freq = new HashMap<String, Integer>();
        String[] arr = s3.split(" ");
        for (String word : arr) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        List<String> ans = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }


    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(uncommonFromSentences(s1, s2));
        s1 = "apple apple";
        s2 = "banana";
        System.out.println(uncommonFromSentences(s1, s2));
    }
}