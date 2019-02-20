package model;

public class CurrentAccount implements Account {

    @Override
    public String createAccount() {
        return "current account created successfully !!!";
    }

    @Override
    public String cardDetails() {
        return null;
    }
}
