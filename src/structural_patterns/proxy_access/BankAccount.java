package structural_patterns.proxy_access;

public interface BankAccount {

    void makeTransfer(int amount, String targetAccountId);

    void chargeCash(int amount);

    void checkCashAmount();
}
