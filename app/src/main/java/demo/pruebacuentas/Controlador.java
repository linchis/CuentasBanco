package demo.pruebacuentas;

import java.util.List;

import demo.pruebacuentas.bean.Account;

/**
 * Created by linchis on 27/01/2019.
 */

public class Controlador {
    public static List<Account> accounts;
    public static String defaultinfo ="{\n" +
            "\n" +
            "\"accounts\": [\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\"accountBalanceInCents\": 985000,\n" +
            "\n" +
            "\"accountCurrency\": \"EUR\",\n" +
            "\n" +
            "\"accountId\": 748757694,\n" +
            "\n" +
            "\"accountName\": \"Hr P L G N StellingTD\",\n" +
            "\n" +
            "\"accountNumber\": 748757694,\n" +
            "\n" +
            "\"accountType\": \"PAYMENT\",\n" +
            "\n" +
            "\"alias\": \"\",\n" +
            "\n" +
            "\"isVisible\": true,\n" +
            "\n" +
            "\"iban\": \"NL23INGB0748757694\"\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\"accountBalanceInCents\": 1000000,\n" +
            "\n" +
            "\"accountCurrency\": \"EUR\",\n" +
            "\n" +
            "\"accountId\": 700000027559,\n" +
            "\n" +
            "\"accountName\": \",\",\n" +
            "\n" +
            "\"accountNumber\": 748757732,\n" +
            "\n" +
            "\"accountType\": \"PAYMENT\",\n" +
            "\n" +
            "\"alias\": \"\",\n" +
            "\n" +
            "\"isVisible\": false,\n" +
            "\n" +
            "\"iban\": \"NL88INGB0748757732\"\n" +
            "\n" +
            "},\n" +
            "\n" +
            "{\n" +
            "\n" +
            "\"accountBalanceInCents\": 15000,\n" +
            "\n" +
            "\"accountCurrency\": \"EUR\",\n" +
            "\n" +
            "\"accountId\": 700000027559,\n" +
            "\n" +
            "\"accountName\": \"\",\n" +
            "\n" +
            "\"accountNumber\": \"H 177-27066\",\n" +
            "\n" +
            "\"accountType\": \"SAVING\",\n" +
            "\n" +
            "\"alias\": \"G\\\\UfffdLSAVINGSdiacrits\",\n" +
            "\n" +
            "\"iban\": \"\",\n" +
            "\n" +
            "\"isVisible\": true,\n" +
            "\n" +
            "\"linkedAccountId\": 748757694,\n" +
            "\n" +
            "\"productName\": \"Oranje Spaarrekening\",\n" +
            "\n" +
            "\"productType\": 1000,\n" +
            "\n" +
            "\"savingsTargetReached\": 1,\n" +
            "\n" +
            "\"targetAmountInCents\": 2000\n" +
            "\n" +
            "}\n" +
            "\n" +
            "],\n" +
            "\n" +
            "\"failedAccountTypes\" : \"CREDITCARDS\",\n" +
            " \n" +
            "\"returnCode\" : \"OK\"\n" +
            "\n" +
            "}\n";
}
