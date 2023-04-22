
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        class ProductAndPrice {
        public void calculate() {
            Scanner scanner = new Scanner(System.in);
            double totalPrice = 0.00;
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
            public void getCurretnPrice() {
            return totalPrice;
            }
        }
        class CalculatorBill {
            public void calc() {
                double payPerPerson = totalPrice/i;
                System.out.println(payPerPerson);
            }
        }


        ProductAndPrice ProductAndPrice = new ProductAndPrice();
        CalculatorBill calculatorBill = new CalculatorBill();
        double payPerPerson = calculatorBill.calc(totalPrice,i);

        while (true) {
            System.out.println("На сколько человек разделить счет?");
            int i = scanner.nextInt();

            if (i > 1) {
                ProductAndPrice.calculate();
                ProductAndPrice.getCurretnPrice();

                break;
            }
            if (i <= 1) {
                System.out.println("Некорректное значение для подсчета.");
                continue;
            }
        }
    }

}

