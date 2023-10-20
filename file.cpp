#include <iostream>
#include <string>

int main() {
    int price;
    std::string productName;

    std::cout << "Введіть назву продукту: ";
    std::cin >> productName;
    std::cout << "Введіть ціну продукту: ";
    std::cin >> price;

    std::cout << "Ви внесли продукт: " << productName << " за ціною " << price << " гривень." << std::endl;

    return 0;
}
