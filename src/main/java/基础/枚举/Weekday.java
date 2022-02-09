package 基础.枚举;

enum Weekday {
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);

    private int value;

    Weekday(int value) {
        this.value = value;
    }
}


