package com.example.agualife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void calcularAgua(View view){
        String aux ;
        DecimalFormat formato = new DecimalFormat("0.00");
        EditText valorIdade = findViewById(R.id.editIdade);
        EditText valorPeso = findViewById(R.id.editPeso);
        TextView resultado = findViewById(R.id.textViewResultado);
        try {
            if (Integer.valueOf(valorIdade.getText().toString()).intValue() < 18){

                int aux2 = Integer.valueOf(valorPeso.getText().toString()).intValue();
                double seila = aux2* 0.04;
                aux = "Você deve beber " + formato.format(seila) + " litros d'água por dia";
                resultado.setText(aux);


            }else if( 18 <= Integer.valueOf(valorIdade.getText().toString()).intValue() && Integer.valueOf(valorIdade.getText().toString()).intValue()  <= 55 ){

                int aux2 = Integer.valueOf(valorPeso.getText().toString()).intValue();
                double seila = aux2* 0.035;
                aux = "Você deve beber " + formato.format(seila)  + " litros d'água por dia";
                resultado.setText(aux);

            }else if (55 < Integer.valueOf(valorIdade.getText().toString()).intValue()){
                int aux2 = Integer.valueOf(valorPeso.getText().toString()).intValue();
                double seila = aux2 * 0.03;
                aux = "Você deve beber " + formato.format(seila)  + " litros d'água por dia";
                resultado.setText(aux);
            }

        }catch (RuntimeException e){
            resultado.setText("Digite um número");
        }

    }

    public void refresh(View view){
        EditText valorIdade = findViewById(R.id.editIdade);
        EditText valorPeso = findViewById(R.id.editPeso);
        TextView resultado = findViewById(R.id.textViewResultado);
        resultado.setText("");
        valorIdade.setText("");
        valorPeso.setText("");
    }

}