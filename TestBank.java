class TestBank{
    public static void main(String[] args) {
        
        BankAccount MattsAccounts = new BankAccount();
        System.out.println(MattsAccounts);

        MattsAccounts.depositMoney("savings", 5500.00);
        System.out.println(MattsAccounts.getCheckingBalance());

        MattsAccounts.withdrawMoney("savings", 2500.00);
        System.out.println(MattsAccounts.getCheckingBalance());




        BankAccount AdamsAccounts = new BankAccount();
        System.out.println(AdamsAccounts);

        AdamsAccounts.depositMoney("checking", 9500.00);
        System.out.println(AdamsAccounts.getCheckingBalance());

        AdamsAccounts.withdrawMoney("checking", 4500.00);
        System.out.println(AdamsAccounts.getCheckingBalance());
    }
}