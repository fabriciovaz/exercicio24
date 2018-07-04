package digitalhouse.com.exercicioaula24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tela3 extends AppCompatActivity {

    TextView franca, china, africa;
    int hora =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);


        franca = (TextView) findViewById(R.id.textViewFranca);
        china = (TextView) findViewById(R.id.textViewChina);
        africa = (TextView) findViewById(R.id.textViewAfrica);


        Intent outroIntent = getIntent();
        Bundle outroBundle = outroIntent.getExtras();
        hora = 5+Integer.parseInt(outroBundle.getString("horaSelecionada"));
        franca.setText(outroBundle.getString("horaSelecionada")+" : "+outroBundle.getString("minutoSelecionado"));
    }
}
