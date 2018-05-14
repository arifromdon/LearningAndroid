package com.example.dopcountry.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edTextName;
    EditText edTextClass;
    EditText edTextComment;
    Button butSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edTextName = (EditText)findViewById(R.id.nameText);
        edTextClass = (EditText)findViewById(R.id.classText);
        edTextComment = (EditText)findViewById(R.id.comText);
        butSend = (Button)findViewById(R.id.buttonSend);
    }

    public void sendFeed(View button){
        String name = edTextName.getText().toString();
        String claTex = edTextClass.getText().toString();
        String commment = edTextComment.getText().toString();

        Toast.makeText(MainActivity.this,"Berhasil Terkirim", Toast.LENGTH_LONG).show();

    }
}
