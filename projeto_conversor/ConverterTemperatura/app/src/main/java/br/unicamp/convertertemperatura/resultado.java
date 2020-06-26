package br.unicamp.convertertemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

        tvResultadoFahrenheit.setText((varFahrenheit * 1.8) + 32 + " ºF");
        tvResultadoKelvin.setText(varKelvin + 273.15 + " K");

    }
}
