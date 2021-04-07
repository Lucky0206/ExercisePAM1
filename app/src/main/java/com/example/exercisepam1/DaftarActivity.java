package com.example.exercisepam1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class DaftarActivity extends AppCompatActivity {
    //variabel edittext
    EditText edtnama, edtalamat, edtemail, edtpassword, edtrepass;

    //variabel button
    Button btnbatal, btndaftar;

    //variabel radiobutton
    RadioButton radiolaki, radioperem, radioislam, radiohindu, radiopenganut, radiokatolik, radiobudha,
    radiokristen, radiokonghucu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtnama = findViewById(R.id.namaed);
        edtalamat = findViewById(R.id.alamated);
        edtemail = findViewById(R.id.emailed);
        edtpassword = findViewById(R.id.passed);
        edtrepass = findViewById(R.id.repassed);
        btnbatal = findViewById(R.id.bataled);
        btndaftar = findViewById(R.id.ndaftared);
        radiolaki = findViewById(R.id.lakied);
        radioperem = findViewById(R.id.peremed);
        radioislam = findViewById(R.id.islamed);
        radiohindu = findViewById(R.id.hindued);
        radiopenganut = findViewById(R.id.nganuted);
        radiokatolik = findViewById(R.id.katoliked);
        radiobudha = findViewById(R.id.budhaed);
        radiokristen = findViewById(R.id.kristened);
        radiokonghucu = findViewById(R.id.konghucued);

    }
}
