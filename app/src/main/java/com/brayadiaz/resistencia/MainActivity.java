package com.brayadiaz.resistencia;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String sBanda_1, sBanda_2, sBanda_3, sBanda_4, resul;
    private Spinner banda_1, banda_2, banda_3, banda_4;
    private Button bBanda_1, bBanda_2, bBanda_3, bBanda_4;
    private TextView resultado;

    private int sel1 = 0, sel2 = 0, sel3 = 0, sel4 = 0;
    private float val1 = 0, val2 = 0, val3 = 0, val4 = 0;

    String colores[] = {"Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Purpura",
            "Gris", "Blanco", "Dorado", "Plateado"};
    String sColor[] = {"#000000", "#8b4513", "#ff0000", "#ff8c00", "#ffff00", "#2e7d32", "#1a237e",
    "#6a1b9a", "#616161", "#ffffff", "#ffab00", "#9e9e9e"};

    /*
    "#000000"   Negro
    "#8b4513"   Marron
    "#ff0000"   Rojo
    "#ff8c00"   Naranja
    "#ffff00"   Amarillo
    "#2e7d32"   Verde
    "#1a237e"   Azul
    "#6a1b9a"   Purpura
    "#616161"   Gris
    "#ffffff"   Blanco
    "#ffab00"   Dorado
    "#9e9e9e"   Plateado
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banda_1 = (Spinner) findViewById(R.id.banda_1);
        banda_2 = (Spinner) findViewById(R.id.banda_2);
        banda_3 = (Spinner) findViewById(R.id.banda_3);
        banda_4 = (Spinner) findViewById(R.id.banda_4);

        bBanda_1 = (Button) findViewById(R.id.bBanda_1);
        bBanda_2 = (Button) findViewById(R.id.bBanda_2);
        bBanda_3 = (Button) findViewById(R.id.bBanda_3);
        bBanda_4 = (Button) findViewById(R.id.bBanda_4);

        resultado = (TextView) findViewById(R.id.resultado);

        ArrayAdapter<CharSequence> adapter_1 = ArrayAdapter.createFromResource(this,
                R.array.banda_1, android.R.layout.simple_spinner_item);

        adapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        banda_1.setAdapter(adapter_1);

        banda_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sBanda_1 = adapterView.getItemAtPosition(i).toString();

                for (int cnt = 1; cnt <= 9; cnt++){
                    if(sBanda_1.equals(colores[cnt])){
                        bBanda_1.setBackgroundColor(Color.parseColor(sColor[cnt]));
                        sel1 = cnt;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter_2 = ArrayAdapter.createFromResource(this,
                R.array.banda_2, android.R.layout.simple_spinner_item);

        adapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        banda_2.setAdapter(adapter_2);

        banda_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sBanda_2 = adapterView.getItemAtPosition(i).toString();

                for (int cnt = 0; cnt <= 9; cnt++){
                    if(sBanda_2.equals(colores[cnt])){
                        bBanda_2.setBackgroundColor(Color.parseColor(sColor[cnt]));
                        sel2 = cnt;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter_3 = ArrayAdapter.createFromResource(this,
                R.array.banda_3, android.R.layout.simple_spinner_item);

        adapter_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        banda_3.setAdapter(adapter_3);

        banda_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sBanda_3 = adapterView.getItemAtPosition(i).toString();

                for (int cnt = 0; cnt <= 11; cnt++){
                    if(sBanda_3.equals(colores[cnt])){
                        bBanda_3.setBackgroundColor(Color.parseColor(sColor[cnt]));
                        sel3 = cnt;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter_4 = ArrayAdapter.createFromResource(this,
                R.array.banda_4, android.R.layout.simple_spinner_item);

        adapter_4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        banda_4.setAdapter(adapter_4);

        banda_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                sBanda_4 = adapterView.getItemAtPosition(i).toString();

                for (int cnt = 0; cnt <= 11; cnt++){
                    if(sBanda_4.equals(colores[cnt])){
                        bBanda_4.setBackgroundColor(Color.parseColor(sColor[cnt]));
                        sel4 = cnt;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    public void Calcular(View view) {

        switch (sel3){
            case 0:
                resul = String.valueOf(sel1) + String.valueOf(sel2) + " Ω";
                break;
            case 1:
                resul = String.valueOf(sel1) + String.valueOf(sel2) +"0 Ω";
                break;
            case 2:
                resul = String.valueOf(sel1) + "." + String.valueOf(sel2) + " KΩ";
                break;
            case 3:
                resul = String.valueOf(sel1) + String.valueOf(sel2) + " KΩ";
                break;
            case 4:
                resul = String.valueOf(sel1) + String.valueOf(sel2) + "0 KΩ";
                break;
            case 5:
                resul = String.valueOf(sel1) + "." + String.valueOf(sel2) + " MΩ";
                break;
            case 6:
                resul = String.valueOf(sel1) + String.valueOf(sel2) + " MΩ";
                break;
            case 10:
                resul = String.valueOf(sel1) + "." + String.valueOf(sel2) + " Ω";
                break;
            case 11:
                resul = String.valueOf(sel1) + String.valueOf(sel2) + "0 mΩ";
                break;
        }

        switch(sel4) {
            case 1:
                resul += " ± 1%";
                break;
            case 2:
                resul += " ± 2%";
                break;
            case 10:
                resul += " ± 5%";
                break;
            case 11:
                resul += " ± 10%";
                break;
        }

        resultado.setText(resul);

    }
}
