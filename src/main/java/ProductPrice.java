import java.util.Scanner;

class ProductAndPrice {
    //total price - class field
    public double totalPrice = 0.00;

    public void calculate() {
        Scanner scanner = new Scanner(System.in);

        String bill = "";
        String stop = "Завершить";

        while (true) {
            System.out.println("Введите название товара:");
            String productName = scanner.next();
            System.out.println("Введите стоимость товара (стоимость должна быть в формате XX.XX (рубли.копейки)):");
            double price = scanner.nextDouble();
            bill = bill.concat(productName).concat("\n");
            System.out.println("Товар успешно добавлен в счет.");
            totalPrice = totalPrice + price;
            System.out.println("Хотите ли Вы добавить ещё один товар? Для того чтобы завершить процесс добавления товаров,напишите \"Завершить\".");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(stop)) {
                break;
            } else
                continue;
        }
        System.out.println("Добавленные товары:" + "\n" + bill);
        //System.out.println("totalPrice:" + TotalPrice);
    }
    public double getCurretnPrice() {
        return totalPrice;
    }
}
