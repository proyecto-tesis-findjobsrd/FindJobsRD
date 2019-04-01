package com.example.findjobsrd;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class PantallaPrincipalEmpleador extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal_empleador);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button btnRegistrarEmpleo = (Button) findViewById(R.id.buttonRegistrarEmpleo);
        btnRegistrarEmpleo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(PantallaPrincipalEmpleador.this, PantallaRegistrarEmpleo.class);
                startActivity(intent);
            }
        });

        Button btnBuscarCurriculos = (Button) findViewById(R.id.buttonBuscarCurriculos);
        btnBuscarCurriculos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(PantallaPrincipalEmpleador.this, PantallaBuscarCurriculo.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pantalla_principal_empleador, menu);
        return true;
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.curriculosfavoritos) {

        } else if (id == R.id.navegadorEmpleador) {
            Intent intent= new Intent(this, PantallaNavegador.class);
            startActivity(intent);

        } else if (id == R.id.compararEmpleador) {
            Intent intent= new Intent(this, PantallaCompararCurriculo.class);
            startActivity(intent);

        } else if (id == R.id.AyudaEmpleador) {
            Intent intent= new Intent(this, PantallaAyudaEmpleador.class);
            startActivity(intent);

        } else if (id == R.id.ConfiguracionEmpleador) {
            Intent intent= new Intent(this, PantallaAjustesEmpleador.class);
            startActivity(intent);

        } else if (id == R.id.compartirEmpleador) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Si no tienes empleo, Descarga ---> https://play.google.com/store/apps/details?id=com.FindJobsRD");
            startActivity(Intent.createChooser(intent, "Share with"));

        } else if (id == R.id.acercadeEmpleador) {
            Intent intent= new Intent(this, PantallaAcercaDe.class);
            startActivity(intent);

        } else if (id == R.id.cerrarsesionEmpleador) {
            Intent intent= new Intent(this, PantallaLogin.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
