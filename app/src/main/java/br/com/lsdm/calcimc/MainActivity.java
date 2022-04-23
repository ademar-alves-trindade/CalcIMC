package br.com.lsdm.calcimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resultado(View view) {
        Intent intencao = new Intent(MainActivity.this, ResultActivity.class);
        startActivity(intencao);
    }
}