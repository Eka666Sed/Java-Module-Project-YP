
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);



        //code
        ProductAndPrice ProductAndPrice = new ProductAndPrice();
        CalculatorBill calculatorBill = new CalculatorBill();


        while (true) {
            System.out.println("На сколько человек разделить счет?");
            //что будет если ввести буквы вместо цифр,
            String input = scanner.next();
            try
            {

                int i = Integer.parseInt(input);

                if (i > 1) {
                    ProductAndPrice.calculate();
                    //double totalprice = ProductAndPrice.getCurretnPrice();

                    //v1
                    calculatorBill.calc(ProductAndPrice.totalPrice, i);
                    //v2
                    //calculatorBill.calc(ProductAndPrice.getCurretnPrice(),i);
                    break;
                }
                if (i <= 1) {
                    System.out.println("Некорректное значение для подсчета.");
                    continue;
                }
            }
            catch (Exception exx)
            {
                System.out.println("преобразование к числу не получилось! введите еще раз "+ exx.getMessage());
            }
        }
    }

}

