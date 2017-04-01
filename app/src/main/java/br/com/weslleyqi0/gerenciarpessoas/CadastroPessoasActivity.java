package br.com.weslleyqi0.gerenciarpessoas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CadastroPessoasActivity extends AppCompatActivity {

    TextView primeiroNome;
    TextView segundoNome;
    TextView ultimoNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoas);

        byIds();
        primeiroNome.getText().toString();
        segundoNome.getText().toString();
        ultimoNome.getText().toString();



    }
    private void byIds() {
        TextView primeiroNome = (TextView) findViewById(R.id.primeiro_nome);
        TextView segundoNome = (TextView) findViewById(R.id.segundo_nome);
        TextView ultimoNome = (TextView) findViewById(R.id.ultimo_nome);
        primeiroNome.setText("Weslley");
        segundoNome.setText("Bezerra");
        ultimoNome.setText("dos Santos");
    }
}
