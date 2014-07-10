package exemplo.android.guia.contatos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import exemplo.android.guia.contatos.view.SalvarActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_novo) {
            irParaSalvar();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void irParaSalvar() {
        Intent intent  = new Intent(MainActivity.this, SalvarActivity.class);
        startActivity(intent);
    }
}
