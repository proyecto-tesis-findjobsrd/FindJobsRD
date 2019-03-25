package com.example.findjobsrd;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class PantallaRegistrarCurriculum extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar_curriculum);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


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

        Spinner spinnerSexo = findViewById(R.id.spinnersexo);
        ArrayAdapter<CharSequence> adapterSexo = ArrayAdapter.createFromResource(this,
                R.array.Sexo, android.R.layout.simple_spinner_item);
        adapterSexo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSexo.setAdapter(adapterSexo);
        spinnerSexo.setOnItemSelectedListener(this);

        Spinner spinnerIdiomas = findViewById(R.id.spinnerIdiomas);
        ArrayAdapter<CharSequence> adapterIdiomas = ArrayAdapter.createFromResource(this,
                R.array.Idioma, android.R.layout.simple_spinner_item);
        adapterIdiomas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerIdiomas.setAdapter(adapterIdiomas);
        spinnerIdiomas.setOnItemSelectedListener(this);

        Spinner spinnerFormacionAcademica = findViewById(R.id.spinnerFormacionAcademica);
        ArrayAdapter<CharSequence> adapterFormacionAcademica = ArrayAdapter.createFromResource(this,
                R.array.FormacionAcademica, android.R.layout.simple_spinner_item);
        adapterFormacionAcademica.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFormacionAcademica.setAdapter(adapterFormacionAcademica);
        spinnerFormacionAcademica.setOnItemSelectedListener(this);

        Spinner spinnerEstadoCivil = findViewById(R.id.spinnerEstadoCivil);
        ArrayAdapter<CharSequence> adapterEstadoCivil = ArrayAdapter.createFromResource(this,
                R.array.EstadoCivil, android.R.layout.simple_spinner_item);
        adapterEstadoCivil.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstadoCivil.setAdapter(adapterEstadoCivil);
        spinnerEstadoCivil.setOnItemSelectedListener(this);



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