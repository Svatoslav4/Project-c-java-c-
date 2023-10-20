using System;

class Program {
    static void Main() {
        int price;
        string productName;

        Console.Write("Введіть назву продукту: ");
        productName = Console.ReadLine();
        Console.Write("Введіть ціну продукту: ");
        price = int.Parse(Console.ReadLine());

        Console.WriteLine("Ви внесли продукт: " + productName + " за ціною " + price + " гривень.");
    }
}
