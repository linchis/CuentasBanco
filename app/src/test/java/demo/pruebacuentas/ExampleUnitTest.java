package demo.pruebacuentas;

import android.accounts.AccountManager;

import org.junit.Test;

import java.util.List;

import demo.pruebacuentas.bean.Account;
import demo.pruebacuentas.ui.MainActivity;

import static demo.pruebacuentas.manager.AcountManager.loadAccounts;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void load_json_isCorrect() throws Exception {
        Controlador.accounts = loadAccounts();
        assertTrue(null,Controlador.accounts!= null && Controlador.accounts.size()>0);

    }
}