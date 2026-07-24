import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        var canNotDrive = age < 18;
        System.out.printf("Você pode dirigir? (%s) \n", !canNotDrive);
    }
}
