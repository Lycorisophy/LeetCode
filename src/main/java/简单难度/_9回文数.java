package 简单难度;

public class _9回文数 {
    public static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int length = s.length();
        for (int i = 0;i<length/2;i++){
            if (s.charAt(i) != s.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
      System.out.println(isPalindrome(123));
      System.out.println(isPalindrome(-121));
      System.out.println(isPalindrome(121));
    }
}
