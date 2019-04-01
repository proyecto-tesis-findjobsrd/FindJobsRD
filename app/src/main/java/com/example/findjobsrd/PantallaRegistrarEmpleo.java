package com.example.findjobsrd;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class PantallaRegistrarEmpleo extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registrar_empleo);
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

        Spinner spinnerEstado = findViewById(R.id.spinnerEstado);
        ArrayAdapter<CharSequence> adapterEstado = ArrayAdapter.createFromResource(this,
                R.array.Estado, android.R.layout.simple_spinner_item);
        adapterEstado.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstado.setAdapter(adapterEstado);
        spinnerEstado.setOnItemSelectedListener(this);

        Spinner spinnerAnosExperiencia = findViewById(R.id.spinneranodeexperiencia);
        ArrayAdapter<CharSequence> adapterAnosExperiencia = ArrayAdapter.createFromResource(this,
                R.array.AnosExperiencia, android.R.layout.simple_spinner_item);
        adapterAnosExperiencia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAnosExperiencia.setAdapter(adapterAnosExperiencia);
        spinnerAnosExperiencia.setOnItemSelectedListener(this);

        Spinner spinnerRangoEdad = findViewById(R.id.spinnerRangoEdad);
        ArrayAdapter<CharSequence> adapterRangoEdad = ArrayAdapter.createFromResource(this,
                R.array.RangoEdad, android.R.layout.simple_spinner_item);
        adapterRangoEdad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRangoEdad.setAdapter(adapterRangoEdad);
        spinnerRangoEdad.setOnItemSelectedListener(this);

        Spinner spinnerFormacionAcademica = findViewById(R.id.spinnerFormacionAcademica);
        ArrayAdapter<CharSequence> adapterFormacionAcademica = ArrayAdapter.createFromResource(this,
                R.array.FormacionAcademica, android.R.layout.simple_spinner_item);
        adapterFormacionAcademica.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFormacionAcademica.setAdapter(adapterFormacionAcademica);
        spinnerFormacionAcademica.setOnItemSelectedListener(this);

        Spinner spinnerTipoContrato = findViewById(R.id.spinnerTipoContrato);
        ArrayAdapter<CharSequence> adapterTipoContrato = ArrayAdapter.createFromResource(this,
                R.array.TipoContrato, android.R.layout.simple_spinner_item);
        adapterTipoContrato.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTipoContrato.setAdapter(adapterTipoContrato);
        spinnerTipoContrato.setOnItemSelectedListener(this);

        Spinner spinnerCantidadVacantes = findViewById(R.id.spinnerCantidadVacantes);
        ArrayAdapter<CharSequence> adapterCantidadVacanteso = ArrayAdapter.createFromResource(this,
                R.array.numeros, android.R.layout.simple_spinner_item);
        adapterCantidadVacanteso.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCantidadVacantes.setAdapter(adapterCantidadVacanteso);
        spinnerCantidadVacantes.setOnItemSelectedListener(this);

        Spinner spinnerIdiomas = findViewById(R.id.spinnerIdiomas);
        ArrayAdapter<CharSequence> adapterIdiomas = ArrayAdapter.createFromResource(this,
                R.array.Idioma, android.R.layout.simple_spinner_item);
        adapterIdiomas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerIdiomas.setAdapter(adapterIdiomas);
        spinnerIdiomas.setOnItemSelectedListener(this);

        Spinner spinnerSexo = findViewById(R.id.spinnersexorequerido);
        ArrayAdapter<CharSequence> adapterSexo = ArrayAdapter.createFromResource(this,
                R.array.Sexo, android.R.layout.simple_spinner_item);
        adapterSexo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSexo.setAdapter(adapterSexo);
        spinnerSexo.setOnItemSelectedListener(this);

        Spinner spinnerJornada = findViewById(R.id.spinnerJornadaTrabajo);
        ArrayAdapter<CharSequence> adapterJornada = ArrayAdapter.createFromResource(this,
                R.array.JornadaTrabajo, android.R.layout.simple_spinner_item);
        adapterJornada.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerJornada.setAdapter(adapterSexo);
        spinnerJornada.setOnItemSelectedListener(this);
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
