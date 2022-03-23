public class Methods {

    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        /* Entweder man gibt die oben initiierten Variablen als Argumente an, */
        System.out.println(calcsum(x, y));
        /* oder man gibt freie Werte an */
        System.out.println(calcsum(30, 70));
        /* Oder man gibt das Ergebnis als neue Variable an */
        int sum = calcsum(5, 3);
        System.out.println(sum);

        mySum(sum);
        wert(x);


    }
    public static int calcsum(int x, int y) {
        return x + y;
    }

    public static void mySum(int sum) {
        System.out.println("Summe: " + sum);
    }

    public static void wert(int x) {
        if (x > 100) {
            System.out.println(x + " ist größer als 100");
        } else {
            System.out.println(x + " ist kleiner als 100");
        }
    }
}
