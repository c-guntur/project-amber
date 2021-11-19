package none.cgutils.amber;

import java.time.Month;

class Switch {

    public static void main(String[] args) {

        Month december = Month.DECEMBER;
        Month january = Month.JANUARY;

        //NOTE: Uses arrows
        int decemberQuarter = switch (december) {
            case JANUARY, FEBRUARY, MARCH -> 1;
            case APRIL, MAY, JUNE -> 2;
            case JULY, AUGUST, SEPTEMBER -> 3;
            case OCTOBER, NOVEMBER, DECEMBER -> 4;
        };

        //NOTE: Uses yield
        int januaryQuarter = switch (january) {
            case JANUARY, FEBRUARY, MARCH: yield 1;
            case APRIL, MAY, JUNE: yield 2;
            case JULY, AUGUST, SEPTEMBER: yield 3;
            case OCTOBER, NOVEMBER, DECEMBER: yield 4;
        };

        System.out.println("January is Q" + januaryQuarter);
        System.out.println("December is Q" + decemberQuarter);
    }
}