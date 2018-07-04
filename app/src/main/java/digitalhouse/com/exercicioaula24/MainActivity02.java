package digitalhouse.com.exercicioaula24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity02 extends AppCompatActivity {

    Button horaMais, horaMenos, minutoMais, minutoMenos;
    TextView hora, minuto, amPm;
    int horaContador =0, minContador =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        horaMais = (Button) findViewById(R.id.buttonHoraMais);
        horaMenos = (Button) findViewById(R.id.buttonHoraMenos);
        hora = (TextView) findViewById(R.id.textViewHora);
        minuto = (TextView) findViewById(R.id.textViewMinutos);
        amPm =(TextView) findViewById(R.id.textViewAmPm);
        minutoMais = (Button) findViewById(R.id.buttonMinutoMais);
        minutoMenos = (Button) findViewById(R.id.buttonMinutoMenos);

        amPm.setText("am");
    }
        public void botaoHoraMaisPressionado(android.view.View v){
        horaContador++;
        if (horaContador>23){
            horaContador=0;
        }
            if (horaContador>9) {
                hora.setText(Integer.toString(horaContador));
                    if (horaContador>11){
                        amPm.setText("pm");
                        hora.setText(Integer.toString(horaContador-12));
                            if(horaContador==12){
                                hora.setText(Integer.toString(horaContador));
                            }
                    }


            }
            else{
                hora.setText("0"+Integer.toString(horaContador));
                amPm.setText("am");
            }

        }


        public void botaoHoraMenosPressionado(android.view.View v){
            horaContador--;
            if (horaContador<0){
                horaContador=23;
            }
            if (horaContador<12) {
                amPm.setText("am");
                hora.setText(Integer.toString(horaContador));
                if (horaContador<10){
                    hora.setText("0"+Integer.toString(horaContador));
                }

            }
            else{
                hora.setText(Integer.toString(horaContador-12));
                amPm.setText("pm");
                if(horaContador==12){
                    hora.setText(Integer.toString(horaContador));
                }
            }
        }


    public void botaoMinutosMaisPressionado(android.view.View v) {
        minContador++;
        if (minContador > 9) {
            minuto.setText(Integer.toString(minContador));
        }   else {
            minuto.setText("0" + Integer.toString(minContador));
            }
    }

    public void botaoMinutosMenosPressionado(android.view.View v) {
        minContador--;
        if (minContador > 9) {
            minuto.setText(Integer.toString(minContador));
        }   else {
            minuto.setText("0" + Integer.toString(minContador));
        }
    }


    public void botaoOk2Pressionado(android.view.View v) {
        android.content.Intent intent1 = new android.content.Intent(this, tela3.class);
        Bundle meuBundle = new Bundle();
        meuBundle.putString("horaSelecionada", Integer.toString(horaContador));
        meuBundle.putString("minutoSelecionado", minuto.getText().toString());

        intent1.putExtras(meuBundle);
        startActivity(intent1);
    }

}

