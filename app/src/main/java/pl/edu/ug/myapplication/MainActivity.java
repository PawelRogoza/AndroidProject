package pl.edu.ug.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intentKalkulator(View v) {
        Intent kalkulator = new Intent(this, Kalkulator.class);
        startActivity(kalkulator);
    }
    public void intentWaluta(View v) {
        Intent konwerterWalut = new Intent(this, KonwerterWalut.class);
        startActivity(konwerterWalut);
    }
}