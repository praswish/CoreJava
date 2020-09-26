package ClassWork.Collection.HashMapsWithClass;

public class Account {
    private long accountNumber;
    private String accountType;
    private Double balance;

    public Account(long accountNumber, String accountType, Double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
