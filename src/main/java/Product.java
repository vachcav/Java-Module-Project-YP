import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);
    double productCost;
    String productName;

    Product(double productCost, String productName) {
        this.productCost = productCost;
        this.productName = productName;
    }

    void productNameInput () {
        System.out.println("Пожалуйста, введите название товара, который нужно добавить в калькулятор.");
        productName = scanner.next();
    }

    void productCostInput () {
        System.out.println("Введите стоимость данного товара в формате \"рубли.копейки\".");
        productCost = scanner.nextDouble();
    }
    void printInput() {
        String textInput = String.format("Вы добавили товар \"%s\" стоимостью %.2f₽.", productName, productCost);
        System.out.println(textInput);
    }
    void askToAddNewProduct() {
        System.out.println("Хотели бы Вы добавить еще товары в калькулятор? \nЕсли да, введите команду \"Добавить\". \nЕсли нет, введите команду \"Завершить\"");
    }
}
