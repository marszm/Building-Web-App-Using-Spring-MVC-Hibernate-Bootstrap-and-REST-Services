package model;

public class CreditCard implements Card{
    @Override
    public String cardDetails() {
        return "Credit card has been issued !!!";
    }
}
