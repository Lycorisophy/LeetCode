package 集合.字符;

public class CharTest {
    /**
     * char类型变量可以强制转化为int类型变量，反之亦然
     */
    private static void test01() {
        char a = 'a';
        int b = 98;
        System.out.println((int)a);//97
        System.out.println((char)b);//b
        char c = 'b';
        System.out.println("98 == b --> "+ (b == c));//true
    }

    private static void test02() {
        char a = 'a';
        int[] arr = new int[100];
        for(int i = 0;i<100;i++) {
            arr[i] = i;
        }
        System.out.println(arr[1]);//1
        System.out.println(arr[99]);//99
        System.out.println((int)a);//97
        System.out.println("char自动转为int:"+arr[a]);//97
    }

    private static void test03() {
        //数字
        System.out.println("Character.isDigit('1') -->"+Character.isDigit('1'));//true
        System.out.println("Character.isDigit('a') -->"+Character.isDigit('a'));//false
        //空格
        System.out.println("Character.isSpaceChar('1') -->"+Character.isSpaceChar('1'));//false
        Character.isSpaceChar('a');
        System.out.println("Character.isSpaceChar('a') -->"+Character.isSpaceChar('a'));//false
        Character.isSpaceChar(' ');
        System.out.println("Character.isSpaceChar(' ') -->"+Character.isSpaceChar(' '));//true
        //字母
        System.out.println("Character.isLetter('1') -->"+Character.isLetter('1'));//false
        System.out.println("Character.isLetter('a') -->"+Character.isLetter('a'));//true
        System.out.println("Character.isLetter('张') -->"+Character.isLetter('张'));//true, 汉字算字母？
        //数字或字母
        System.out.println("Character.isLetterOrDigit('1') -->"+Character.isLetterOrDigit('1'));//true
        System.out.println("Character.isLetterOrDigit('a') -->"+Character.isLetterOrDigit('a'));//true
        System.out.println("Character.isLetterOrDigit('张') -->"+Character.isLetterOrDigit('张'));//true, 汉字算字母？
        System.out.println("Character.isLetterOrDigit(' ') -->"+Character.isLetterOrDigit(' '));//false
    }
    /**
     * codePointAt:获取字符串中某个位置上的字符
     */
    private static void test06() {
        //获取字符串中某个位置上的字符
        int codePointAt = Character.codePointAt("abcdef", 1);
        System.out.println("Character.codePointAt(\"abcdef\", 1) -->" + codePointAt);//98
        codePointAt = Character.codePointAt("123456789", 1);
        System.out.println("Character.codePointAt(\"123456789\", 1) -->" + codePointAt);//50
        CharSequence seq = "/ 123456789";//这个是图形？
        codePointAt = Character.codePointAt(seq, 0);
        System.out.println(codePointAt);//预计是47？ --> 47
        codePointAt = Character.codePointAt(seq, 1);
        System.out.println(codePointAt);//预计是32？ --> 还真是32

        //CharSequence是一个接口，String、StringBuffer、StringBuilder类都是CharSequence的子接口；
        CharSequence seq1 = "*123456";//这个是图形？
        codePointAt = Character.codePointAt(seq1, 0);
        System.out.println(codePointAt);//预计是42？ --> 42

        String seq2 = "*123456";//这个是图形？
        codePointAt = Character.codePointAt(seq2, 0);
        System.out.println(codePointAt);//预计是42？ --> 42
        System.out.println("*******");
        char[] cArr = { 'a', 'b', 'c' };
        System.out.println(Character.codePointAt(cArr, 1)); //98
        // 获取指定位置字符的代码点。第二个参数的值一定要小于第三个参数，否则异常
        System.out.println(Character.codePointAt(cArr, 0, 1)); //97 why?第三个参数有何用？？？
        System.out.println(Character.codePointAt(cArr, 0, 2)); //97 why?
        System.out.println(Character.codePointAt(cArr, 0, 3)); //97 why?
        System.out.println(Character.codePointAt(cArr, 1, 2)); //98 why?
        System.out.println(Character.codePointAt(cArr, 1, 3)); //98 why?
    }



    private static void test04() {
        // Character类将一个char基本数据类型封装在类中。这个类中只有一char类型的变量。Character是基于unicode码进行的
        // Character所有的方法，都是围绕着这个char基本数据类型的值进行操作的。
        Character z = '张';//24352
        // 获取Character类中封装的char基本数据类型变量的hash码值。也可理解为获得Character对象的hash码值,从源码看就是返回强制转换为int类型后的值。
        System.out.println(z.hashCode());
        // 将一个char基本数据类型的数据封装成一个Character类型的对象
        System.out.println(Character.valueOf('a')); //a
        System.out.println("z.charValue() -->"+z.charValue());//张
        // 判断参数中的字符是否为为候补码，也就是说字符转化为数字后是否大于等于65535，如果参数直接为数字，那就看数字是否大于等于65535，是的话返回2，否则返回1
        // 字符在计算机中都是用数字表示的，一个char类型占16位二进制，转成十进制后可以表示65536种字符，也就是说每个字符都可以用一个数字表示，当这数字大于65535说明
        // 这个字符为扩充候补字符。
        System.out.println("Character.charCount('在');  -->"+Character.charCount('在'));//1
        System.out.println("Character.charCount('0');  -->"+Character.charCount('0'));//1
        System.out.println("Character.charCount('a');  -->"+Character.charCount('a'));//1
        System.out.println("Character.charCount(' ');  -->"+Character.charCount(' '));//1
        System.out.println("Character.charCount(65535);  -->"+Character.charCount(65535));//1
        System.out.println("Character.charCount(65536);  -->"+Character.charCount(65536));//2
        System.out.println("Character.charCount(100000);  -->"+Character.charCount(100000));//2
        //比较类型和值是否都相同
        System.out.println(z.equals(123));//false
        System.out.println(Character.valueOf(z));//张
        System.out.println(z.equals('张'));//true
        // 判断字符有没有对应的unicode形式，就是通过unicode中是否定义了字符的unicode写法
        System.out.println("isDefined: " + Character.isDefined('!')); //true
        System.out.println(Character.isDefined(123));  //true
        // 是否为合法java变量名要求的能用于开头的字符（数字，字母下划线和$)
        System.out.println("isJavaIdentifierStart: " + Character.isJavaIdentifierStart('@')); //false
        System.out.println("isJavaIdentifierStart: " + Character.isJavaIdentifierStart(123)); //false

        // 判断是否为一个合法的java变量所包含的字符
        System.out.println("isJavaIdentifierPart: " + Character.isJavaIdentifierPart('$')); //true

        // 小写字母或者用小写字母的codepoint转大写
        System.out.println("toLowerCase:" + Character.toLowerCase('A')); //a
        System.out.println("toLowerCase:" + Character.toLowerCase(65)); //97

        // 大写字母或者用大写字母的codepoint转小写
        System.out.println("toLowerCase:" + Character.toUpperCase('a')); //A
        System.out.println("toLowerCase:" + Character.toUpperCase(97)); //65
    }



    public static void main(String[] args) {
        test04();
    }
}
