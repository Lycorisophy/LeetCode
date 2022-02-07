package 简单难度;

import java.util.HashSet;

public class _14最长公共前缀 {
        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            StringBuilder res = new StringBuilder();
            int min = strs[0].length();
            for (String str: strs) {
                if (str.length() < min) min = str.length();
            }
            for (int i =0;i<min;i++){
                HashSet<Character> hashSet = new HashSet<>();
                Character character = null;
                for (String str: strs) {
                    character = str.charAt(i);
                    hashSet.add(character);
                }
                if (hashSet.size() == 1) res.append(character);
                else {
                    return res.toString();
                }
            }

            return res.toString();
        }

    public static void main(String[] args){
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
