package demo.pruebacuentas.ui;

import android.accounts.AccountManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import demo.pruebacuentas.Controlador;
import demo.pruebacuentas.R;
import demo.pruebacuentas.adapter.AccountAdapter;
import demo.pruebacuentas.bean.Account;
import demo.pruebacuentas.bean.Response;

import static demo.pruebacuentas.manager.AcountManager.filterVisibles;
import static demo.pruebacuentas.manager.AcountManager.loadAccounts;
import static demo.pruebacuentas.manager.AcountManager.sortList;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private RecyclerView recList;
    private AccountAdapter ca;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            List<Account> tmpAccounts = new ArrayList<Account>();
            tmpAccounts.addAll(loadAccounts());
            Log.d("MAIN","tmp Accounts? " + Controlador.accounts);
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_all);
                    break;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_visibles);
                    tmpAccounts = filterVisibles(tmpAccounts);
                    break;
            }
            Controlador.accounts.clear();
            Log.d("MAIN","Accounts CLEAR? " + Controlador.accounts);
            Controlador.accounts.addAll(sortList(tmpAccounts));
            Log.d("MAIN","Accounts FILTER? " + Controlador.accounts);
            ca.notifyDataSetChanged();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        recList = (RecyclerView) findViewById(R.id.pillList);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        //cargar cuentas
        Controlador.accounts = loadAccounts();
        ca = new AccountAdapter(sortList(Controlador.accounts));
        recList.setAdapter(ca);

    }



}
