package com.example.dopcountry.scrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameField;
    EditText emailField;
    EditText feedField;
    Spinner spinnerField;
    CheckBox checkField;
    Button buttonField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (EditText)findViewById(R.id.editName);
        emailField = (EditText)findViewById(R.id.editEmail);
        feedField = (EditText)findViewById(R.id.feedbackBody);
        spinnerField = (Spinner)findViewById(R.id.editSpinner);
        checkField = (CheckBox)findViewById(R.id.feedbackRespon);
        buttonField = (Button)findViewById(R.id.feedbackButton);
    }

    public void sendFeedBack(View button){
        String name = nameField.getText().toString();
        String email = emailField.getText().toString();
        String feed = feedField.getText().toString();
        String spin = spinnerField.getSelectedItem().toString();
        Boolean check = checkField.isChecked();

        if(name.length() == 0 || email.length() == 0 ||feed.length() == 0 || spin.length() == 0){
            Toast.makeText(MainActivity.this, "Semua Form harus Di Isi", Toast.LENGTH_LONG).show();
        }


    }
}
