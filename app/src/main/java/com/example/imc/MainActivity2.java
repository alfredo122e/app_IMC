package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button pagina1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pagina1=(Button)findViewById(R.id.button2);

        pagina1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){

                Intent pagina1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(pagina1);
            }
        });
    }
}