package demo.pruebacuentas.bean;

/**
 * Created by linchis on 27/01/2019.
 */

public class Account {
    private long accountBalanceInCents;
    private String accountCurrency;
    private String accountId;
    private String accountName;
    private String accountNumber;
    private String accountType;
    private String alias;
    private boolean isVisible;
    private String iban;

    public Account(long accountBalanceInCents, String accountCurrency, String accountId, String accountName, String accountNumber, String accountType, String alias, boolean isVisible, String iban) {
        this.accountBalanceInCents = accountBalanceInCents;
        this.accountCurrency = accountCurrency;
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.alias = alias;
        this.isVisible = isVisible;
        this.iban = iban;
    }


    public long getAccountBalanceInCents() {
        return accountBalanceInCents;
    }

    public void setAccountBalanceInCents(long accountBalanceInCents) {
        this.accountBalanceInCents = accountBalanceInCents;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountBalanceInCents=" + accountBalanceInCents +
                ", accountCurrency='" + accountCurrency + '\'' +
                ", accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", alias='" + alias + '\'' +
                ", isVisible=" + isVisible +
                ", iban='" + iban + '\'' +
                '}';
    }
}
