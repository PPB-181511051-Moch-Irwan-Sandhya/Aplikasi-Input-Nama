package com.example.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasi Variabel
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil Variabel berdasarkan id
        TextNama= findViewById(R.id.TxtNama);
        Hasil= findViewById(R.id.Lbl_Nama);
        //fungsi dari program ini adalah untuk memanggil variabel berdasarkan id
    }

    public void TampilNama(View v){
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }
}

