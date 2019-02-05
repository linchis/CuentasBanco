package demo.pruebacuentas.bean;

import java.util.ArrayList;

/**
 * Created by linchis on 27/01/2019.
 */

public class Response {
    private ArrayList<Account> accounts;
    private String failedAccountTypes;
    private String returnCode;

    public Response(ArrayList<Account> accounts, String failedAccountTypes, String returnCode) {
        this.accounts = accounts;
        this.failedAccountTypes = failedAccountTypes;
        this.returnCode = returnCode;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public String getFailedAccountTypes() {
        return failedAccountTypes;
    }

    public void setFailedAccountTypes(String failedAccountTypes) {
        this.failedAccountTypes = failedAccountTypes;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @Override
    public String toString() {
        return "Response{" +
                "accounts=" + accounts +
                ", failedAccountTypes='" + failedAccountTypes + '\'' +
                ", returnCode='" + returnCode + '\'' +
                '}';
    }
}
