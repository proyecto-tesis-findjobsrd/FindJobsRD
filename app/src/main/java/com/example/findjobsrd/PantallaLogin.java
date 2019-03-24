package com.example.findjobsrd;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PantallaLogin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_pantalla_login);


        Button btn = (Button) findViewById(R.id.btnIniciarSesion);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AvisoInicioSesion(v);
                Intent intent = new Intent (v.getContext(), PantallaPrincipalBuscador.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btnRegistrarse);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), PantallaElegirModo.class);
                startActivityForResult(intent, 0);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btnIniciarSesiongoogle);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AvisoInicioSesion(v);
                Intent intent = new Intent (v.getContext(), PantallaPrincipalEmpleador.class);
                startActivityForResult(intent, 0);
            }
        });





    }


    public void Aviso(View v) {
        Toast toast = Toast.makeText(this, "Fuiste Hackeado", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

        Intent intent = new Intent (v.getContext(), PantallaRecuperarContrasena.class);
        startActivityForResult(intent, 0);

    }

    public void AvisoInicioSesion(View v) {
        Toast toast = Toast.makeText(this, "Ha Iniciado Sesion", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }
}
