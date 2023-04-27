import java.util.Scanner;

class ProductAndPrice {
    public double totalPrice = 0.00;

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        String bill = "";
        String stop = "Завершить";

        while (true) {
            System.out.println("Введите название товара:");
            String productName = scanner.next();
            System.out.println("Введите стоимость товара (стоимость должна быть в формате XX.XX (рубли.копейки)):");
            double price = getProductPrice(scanner);
            bill = bill.concat(productName).concat("\n");
            System.out.println("Товар успешно добавлен в счет.");
            totalPrice = totalPrice + price;
            System.out.println("Хотите ли Вы добавить ещё один товар? Для того чтобы завершить процесс добавления товаров,напишите \"Завершить\".");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(stop)) {
                System.out.println("Добавленные товары:" + "\n" + bill);
                break;
            }

        }
    }


    double getProductPrice(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double price = scanner.nextDouble();
                while (price <= 0) {
                    System.out.println("Стоимость должна быть >0. Введите стоимость товара еще раз.");
                    price = scanner.nextDouble();
                }
                return price;
            } else {
                System.out.println("Преобразование к числу не получилось! Введите еще раз.");
                scanner.next();
            }
        }
    }
}







