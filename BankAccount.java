public class BankAccount{
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    private Double totalBankMoney;
    private static double numberOfAccounts = 0.0;
    private static double totalMoney = 0.0;

    public void depositMoney(String accountType, Double depositAmmount) {

        if(accountType == "savings"){
                this.savingsBalance += depositAmmount;
                this.totalMoney += depositAmmount;
            } else if(accountType == "checking"){
                this.checkingBalance += depositAmmount;
                this.totalMoney += depositAmmount;
                }
            }
    public void withdrawMoney(String accountType, Double withdrawAmmount) {
        if(accountType.toLowerCase() == "checking" && this.getCheckingBalance() > withdrawAmmount){
            this.checkingBalance -= withdrawAmmount;
        }
        else if(accountType == "savings" && this.getSavingsBalance() > withdrawAmmount){
            this.savingsBalance -= withdrawAmmount;
        }
        else{
            System.out.println("your broke");
        }
        this.totalBankMoney -= withdrawAmmount;
    }
    public void addToNumberOfAccounts(){
        numberOfAccounts ++;
    }
    public Double getCheckingBalance() {
        return this.checkingBalance;
    }
    public Double getSavingsBalance() {
        return this.savingsBalance;
    }
    public Double getTotalUserMoney(){
        return (this.checkingBalance + this.savingsBalance);
    }
}


    



    