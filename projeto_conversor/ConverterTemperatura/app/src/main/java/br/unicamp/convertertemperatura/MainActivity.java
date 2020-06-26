package br.unicamp.convertertemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMensagens;
    EditText edtCelsius;
    Button btnConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCelsius = (EditText)findViewById(R.id.edtCelsius);
        tvMensagens = findViewById(R.id.tvMensagens);
        btnConverter = findViewById(R.id.btnConverter);

        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtCelsius.getText().toString().equals("")){
                    tvMensagens.setText("Entre com número para fazer a conversão");

                }else{
                    tvMensagens.setText("");
                    double varCelsius = Double.parseDouble(edtCelsius.getText().toString());

                    Intent intent = new Intent(MainActivity.this, resultado.class);
                    Bundle params = new Bundle();
                    double mgsCel = varCelsius;

                    params.putDouble("varCelsius", mgsCel);
                    intent.putExtras(params);
                    startActivity(intent);

                }
            }
        });
    }
}
