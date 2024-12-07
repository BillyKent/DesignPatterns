package structural_patterns.proxy_access;

public class PersonalAccount implements BankAccount {

    private String accountId;
    private int cashAmount;

    public PersonalAccount(String accountId) {
        System.out.println("Creando cuenta " + accountId);
        this.accountId = accountId;
    }

    @Override
    public void makeTransfer(int amount, String targetAccountId) {
        if (cashAmount >= amount) {
            cashAmount -= amount;
            System.out.println("Transfiriendo " + amount + " a " + targetAccountId + ", quedan " + cashAmount);
        } else {
            System.out.println("Transferencia denegada, no hay suficiente saldo");
        }
    }

    @Override
    public void chargeCash(int amount) {
        cashAmount += amount;
        System.out.println("Cargando " + amount + ", quedan " + cashAmount);
    }

    @Override
    public void checkCashAmount() {
        System.out.println("[" + accountId + "] : Consultando saldo, queda " + cashAmount);
    }
}
