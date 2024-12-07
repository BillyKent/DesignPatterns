package structural_patterns.proxy_access;

public class Client {

    /**
     * Ejemplo de uso del patron proxy para restringir el acceso a la funcionalidad
     * de la clase PersonalAccount. Se usa la clase Proxy para limitar el número
     * de accesos a su funcionalidad declarada en BankAccount.
     *
     * */
    public static void main(String[] args) {

        BankAccount account = new PersonalAccount("BILLY");

        account.chargeCash(40);
        account.chargeCash(20);
        account.chargeCash(30);

        account.makeTransfer(12, "YAPE");
        account.makeTransfer(20, "MACACO");
        account.makeTransfer(36, "PETER");

        account.checkCashAmount();
        account.checkCashAmount();
        account.checkCashAmount();


        BankAccount proxyAccount = new PersonalAccountProxy("BILLY2");

        proxyAccount.chargeCash(40);
        proxyAccount.chargeCash(20);
        proxyAccount.chargeCash(30);

        proxyAccount.makeTransfer(12, "YAPE");
        proxyAccount.makeTransfer(20, "MACACO");
        proxyAccount.makeTransfer(36, "PETER");

        proxyAccount.checkCashAmount();
        proxyAccount.checkCashAmount();
        proxyAccount.checkCashAmount();
    }
}
