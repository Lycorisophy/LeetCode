package 简单难度;

public class _125验证回文串 {
    public static boolean isPalindrome(String s) {
        int length = s.length();
        int i = 0;
        int j = length - 1;
        while (i<j){
            while (i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i ++;
            }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j --;
            }
            if (i<j){
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    return false;
                }
                i ++;
                j --;
            }
        }
        return true;
    }

    public static void main(String[] args){
      System.out.println(isPalindrome("123"));
      System.out.println(isPalindrome("123"));
      System.out.println(isPalindrome("123"));
    }
}
