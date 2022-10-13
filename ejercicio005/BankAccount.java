package ejercicio005;

public class BankAccount {
    private Integer accountNumber;
    private Integer dniNumber;
    private Double currentBalance;
    private Double interest;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(Integer dniNumber) {
        this.dniNumber = dniNumber;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public BankAccount(Integer accountNumber, Integer dniNumber, Double currentBalance, Double interest) {
        this.accountNumber = accountNumber;
        this.dniNumber = dniNumber;
        this.currentBalance = currentBalance;
        this.interest = interest;
    }

    public BankAccount() {
    }
}
