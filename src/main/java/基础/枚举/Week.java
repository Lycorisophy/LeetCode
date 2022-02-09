package 基础.枚举;

enum Week{
    SUNDAY(0,"星期日"),
    MONDAY(1,"星期一"),
    TUESDAY(2,"星期二"),
    WEDNESDAY(3,"星期三"),
    THURSDAY(4,"星期四"),
    FRIDAY(5,"星期五"),
    SATURDAY(6,"星期六");

    private int id;
    private String meaning;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    Week(int id, String meaning) {
        this.id = id;
        this.meaning = meaning;
    }

    public static void main(String[] args) {
        //1、ordinal(),枚举顺序值
        System.out.println("枚举顺序值,"+Weekday.MONDAY.ordinal());//1

        /*
         * 2、valueOf()
         * public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name)
         * enumType -- 这是枚举类型，返回一个常量的类的对象。
         * name -- 这是常量，要返回的名称。
         * return:此方法返回具有指定名称的枚举类型的枚举常量。
         * 如果你传了一个不存在的字符串，那么会抛出异常。
         * */
        Week week = Enum.valueOf(Week.class,Week.MONDAY.name().toString());
        Week week1 = Week.valueOf(Week.class,Week.MONDAY.name());
        System.out.println("Enum.valueOf,"+week);//MONDAY
        System.out.println("Week.valueOf,"+week1);//MONDAY

        //3、values()
        System.out.println("Week.values(),"+Weekday.values());//返回一个Weekday数组,[Ljavase.enumeration.Weekday;@2a84aee7

        //4、通过compareTo方法比较,实际上其内部是通过ordinal()值比较的
        System.out.println("Weekday.MONDAY.compareTo(Weekday.TUESDAY),"+Weekday.MONDAY.compareTo(Weekday.TUESDAY));//false

        //5、获取该枚举对象的Class对象引用,当然也可以通过getClass方法
        Class<?> declaringClass = Weekday.MONDAY.getDeclaringClass();
        System.out.println("获取该枚举对象的Class对象引用,"+declaringClass);//javase.enumeration.Weekday

        //6、通过getEnumConstants()获取该枚举类型的所有元素，如果Class对象不是枚举类型，则返回null。
        Object[] enumConstants = declaringClass.getEnumConstants();
        //枚举类个数,Weekday.values().length)
        for (int i = 0; i < Weekday.values().length; i++) {
            System.out.println("getEnumConstants,"+enumConstants[i]);//SUNDAY、MONDAY、TUESDAY、WEDNESDAY、THURSDAY、FRIDAY、SATURDAY
        }

        //7、判断是否是枚举类型
        System.out.println("declaringClass.isEnum(),"+declaringClass.isEnum());//true

        //8、获取枚举变量的属性
        System.out.println("编号,"+Week.MONDAY.getId()+",含义,"+Week.MONDAY.getMeaning());
    }



}


