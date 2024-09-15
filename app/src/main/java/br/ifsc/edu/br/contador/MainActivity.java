package br.ifsc.edu.br.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button conversor1 = findViewById(R.id.button1);
        TextView myTextView = findViewById(R.id.textView);
        EditText celcius = findViewById(R.id.celcius);
        EditText fahrenheit = findViewById(R.id.fahrenheit);

        conversor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                TextView t=(TextView) view;
            }
        });
    }
}