package exemplo.android.guia.contatos.view;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;

import exemplo.android.guia.contatos.R;

public class SalvarActivity extends ActionBarActivity {

    private EditText etNome, etTelefone, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salvar);
        carregar();
    }

    private void carregar() {
        etNome = (EditText) findViewById(R.id.et_nome);
        etTelefone = (EditText) findViewById(R.id.et_telefone);
        etEmail = (EditText) findViewById(R.id.et_email);
    }
}
