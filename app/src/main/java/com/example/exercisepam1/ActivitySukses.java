package com.example.exercisepam1;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySukses extends AppCompatActivity {

    TextView tvnama, tvnomor;

    Bundle bundle = getIntent().getExtras();

    String nama = bundle.getString("a");


}

