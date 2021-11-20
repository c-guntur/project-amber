package none.cgutils.amber;

import java.time.Month;

class Ex3Switch {

    public static void main(String[] args) {

        Month december = Month.DECEMBER;

        //NOTE: Uses arrows
        int decemberQuarter = switch (december) {
            case JANUARY, FEBRUARY, MARCH -> 1;
            case APRIL, MAY, JUNE -> 2;
            case JULY, AUGUST, SEPTEMBER -> 3;
            case OCTOBER, NOVEMBER, DECEMBER -> 4;
        };

        System.out.println("December is Q" + decemberQuarter);

        Month january = Month.JANUARY;

        //NOTE: Uses yield
        String evenOrOdd = switch (january.getValue() % 2) {
            case 0:
                yield "even";
            default:
                yield "odd";
        };

        System.out.println(january + " is an " + evenOrOdd + " month.");
    }
}