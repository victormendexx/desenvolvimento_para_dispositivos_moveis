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

        Button mybutton = findViewById(R.id.button);
        TextView myTextView = findViewById(R.id.textView);
        EditText edMin = findViewById(R.id.edMin);
        EditText edMax = findViewById(R.id.edMax);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=(TextView) view;
                Random random= new Random();
                int nmin = (Integer.parseInt(edMin.getText().toString()));
                int nmax = (Integer.parseInt(edMax.getText().toString()));
                myTextView.setText(Integer.toString(random.nextInt(nmax-nmin+1)+nmin));
            }
        });
    }
}