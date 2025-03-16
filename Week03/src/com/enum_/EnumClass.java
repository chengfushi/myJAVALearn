package com.enum_;

public class EnumClass {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        Season season1 = Season.SPRING;
        System.out.println(season.name());
        System.out.println(season.toString());
        System.out.println(season.compareTo(season1));
        System.out.println(season.ordinal());
        System.out.println(season1.compareTo(season));

        Season[] seasons = Season.values();

        for (Season s : seasons){
            System.out.println(s.toString());
        }
    }
}

enum Season {
    SPRING("春天"),SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天");

    private String name;

    Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
