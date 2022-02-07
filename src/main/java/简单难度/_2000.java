package 简单难度;

public class _2000 {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch) + 1;
        StringBuilder stringBuilder = new StringBuilder(word.substring(0,i));
        String t1 = stringBuilder.reverse().toString();
        String t2 = word.substring(i, word.length());
        return t1+t2;
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        _2000 sol = new _2000();
        System.out.println(sol.reversePrefix(word,ch));
    }
}
