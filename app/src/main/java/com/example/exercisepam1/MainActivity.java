package com.example.exercisepam1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //variabel button
    Button btnlogin;

    //variabel edittext
    EditText edemail, edpassword;

    TextView eddaftar;

    //menyimpan email dan pass
    String nama, password, daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);
        eddaftar = findViewById(R.id.eddaftar);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "admin@mail.com";
                String pass = "123456";

                //mengecek edittext kosong atau tidak
                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong",
                            Toast.LENGTH_LONG);
                    t.show();
                } else;

                if(nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login sukses",
                            Toast.LENGTH_LONG);

                    t.show();
                    Bundle b = new Bundle();

                    Intent iLogin = new Intent(getApplicationContext(), ActivitySukses.class);
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());
                    iLogin.putExtras(b);
                    startActivity(iLogin);
                }
                eddaftar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       Intent iDaftar = new Intent(MainActivity.this, DaftarActivity.class);
                       startActivity(iDaftar);
                    }
                });


            }
        });
    }
}