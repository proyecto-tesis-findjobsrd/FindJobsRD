package com.example.findjobsrd;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
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
import android.widget.Toast;

public class PantallaPrincipalBuscador extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal_buscador);
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

        Button fab = (Button) findViewById(R.id.btnRegistrarCurriculo);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(PantallaPrincipalBuscador.this, PantallaRegistrarCurriculum.class);
                startActivity(intent);
            }
        });

        Button fab1 = (Button) findViewById(R.id.btnBuscarEmpleoBuscador);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(PantallaPrincipalBuscador.this, PantallaBuscarEmpleo.class);
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
        getMenuInflater().inflate(R.menu.pantalla_principal_buscador, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.empleosfavoritos) {
            Intent intent= new Intent(this, PantallaListaEmpleos.class);
            startActivity(intent);

        } else if (id == R.id.navegadorBuscador) {
            Intent intent= new Intent(this, PantallaNavegador.class);
            startActivity(intent);

        } else if (id == R.id.compararBuscador) {

        } else if (id == R.id.AyudaBuscador) {
            Intent intent= new Intent(this, PantallaAyudaBuscador.class);
            startActivity(intent);


        } else if (id == R.id.ConfiguracionBuscador) {
            Intent intent= new Intent(this, PantallaAjustesBuscador.class);
            startActivity(intent);

        } else if (id == R.id.compartirBuscador) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Si no tienes empleo, Descarga ---> https://play.google.com/store/apps/details?id=com.FindJobsRD");
            startActivity(Intent.createChooser(intent, "Share with"));

        } else if (id == R.id.acercadeBuscador) {
            Intent intent= new Intent(this, PantallaAcercaDe.class);
            startActivity(intent);

        } else if (id == R.id.cerrarsesionBuscador) {
            Intent intent= new Intent(this, PantallaLogin.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
