import java.util.Scanner;

public class ShopProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price;
        String productName;

        System.out.print("Введіть назву продукту: ");
        productName = scanner.nextLine();
        System.out.print("Введіть ціну продукту: ");
        price = scanner.nextInt();

        System.out.println("Ви внесли продукт: " + productName + " за ціною " + price + " гривень.");
    }
}
