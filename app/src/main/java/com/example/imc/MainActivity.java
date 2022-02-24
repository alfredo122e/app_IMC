package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular,pagina2;
    private EditText peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.editTextTextPersonName2);
        altura = findViewById(R.id.editTextTextPersonName);
        btnCalcular = findViewById(R.id.button);
        pagina2=(Button)findViewById(R.id.button3);

        pagina2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

                Intent pagina2 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(pagina2);
            }
        });

    }
    public void Calcular(View view)
    {
        double pesoo=Double.parseDouble(peso.getText().toString());
        double alturaa= Double.parseDouble(altura.getText().toString());
        double resultado= pesoo/(alturaa* alturaa);

                DecimalFormat f=new DecimalFormat("#.##");
                String resultadof="Su índice de masa corporal es: "+ f.format(resultado);

                if (resultado <=18.5) {
                    resultadof =resultadof + ". Posee bajo peso.";
                    Toast.makeText(this, resultadof, Toast.LENGTH_SHORT).show();
                }
                if (resultado>=18.5 && resultado<24.9){
                    resultadof=resultadof + ". Posee un peso normal.";
                    Toast.makeText(this, resultadof, Toast.LENGTH_SHORT).show();
                }
                if (resultado>=25.0 && resultado<29.9){
                    resultadof=resultadof + ". Posee sobrepeso.";
                    Toast.makeText(this, resultadof, Toast.LENGTH_SHORT).show();
                }
                if (resultado>=25.0){
                    resultadof=resultadof + ". Posee obesidad";
                    Toast.makeText(this, resultadof, Toast.LENGTH_SHORT).show();
                }

            }
        }



