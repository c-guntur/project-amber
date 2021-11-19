package none.cgutils.amber;

class TextBlocks {

    public static void main(String[] args) {

        //NOTE: Single line multi-string throws compiler error when uncommented.
//        String text = """Lorem ipsum dolor sit amet, consectetur adipiscing elit""";

        //NOTE: Escaping forward-slash at the end combines the lines
        String text1 = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;

        //NOTE: Zero indentation for each line
        String text2 = """
                Lorem ipsum dolor sit amet, consectetur adipiscing 
                elit, sed do eiusmod tempor incididunt ut labore 
                et dolore magna aliqua.
                """;

        //NOTE: 7 space indentation for each line
        String text3 = """
                       Lorem ipsum dolor sit amet, consectetur adipiscing 
                       elit, sed do eiusmod tempor incididunt ut labore 
                       et dolore magna aliqua.
                """;

        System.out.println("----------");
        System.out.println(text1);
        System.out.println("----------");
        System.out.println(text2);
        System.out.println("----------");
        System.out.println(text3);
    }
}