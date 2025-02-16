package com.example.co9vert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "The weight has been converted", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                double kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                textView.setText("The corresponding pound value is " + pound);
//            }
//        });
    }

    public void calculate(View view) {
        String s = editText.getText().toString();
        double kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textView.setText("The corresponding pound value is " + pound);
        Toast.makeText(this, "Thanks for using Co9vert", Toast.LENGTH_SHORT).show();
    }
}