package br.unicamp.convertertemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    TextView tvResultadoFahrenheit;
    TextView tvResultadoKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        Double varFahrenheit = params.getDouble("varCelsius");
        Double varKelvin = params.getDouble("varCelsius");

        tvResultadoFahrenheit = findViewById(R.id.tvResultadoFahrenheit);
        tvResultadoKelvin = findViewById(R.id.tvResultadoKelvin);

        tvResultadoFahrenheit.setText(String.valueOf((varFahrenheit * 1.8) + 32));
        tvResultadoKelvin.setText((String.valueOf(varKelvin + 273.15)));

        // varFahrenheit = (celsius* 1.8) + 32
        // varKelvin = celsius + 273.15
    }
}
