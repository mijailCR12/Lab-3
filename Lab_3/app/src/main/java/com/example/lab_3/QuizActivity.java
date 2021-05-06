package com.example.lab_3;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;


public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickDisplayCorrectToast(View view) {
        makeText(this, "Verdadero", LENGTH_LONG).show();

    }

    public void clickDisplayIncorrectToast(View view) {
        makeText(this, "False", LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("----------On Start-----------");
        TextView textView = findViewById(R.id.textView);
        textView.setText("----------On Start-----------");

    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("----------On Resume-----------");
        TextView textView = findViewById(R.id.textView);
        textView.setText("----------On Resume-----------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("----------On Pause-----------");
        TextView textView = findViewById(R.id.textView);
        textView.setText("----------On Pause-----------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("----------On Stop-----------");
        TextView textView = findViewById(R.id.textView);
        textView.setText("----------On Stop-----------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("----------On Destroy-----------");
        TextView textView = findViewById(R.id.textView);
        textView.setText("----------On Destroy-----------");
    }


}