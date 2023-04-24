class CalculatorBill {
    public void calc(double totalPrice, int i) {
        double payPerPerson = totalPrice/i;
        //double floored = Math.floor(payPerPerson);
        //int test = (int)payPerPerson;
        //conver floored to int!
        int lastDigit = (int)payPerPerson % 10;
        String rub="";
        switch (lastDigit)
        {
            case 1: rub="рубль"; break;
            case 2: rub="рубля"; break;
            case 3: rub="рубля";break;
            case 4: rub="рубля";break;
            default: rub = "рублей";break;
        }
        System.out.println(String.format("%.2f", payPerPerson) +" "+rub);
    }
}
