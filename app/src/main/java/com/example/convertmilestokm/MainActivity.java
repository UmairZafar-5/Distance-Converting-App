package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonMtoK = (Button) findViewById(R.id.buttonConvertMilestoKm);
        buttonMtoK.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                try {
                    EditText txtBoxMile = (EditText) findViewById(R.id.editTextMile);
                    EditText txtBoxKm = (EditText) findViewById(R.id.editTextKm);
                    double vMiles=Double.valueOf(txtBoxKm.getText().toString());
                    double vKm = vMiles/ 0.62137;
                    DecimalFormat formatVal = new DecimalFormat("##.##");
                    txtBoxMile.setText(formatVal.format(vKm));
                } catch (java.lang.NumberFormatException e) {
                    CharSequence msg = "Please enter a valid miles value";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                }

            }
        });
        Button buttonKtoM = (Button) findViewById(R.id.buttonConvertKmtoMiles);
        buttonKtoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText textBoxKm =(EditText) findViewById(R.id.editTextKm);
                    EditText textBoxMiles =(EditText) findViewById(R.id.editTextMile);
                    double vkm =Double.valueOf(textBoxMiles.getText().toString());
                    double vMiles= vkm * 0.62137;
                    DecimalFormat formatVal = new DecimalFormat("##.##");
                    textBoxKm.setText(formatVal.format(vMiles));
                }catch (java.lang.NumberFormatException e) {
                    CharSequence msg = "Please enter a valid miles value";
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
