
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ProductAndPrice ProductAndPrice = new ProductAndPrice();
        CalculatorBill calculatorBill = new CalculatorBill();

        while (true) {
            System.out.println("На сколько человек разделить счет?");
            String input = scanner.next();

            try
            {
                int i = Integer.parseInt(input);

                if (i > 1) {
                    ProductAndPrice.calculate();
                    calculatorBill.calc(ProductAndPrice.totalPrice, i);
                    break;
                }
                if (i <= 1) {
                    System.out.println("Некорректное значение для подсчета.");
                    continue;
                }
            }
            catch (Exception exx)
            {
                System.out.println("Преобразование к числу не получилось! Введите еще раз. "+ exx.getMessage());
            }
        }
    }

}

