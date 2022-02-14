package com.example.loginappas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/*******************************************************
 * nazwa klasy: MainActivity
 * opis: Klasa uruchamiająca główną aktywnść
 * autor: 00000000000
 *******************************************************/
public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText haslo;
    EditText powtorzone;
    TextView komunikat;

    /*******************************************************
     * nazwa funkcji: onCreate
     * parametry wejściowe: savedInstanceState - parametry uruchmieniowe aplkacji
     * wartość zwracana: brak
     * opis: uruchamia główną aktywnosć klasy
     * autor: 00000000000
     *******************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        haslo = (EditText) findViewById(R.id.haslo);
        powtorzone = (EditText) findViewById(R.id.powtorzone);
        komunikat = (TextView) findViewById(R.id.komunikat);
    }

    /*******************************************************
     * nazwa funkcji: zatwierdz
     * parametry wejściowe: widok na którym powstaje zdarzenie
     * wartość zwracana: brak
     * opis: obsługa zdarzenia onClick na przycisku Zatwierdź
     * autor: 00000000000
     *******************************************************/
    public void zatwierdz(View view) {
        String komunikatStr = "";
        String emailStr = email.getText().toString();
        if(emailStr.indexOf("@")==-1){
            komunikatStr ="Nieprawidłowy adres e-mail. ";
        }
        String hasloStr = haslo.getText().toString();
        String powtorzoneStr = powtorzone.getText().toString();
        if(!hasloStr.equals(powtorzoneStr)) {
            komunikatStr += "Hasła się różnią. ";
        }
        if(komunikatStr.length()==0){
            komunikatStr = "Witaj "+ emailStr;
        }
        komunikat.setText(komunikatStr);
    }
}