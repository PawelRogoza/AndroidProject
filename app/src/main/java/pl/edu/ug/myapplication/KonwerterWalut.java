package pl.edu.ug.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class KonwerterWalut extends AppCompatActivity {

    EditText editTextAmount;
    TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konwerter_walut);

        editTextAmount = findViewById(R.id.editTextAmount);
        textViewResult = findViewById(R.id.textViewResult);
    }

    // konwersja walut
    public void convertFromEur (View v) {
        double amount = Double.parseDouble(editTextAmount.getText().toString());
        double euro = amount * 4.53;
        double roundedEuro = BigDecimal.valueOf(euro).setScale(2, RoundingMode.UP).doubleValue();
        textViewResult.setText(Double.toString(roundedEuro) + " PLN");
    }
    public void convertFromUsd (View v) {
        double amount = Double.parseDouble(editTextAmount.getText().toString());
        double usd = amount * 3.69;
        double roundedUsd = BigDecimal.valueOf(usd).setScale(2, RoundingMode.UP).doubleValue();
        textViewResult.setText(Double.toString(roundedUsd) + " PLN");
    }
    public void convertEurToPln (View v) {
        double amount = Double.parseDouble(editTextAmount.getText().toString());
        double pln = amount / 4.53;
        double roundedPln = BigDecimal.valueOf(pln).setScale(2, RoundingMode.UP).doubleValue();
        textViewResult.setText(Double.toString(roundedPln) + " EUR");
    }
    public void convertUsdToPln (View v) {
        double amount = Double.parseDouble(editTextAmount.getText().toString());
        double pln = amount / 3.69;
        double roundedPln = BigDecimal.valueOf(pln).setScale(2, RoundingMode.UP).doubleValue();
        textViewResult.setText(Double.toString(roundedPln) + " USD");
    }

    // cofamy do menu
    public void backToMenu (View v) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }




}