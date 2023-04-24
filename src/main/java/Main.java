
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
            int i = scanner.nextInt();

            if (i > 1) {
                ProductAndPrice.calculate();
                double curr = ProductAndPrice.getCurretnPrice();
                //v1
                calculatorBill.calc(curr,i);
                //v2
                //calculatorBill.calc(ProductAndPrice.getCurretnPrice(),i);
                break;
            }
            if (i <= 1) {
                System.out.println("Некорректное значение для подсчета.");
                continue;
            }
        }
    }

}

