package com.example.findjobsrd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class PantallaBuscarCurriculo extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_buscar_curriculo);

    Spinner spinnerProvincia = findViewById(R.id.spinnerProvincias);
    ArrayAdapter<CharSequence> adapterProvincia = ArrayAdapter.createFromResource(this,
            R.array.Provincias, android.R.layout.simple_spinner_item);
        adapterProvincia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProvincia.setAdapter(adapterProvincia);
        spinnerProvincia.setOnItemSelectedListener(this);

    Spinner spinnerArea = findViewById(R.id.spinnerAreas);
    ArrayAdapter<CharSequence> adapterArea = ArrayAdapter.createFromResource(this,
            R.array.Areadetrabajo, android.R.layout.simple_spinner_item);
        adapterArea.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerArea.setAdapter(adapterArea);
        spinnerArea.setOnItemSelectedListener(this);

    Spinner spinnerEstado = findViewById(R.id.spinnerEstado);
    ArrayAdapter<CharSequence> adapterEstado = ArrayAdapter.createFromResource(this,
            R.array.Estado, android.R.layout.simple_spinner_item);
        adapterEstado.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstado.setAdapter(adapterEstado);
        spinnerEstado.setOnItemSelectedListener(this);
}

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
