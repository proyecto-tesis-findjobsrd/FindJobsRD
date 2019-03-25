package com.example.findjobsrd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PantallaListaEmpleos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_lista_empleos);

        //a list to store all the products
        List<ListaDatosEmpleos> productList;

        //the recyclerview
        RecyclerView recyclerView;

        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new ListaDatosEmpleos(
                        1,
                        "Representante de Servicio al Cliente",
                        "Vuo Partners LTD",
                        "Concepción de La Vega",
                        "Temporal",
                        R.drawable.buttonshape));

        productList.add(
                new ListaDatosEmpleos(
                        1,
                        "Sub-gerente de tienda",
                        "Domino's Pizza",
                        "Concepción de La Vega",
                        "Fijo",
                        R.drawable.buttonshape));

        productList.add(
                new ListaDatosEmpleos(
                        1,
                        "Vendedor Freelance",
                        "WTSOLUTIONS S.R.L.",
                        "Santiago ",
                        "Temporal",
                        R.drawable.buttonshape));
        productList.add(
                new ListaDatosEmpleos(
                        1,
                        "Diseñador gráfico - Remoto",
                        "L&T Enterprice",
                        "Santo Domingo",
                        "Temporal",
                        R.drawable.buttonshape));
        productList.add(
                new ListaDatosEmpleos(
                        1,
                        "Representante de Gestion de Cobros",
                        "Coreval SRL",
                        "Santiago De Los Caballeros\n",
                        "Fijo",
                        R.drawable.buttonshape));
        productList.add(
                new ListaDatosEmpleos(
                        1,
                        "Albañil",
                        "Contructora Morillo",
                        "Santo Domingo",
                        "Temporal",
                        R.drawable.buttonshape));
        productList.add(
                new ListaDatosEmpleos(
                        1,
                        "Gerente General",
                        "La Sirena, SRL",
                        "Santiago De Los Caballeros\n",
                        "Fijo",
                        R.drawable.buttonshape));

        //creating recyclerview adapter
        EmpleosAdapter adapter = new EmpleosAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

    public void AbrirDetalle(View v) {
        Intent intent = new Intent(PantallaListaEmpleos.this, PantallaDetallesCurriculo.class);
        startActivity(intent);

    }
}
