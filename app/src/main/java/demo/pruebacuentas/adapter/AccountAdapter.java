package demo.pruebacuentas.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import demo.pruebacuentas.R;
import demo.pruebacuentas.bean.Account;


/**
 * Created by linchis on 22/01/2019.
 */

public class AccountAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<Account> accountList;

    public AccountAdapter(List<Account> accountList) {
        this.accountList = accountList;
    }

    @Override
    public int getItemCount() {
        return accountList.size();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {

        int viewType = getItemViewType(i);
        Account a = accountList.get(i);

        AccountViewHolder accountViewHolder = (AccountViewHolder) holder;

        accountViewHolder.vNombre.setText(a.getAlias() + "[" + a.getAccountName() + "]");
        accountViewHolder.vBalance.setText(a.getAccountBalanceInCents()+"");
        accountViewHolder.vCurrency.setText(a.getAccountCurrency());
        accountViewHolder.vIban.setText(a.getIban());
        accountViewHolder.vId.setText(a.getAccountId());
        accountViewHolder.vNumber.setText(a.getAccountNumber());
        accountViewHolder.vType.setText(a.getAccountType());
        accountViewHolder.vVisible.setText(a.isVisible()?"VISIBLE":"OCULTO");
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int pos) {
        Log.d("ONCreateVH","position: "+pos);
        View view = null;
        RecyclerView.ViewHolder viewHolder = null;
        final int _pos = pos;
        view = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_layout, viewGroup, false);

        viewHolder = new AccountViewHolder(view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //contenido de la posicion...
                Log.d("ADAPTER","Contenido de la posicion: " + _pos + ">>>" + accountList.get(_pos));
                if (_pos != RecyclerView.NO_POSITION) {
                    //ACTION
                }
            }
        });

        return viewHolder;
    }

    public static class AccountViewHolder extends RecyclerView.ViewHolder {

        protected TextView vNombre;
        protected TextView vCurrency;
        protected TextView vBalance;
        protected TextView vId;
        protected TextView vNumber;
        protected TextView vType;
        //protected TextView vAlias;
        protected TextView vVisible;
        protected TextView vIban;


        public AccountViewHolder(View v) {
            super(v);
            vNombre =  (TextView) v.findViewById(R.id.accountName_alias);
            vCurrency = (TextView)  v.findViewById(R.id.accountCurrency);
            vBalance = (TextView)  v.findViewById(R.id.accountBalanceInCents);
            vId = (TextView) v.findViewById(R.id.accountId);
            vNumber = (TextView) v.findViewById(R.id.accountNumber);
            vType = (TextView) v.findViewById(R.id.accountType);
            vVisible = (TextView) v.findViewById(R.id.isVisible);
            vIban = (TextView) v.findViewById(R.id.iban);

        }
    }


    @Override
    public int getItemViewType(int position) {
        //...
        return position;
    }
}

