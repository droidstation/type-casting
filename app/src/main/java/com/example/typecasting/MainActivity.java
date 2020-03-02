package com.example.typecasting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    TextView showData;
    Button  btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    userInput = findViewById(R.id.edtText);
    showData = findViewById(R.id.tvShow);
    btnShow = findViewById(R.id.btnShowText);

    btnShow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String data = userInput.getText().toString();

            showData.setText(data);
        }
    });

    }
}
