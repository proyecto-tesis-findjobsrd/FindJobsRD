package com.example.findjobsrd;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaElegirModo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_elegir_modo);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button btn23 = (Button) findViewById(R.id.btnSerBuscador);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), PantallaRegistroBuscador.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btn34 = (Button) findViewById(R.id.btnSerEmpleador);
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), PantallaRegistroEmpleador.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
