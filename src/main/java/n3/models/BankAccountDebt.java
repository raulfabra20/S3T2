package n3.models;

public class BankAccountDebt implements PaymentMethod{
    private String accountNumber;
    private String nameOwner;

    public BankAccountDebt(String accountNumber, String nameOwner) {
        this.accountNumber = accountNumber;
        this.nameOwner = nameOwner;
    }


    @Override
    public void processPayment() {
        System.out.println("The payment has been processed through the bank account's number: " +
                accountNumber);
    }
}
