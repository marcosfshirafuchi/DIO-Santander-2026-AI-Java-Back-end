import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var canNotDrive = age <= 17;
        System.out.printf("Você pode dirigir? (%s) \n", !canNotDrive);
    }
}
