public class StringMethods {


    public static void main(String[] args) {
        String myString = "Das ist ein ziemlich langer fancy String!";
        int length = myString.length();
        System.out.println(length);

        Boolean fancy = myString.contains("fancy");
        System.out.println(fancy);

        aufruf(length);

    }

    public static void aufruf(int length) {
        if (length > 50 ) {
            System.out.println("Der String hat mehr als 50 Zeichen.");
        } else {
            System.out.println("Der String hat weniger als 50 Zeichen.");
        }
    }
}
