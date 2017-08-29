package com.example.gustut.iak_movie_progect;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Input_Name_Activity extends AppCompatActivity {
    @BindView(R.id.et_nama) EditText et_nama;
    @BindView(R.id.image_tambah) ImageView image_tambah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input__name_);
        ButterKnife.bind(this);

        //share data nama ke activity lain
        SharedPreferences pref = getApplicationContext().getSharedPreferences("Option", MODE_PRIVATE);
        final SharedPreferences.Editor meditor = pref.edit();


        image_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_nama.length() == 0) {
                    Toast.makeText(getApplication(), "Nama Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                } else {
                    String str = et_nama.getText().toString();
                    Intent mIntent = new Intent(Input_Name_Activity.this, Home_Activity.class);
                    mIntent.putExtra("Nama", str);
                    startActivity(mIntent);
                }
            }
        });

    }
}
