import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        var result = scanner.nextInt();
        var isWrong = result != 4;
        System.out.printf("A resposta é 4, você acertou? (%s) \n", !isWrong);
    }
}
