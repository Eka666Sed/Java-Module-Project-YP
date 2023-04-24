class CalculatorBill {
    public void calc(double totalPrice, int i) {
        double payPerPerson = totalPrice/i;
        int lastDigit = (int)payPerPerson % 10;
        String rub="";
        switch (lastDigit)
        {
            case 1: rub="рубль"; break;
            case 2: rub="рубля"; break;
            case 3: rub="рубля";break;
            case 4: rub="рубля";break;
            case 11: rub="рублей";break;
            case 12: rub="рублей";break;
            case 13: rub="рублей";break;
            case 14: rub="рублей";break;
            default: rub = "рублей";break;
        }
        System.out.println("Каждому нужно заплатить: " + String.format("%.2f", payPerPerson) +" "+rub + ".");
    }
}
