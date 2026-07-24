public class Main7 {
    public static void main(String[] args) {
        var value = 50;
        System.out.println(++value);
        System.out.println(value);

        var value2 = 50;
        System.out.println(value2++);
        System.out.println(value2);

        var value3 = 50;
        System.out.println(--value3);
        System.out.println(value3);

        var value4 = 50;
        System.out.println(10 + value4++);
        System.out.println(10 + value4);

        var value5 = 50;
        System.out.println(10 + value5--);
        System.out.println(10 + value5);

        var value6 = 50;
        System.out.println(10 + ++value6);
        System.out.println(10 + 6);
    }
}
