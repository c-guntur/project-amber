package none.cgutils.amber;

public class Ex5PatternMatchInstanceOf {

    public static void main(String[] args) {

        Long aLong = 7L;
        printIfLong(aLong);

        Long nullLong = null;
        printIfLong(nullLong);
    }

    private static void printIfLong(Object object) {

        if(object instanceof Long myLong) {
            //                 "object"      is the     "variable"
            // "instanceof Long myLong"      is the     "pattern matching"
            //
            // --------------------------------------------------- Pattern Matching = test + target
            //        "instanceof Long"      is the     "test"   or   "predicate"
            //                 "myLong"      is the     "target" or   "binding variable"

            System.out.println("aLong = [" + myLong +"]");
        } else {

            System.out.println("Not an instance of Long");
        }
    }
}