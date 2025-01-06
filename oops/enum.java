public class EnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        if (today == Day.WEDNESDAY) {
            System.out.println("It's the middle of the week!");
        }
    }
}

