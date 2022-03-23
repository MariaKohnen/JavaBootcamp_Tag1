public class RelationalOperators {

    public static void main(String[] args) {
        int x = 15;
        int y = 15;
        int addition = x + y;
        int subtract = x - y;
        int multiplikation = x * y;
        int division = x / y;

        System.out.println(addition);
        System.out.println(subtract);
        System.out.println(multiplikation);
        System.out.println(division);

        boolean c = x < y;
        System.out.println(c);

        if (x>y) {
            System.out.println(x + " ist größer als " + y);
        } else if (x==y){
            System.out.println(x + " ist gleich " +y);
        } else {
            System.out.println(x + " ist kleiner als " + y);
        }
    }
}
