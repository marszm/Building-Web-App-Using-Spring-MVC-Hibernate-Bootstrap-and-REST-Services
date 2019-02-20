package model;

public class CurrentAccount implements Account {

    private Card creditCard;

    public void setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String createAccount() {
        return "current account created successfully !!!";
    }

    @Override
    public String cardDetails() {
        return this.creditCard.cardDetails();
    }
}
