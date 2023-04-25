
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
                int numberPeople = Integer.parseInt(input);

                if (numberPeople > 1) {
                    ProductAndPrice.calculate();
                    calculatorBill.calc(ProductAndPrice.totalPrice, numberPeople);
                    break;
                }
                    System.out.println("Некорректное значение для подсчета.");
            }
            catch (Exception exx)
            {
                System.out.println("Преобразование к числу не получилось! Введите еще раз. "+ exx.getMessage());
            }
        }
    }

}

