package cry.who.boy.tec.brandon.com.recordatorios_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView campo_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo_text=(TextView) findViewById(R.id.texto);
        campo_text.setText("Hola de nuevo putito");
    }
}
