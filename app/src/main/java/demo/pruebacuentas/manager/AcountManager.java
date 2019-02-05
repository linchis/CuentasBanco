package demo.pruebacuentas.manager;

import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import demo.pruebacuentas.Controlador;
import demo.pruebacuentas.bean.Account;
import demo.pruebacuentas.bean.Response;

/**
 * Created by linchis on 28/01/2019.
 */

public class AcountManager {
    //Carga todas las cuentas
    public static List<Account> loadAccounts(){
        if (Controlador.accounts != null){
            Controlador.accounts.clear();
        }else{
            Controlador.accounts = new ArrayList<Account>();
        }

        Gson gson = new Gson();
        Response resp = gson.fromJson(Controlador.defaultinfo, Response.class);

        //Mensaje de exito|fracaso de carga....
        //Log.d("MAIN:::","JSON Accounts:" + resp.getAccounts());
        Controlador.accounts.addAll(resp.getAccounts());
        return Controlador.accounts;
    }

    public static List<Account> sortList(List<Account> list) {
        //Ordenar la lista
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Account a1 = (Account) o1;
                Account a2 = (Account) o2;
                if (a1.getAccountBalanceInCents() > a2.getAccountBalanceInCents()) {
                    return 1;
                } else if (a1.getAccountBalanceInCents() < a2.getAccountBalanceInCents()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        return list;
    }
    public static List<Account> filterVisibles(List<Account> lista) {
        for (int i=lista.size()-1; i>0; i--){
            if (!lista.get(i).isVisible()) lista.remove(i);
        }
        Log.d("MAIN:::","FILTRADOS:" + lista);
        return lista;
    }
}
