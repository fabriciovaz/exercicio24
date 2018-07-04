package digitalhouse.com.exercicioaula24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity_HorarioDosPaises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__horario_dos_paises);
    }

    public void botaoOkPressionado(android.view.View v){
        android.content.Intent intent1 = new android.content.Intent(this, MainActivity02.class);
        startActivity(intent1);
    }


}
