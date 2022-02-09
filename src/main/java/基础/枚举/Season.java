package 基础.枚举;

public enum Season{
    SPRING("1"){
        @Override
        public Season getNextSeason() {
            return SUMMER;
        }
    },
    SUMMER("4"){
        @Override
        public Season getNextSeason() {
            return AUTUMN;
        }
    },
    AUTUMN("7"){
        @Override
        public Season getNextSeason() {
            return WINTER;
        }
    },
    WINTER("10"){
        @Override
        public Season getNextSeason() {
            return SPRING;
        }
    };

    private String monthStart;
    private Season(String monthStart){
        this.monthStart = monthStart;
    }

    public abstract Season getNextSeason();

    public static void main(String[] args) {
        System.out.println(Season.SPRING.getNextSeason());
    }
}

