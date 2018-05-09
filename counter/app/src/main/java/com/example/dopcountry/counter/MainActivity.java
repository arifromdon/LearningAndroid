package com.example.dopcountry.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonCounter;
    TextView textCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCounter = (Button)findViewById(R.id.buttonC);
        textCounter = (TextView)findViewById(R.id.countText);

        buttonCounter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String countValue = textCounter.getText().toString();
                int cv = Integer.parseInt(countValue);
                cv++;
                textCounter.setText(String.valueOf(cv));
                String toats = Integer.toString(cv);
                Toast.makeText(getApplicationContext(),toats, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
