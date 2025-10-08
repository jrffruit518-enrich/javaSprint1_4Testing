package spring1TascaS103_N1_1;

/**
 * ClassName: Month
 * Package: spring1TascaS103_N1_1
 * Description:
 * Author: Rong Jiang
 * Create:08/10/2025 - 16:38
 * Version:v1.0
 */
public enum Month {

    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String name;


    Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                '}';
    }
}
