package digitalhouse.com.exercicioaula24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tela3 extends AppCompatActivity {

    TextView franca, china, africa;
    int horaFranca =0, horaChina = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);


        franca = (TextView) findViewById(R.id.textViewFranca);
        china = (TextView) findViewById(R.id.textViewChina);
        africa = (TextView) findViewById(R.id.textViewAfrica);


        Intent outroIntent = getIntent();
        Bundle outroBundle = outroIntent.getExtras();
        horaFranca = 5+Integer.parseInt(outroBundle.getString("horaSelecionada"));
        horaChina = 10+Integer.parseInt(outroBundle.getString("horaSelecionada"));

        if (horaFranca>23){
            horaFranca-=24;
        }

        if (horaChina>23){
            horaChina-=24;
        }


        franca.setText(Integer.toString(horaFranca)+" : "+outroBundle.getString("minutoSelecionado"));
        china.setText(Integer.toString(horaChina)+" : "+outroBundle.getString("minutoSelecionado"));
        africa.setText(Integer.toString(horaFranca)+" : "+outroBundle.getString("minutoSelecionado"));
    }
}
