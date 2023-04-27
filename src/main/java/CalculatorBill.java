class CalculatorBill {
    public void calc(double totalPrice, int numberPeople) {
        double payPerPerson = totalPrice / numberPeople;
        double flooredpPp = Math.floor(payPerPerson);
        String rub;
        int lastDigit = (int) flooredpPp % 100;
        if (11 <= lastDigit & lastDigit <= 19) {
            rub = "рублей";
            System.out.println("Каждому нужно заплатить: " + String.format("%.2f", payPerPerson) + " " + rub + ".");
        }
        int lastDigitTwo = (int) flooredpPp % 10;
        switch (lastDigitTwo) {
            case 1:
                rub = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                rub = "рубля";
                break;
            default:
                rub = "рублей";
                break;
        }
        System.out.println("Каждому нужно заплатить: " + String.format("%.2f", payPerPerson) + " " + rub + ".");
    }
}
