package structural_patterns.proxy_access;

public class PersonalAccountProxy implements BankAccount {

    private int remainingPaymentsCount = 1;
    private int remainingChargesCount = 1;
    private int remainingChecksCount = 1;
    private PersonalAccount personalAccount;

    public PersonalAccountProxy(String accountId) {
        this.personalAccount = new PersonalAccount(accountId);
    }

    @Override
    public void makeTransfer(int amount, String targetAccountId) {
        if (remainingPaymentsCount > 0) {
            personalAccount.makeTransfer(amount, targetAccountId);
            remainingPaymentsCount -= 1;
        } else {
            System.out.println("Has superado el limite de transferencias..");
        }
    }

    @Override
    public void chargeCash(int amount) {
        if (remainingChargesCount > 0) {
            personalAccount.chargeCash(amount);
            remainingChargesCount -= 1;
        } else {
            System.out.println("Has superado el limite de recargas..");
        }
    }

    @Override
    public void checkCashAmount() {
        if (remainingChecksCount > 0) {
            personalAccount.checkCashAmount();
            remainingChecksCount -= 1;
        } else {
            System.out.println("Has superado el límite de revisiones..");
        }
    }
}
