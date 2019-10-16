package com.example.maziau_ar_daugiau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void generaterandom(){

        Random rand = new Random();
        randomnumber = rand.nextInt(100)+1;
    }
    public void guess(View view){
        String pranesimas;
        Log.i("log","Paspaustas");
        EditText editText = (EditText) findViewById(R.id.editText);
        int random = Integer.parseInt(editText.getText().toString());
        if(random>randomnumber) {
            pranesimas = "nespank maziau";
        }
        else if(random<randomnumber) {
            pranesimas = "seniuk daugiau";
        }
        else   {
                    pranesimas = "Atspejai :o bandyk dar";
           generaterandom();
            }
        Toast.makeText(this,pranesimas,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       generaterandom();
    }
}
