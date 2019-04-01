package com.example.findjobsrd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class PantallaCompararEmpleos extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_comparar_empleos);

        Spinner spinnerCompararPrimerEmpleo = findViewById(R.id.spinnerPrimerEmpleo);
        ArrayAdapter<CharSequence> adapterCompararEmpleo = ArrayAdapter.createFromResource(this,
                R.array.Comprar, android.R.layout.simple_spinner_item);
        adapterCompararEmpleo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCompararPrimerEmpleo.setAdapter(adapterCompararEmpleo);
        spinnerCompararPrimerEmpleo.setOnItemSelectedListener(this);

        Spinner spinnerCompararSegundoEmpleo = findViewById(R.id.spinnerSegundoEmpleo);
        ArrayAdapter<CharSequence> adapterComporarSegundoEmpleo = ArrayAdapter.createFromResource(this,
                R.array.Comprar, android.R.layout.simple_spinner_item);
        adapterComporarSegundoEmpleo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCompararSegundoEmpleo.setAdapter(adapterComporarSegundoEmpleo);
        spinnerCompararSegundoEmpleo.setOnItemSelectedListener(this);

        Spinner spinnerBaseAComparar = findViewById(R.id.spinnerCompararEnBase);
        ArrayAdapter<CharSequence> adapterCompararenbase = ArrayAdapter.createFromResource(this,
                R.array.BaseComparar, android.R.layout.simple_spinner_item);
        adapterCompararenbase.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBaseAComparar.setAdapter(adapterCompararenbase);
        spinnerBaseAComparar.setOnItemSelectedListener(this);

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
