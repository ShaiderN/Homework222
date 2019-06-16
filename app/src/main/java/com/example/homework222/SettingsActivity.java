package com.example.homework222;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    private Button mBtnSaveSett;
    private Button mBtnEdiSett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initViews();
    }

    private void initViews() {
        mBtnEdiSett = findViewById(R.id.btnEdiSett);
        mBtnSaveSett = findViewById(R.id.btnSaveSett);

        mBtnEdiSett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this,
                        "Настройки изменены", Toast.LENGTH_LONG).show();
            }
        });

        mBtnSaveSett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingsActivity.this,
                        "Настройки сохранены", Toast.LENGTH_LONG).show();
            }
        });
    }
}