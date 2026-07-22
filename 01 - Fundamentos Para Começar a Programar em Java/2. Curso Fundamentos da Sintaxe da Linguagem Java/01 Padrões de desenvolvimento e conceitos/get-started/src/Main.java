import java.util.Scanner;


public class Main {
    private static String WELCOME_MESSAGE = "Olá, informe o seu nome";

    public static void main(String[] args) {
        //meu comentario
        var scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        var name = scanner.nextLine();
        System.out.println("informe sua idade");
        var age = scanner.nextInt();
        System.out.println("Olá " + name + " sua idade é " + age);
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }
}
