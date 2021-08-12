package com.example.exemoluedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button transmite;
    EditText nume, prenume, data_n, email, tel;
    TextView rezultat;
    String inf = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nume = (EditText) findViewById(R.id.txtNume);
        prenume = (EditText) findViewById(R.id.txtPren);
        data_n = (EditText) findViewById(R.id.txtDate);
        email =  (EditText) findViewById(R.id.txtEmail);
        tel = (EditText) findViewById(R.id.txtTel);
        transmite = (Button) findViewById(R.id.btnSend);
        rezultat = (TextView) findViewById(R.id.rez);

        transmite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nume.getText().toString().isEmpty()   || prenume.getText().toString().isEmpty() || data_n.getText().toString().isEmpty() || email.getText().toString().isEmpty() || tel.getText().toString().isEmpty() )
                    rezultat.setText("Complectează toate câmpurile!!!");
                else{
                    inf = "Nume    : " + nume.getText().toString() + "\n" +
                          "Prennume: " + prenume.getText().toString() + "\n" +
                          "Data naasterii: " + data_n.getText().toString() + "\n" +
                          "Adresa electronica: " + email.getText().toString() + "\n" +
                          "Telefon de contact: " + tel.getText().toString();
                    rezultat.setText(inf);
                }
            }
        });
    }
}