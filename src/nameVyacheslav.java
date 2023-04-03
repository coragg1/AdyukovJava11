import java.util.Scanner;

public class nameVyacheslav {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name.equalsIgnoreCase("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени");
    }
}
