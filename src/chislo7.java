import java.util.Scanner;

public class chislo7 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number > 7 ? "Привет" : "");
    };
}

