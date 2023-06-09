public class AsciiChars {
    public static void printNumbers() {

        for(int i = 48; i < 58; i++){
            char a = (char) i;
            System.out.print(a);
        }
    }

    public static void printLowerCase() {
        for (int i = 97; i < 123; i++) {
            char b = (char) i;
            System.out.print(b);
        }
    }

        public static void printUpperCase () {
            for (int i = 65; i < 91; i++) {
                char b = (char) i;
                System.out.print(b);
            }
        }
}

