import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allProducts = "\nСписок добавленных товаров:\n";
        String input;

        System.out.println("Это программа \"Калькулятор счета\"\n\nНа сколько человек нужно разделить счет?");
        int guestAmmount = scanner.nextInt();

        //не удалось сделать нормальную обработку ввода с помощью hasNextInt(), для случаев когда в значении будет != int. Если додумаюсь, то дополню позже
        while (guestAmmount <= 1) {
            System.out.println("Введено некорректное значение. Значание должно быть больше 1. \nПожалуйста, введите кол-во гостей, на которых нужно разделить счет.");
            guestAmmount = scanner.nextInt();
        }

        Calculator totalAmount = new Calculator();
        Product userProduct = new Product(00.00, "Товар");

        do {
            userProduct.productNameInput();
            userProduct.productCostInput();
            userProduct.printInput();

            totalAmount.totalAmount = totalAmount.totalAmount + userProduct.productCost;
            totalAmount.getTotalAmount();

            allProducts += userProduct.productName + "\n";
            System.out.println(allProducts);

            userProduct.askToAddNewProduct();
            input = scanner.next();
        } while (!input.equalsIgnoreCase("Завершить"));

        TextFormatter test = new TextFormatter(7319);
        test.formateText();
    }
}