package br.ifsc.edu.br.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        EditText celcius = findViewById(R.id.celcius);
        EditText fahrenheit = findViewById(R.id.fahrenheit);

        Button button2 = findViewById(R.id.button2);
        EditText quilos = findViewById(R.id.quilos);
        EditText libras = findViewById(R.id.libras);

        Button button3 = findViewById(R.id.button3);
        EditText quilometros = findViewById(R.id.quilometros);
        EditText milhas = findViewById(R.id.milhas);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (celcius.getText().toString().isEmpty() && fahrenheit.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite algum valor antes de tentar converter", Toast.LENGTH_SHORT).show();
                } else if (!celcius.getText().toString().isEmpty() && !fahrenheit.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Escolha apenas uma unidade para converter, apague um dos campos", Toast.LENGTH_SHORT).show();
                }

                else if (fahrenheit.getText().toString().isEmpty()) {
                    double celciusValor = Double.parseDouble(celcius.getText().toString());
                    double fahrenheitValor = (celciusValor * (9.0/5)) + 32;
                    fahrenheit.setText(String.format("%.2f", fahrenheitValor));
                } else if (celcius.getText().toString().isEmpty()) {
                    double fahrenheitValor = Double.parseDouble(fahrenheit.getText().toString());
                    double celciusValor = (fahrenheitValor - 32) * (5.0/9);
                    celcius.setText(String.format("%.2f", celciusValor));
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quilos.getText().toString().isEmpty() && libras.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite algum valor antes de tentar converter", Toast.LENGTH_SHORT).show();
                } else if (!quilos.getText().toString().isEmpty() && !libras.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Escolha apenas uma unidade para converter, apague um dos campos", Toast.LENGTH_SHORT).show();
                }

                else if (libras.getText().toString().isEmpty()) {
                    double quilosValor = Double.parseDouble(quilos.getText().toString());
                    double librasValor = quilosValor * 2.20462;
                    libras.setText(String.format("%.2f", librasValor));
                } else if (quilos.getText().toString().isEmpty()) {
                    double librasValor = Double.parseDouble(libras.getText().toString());
                    double quilosValor = librasValor / 2.20462;
                    quilos.setText(String.format("%.2f", quilosValor));
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quilometros.getText().toString().isEmpty() && milhas.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Digite algum valor antes de tentar converter", Toast.LENGTH_SHORT).show();
                } else if (!quilometros.getText().toString().isEmpty() && !milhas.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Escolha apenas uma unidade para converter, apague um dos campos", Toast.LENGTH_SHORT).show();
                }

                else if (milhas.getText().toString().isEmpty()) {
                    double quilometrosValor = Double.parseDouble(quilometros.getText().toString());
                    double milhasValor = quilometrosValor * 0.621371;
                    milhas.setText(String.format("%.2f", milhasValor));
                } else if (quilometros.getText().toString().isEmpty()) {
                    double milhasValor = Double.parseDouble(milhas.getText().toString());
                    double quilometrosValor = milhasValor / 0.621371;
                    quilometros.setText(String.format("%.2f", quilometrosValor));
                }
            }
        });
    }
}