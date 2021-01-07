package pl.edu.ug.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

    EditText editTextNumberOne, editTextNumberTwo;
    TextView textViewCalcResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        editTextNumberOne = findViewById(R.id.editTextNumberOne);
        editTextNumberTwo = findViewById(R.id.editTextNumberTwo);

        textViewCalcResult = findViewById(R.id.textViewCalcResult);
    }

    public void plus (View v) {
        double numberOne = Double.parseDouble(editTextNumberOne.getText().toString());
        double numberTwo = Double.parseDouble(editTextNumberTwo.getText().toString());
        double result = numberOne + numberTwo;
        textViewCalcResult.setText(Double.toString(result));
        editTextNumberOne.setText("");
        editTextNumberTwo.setText("");
    }
    public void minus (View v) {
        double numberOne = Double.parseDouble(editTextNumberOne.getText().toString());
        double numberTwo = Double.parseDouble(editTextNumberTwo.getText().toString());
        double result = numberOne - numberTwo;
        textViewCalcResult.setText(Double.toString(result));
        editTextNumberOne.setText("");
        editTextNumberTwo.setText("");
    }
    public void multiply (View v) {
        double numberOne = Double.parseDouble(editTextNumberOne.getText().toString());
        double numberTwo = Double.parseDouble(editTextNumberTwo.getText().toString());
        double result = numberOne * numberTwo;
        textViewCalcResult.setText(Double.toString(result));
        editTextNumberOne.setText("");
        editTextNumberTwo.setText("");
    }
    public void divide (View v) {
        double numberOne = Double.parseDouble(editTextNumberOne.getText().toString());
        double numberTwo = Double.parseDouble(editTextNumberTwo.getText().toString());
        double result = numberOne / numberTwo;
        textViewCalcResult.setText(Double.toString(result));
        editTextNumberOne.setText("");
        editTextNumberTwo.setText("");
    }
    public void power (View v) {
        double numberOne = Double.parseDouble(editTextNumberOne.getText().toString());
        double numberTwo = Double.parseDouble(editTextNumberTwo.getText().toString());
        double result = Math.pow(numberOne, numberTwo);
        textViewCalcResult.setText(Double.toString(result));
        editTextNumberOne.setText("");
        editTextNumberTwo.setText("");
    }
    public void root (View v) {
        double numberOne = Double.parseDouble(editTextNumberOne.getText().toString());
        double result = Math.sqrt(numberOne);
        textViewCalcResult.setText(Double.toString(result));
        editTextNumberOne.setText("");
        editTextNumberTwo.setText("");
    }

    public void copyResult (View v) {
        double getResult = Double.parseDouble(textViewCalcResult.getText().toString());
        editTextNumberOne.setText(Double.toString(getResult));
    }

    public void backToMenu (View v) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }


}