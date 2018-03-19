package com.karla.labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView firstTextView, scdTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View v){
        String aux;
        firstTextView =findViewById(R.id.firstTextView);
        scdTextView = findViewById(R.id.scdTextView);

        aux = firstTextView.getText().toString();
        firstTextView.setText(scdTextView.getText());
        scdTextView.setText(aux);
    }
}
