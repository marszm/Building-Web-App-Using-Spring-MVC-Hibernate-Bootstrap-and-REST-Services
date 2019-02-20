package model;

public class SavingAccount implements Account {

    private Card atmCard;

    public SavingAccount(Card atmCard) {
        this.atmCard = atmCard;
    }

    @Override
    public String createAccount(){
        return "saving account created successfully !!!";
    }

    @Override
    public String cardDetails() {
        return atmCard.cardDetails();
    }
}
