import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        var value1 = scanner.nextInt();
        System.out.printf("a raiz quadrada de %s é %s \n", value1,Math.sqrt(value1));
        System.out.printf("a potência de %s é %s \n", value1,Math.pow(value1, 2));
    }
}
