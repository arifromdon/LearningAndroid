package com.example.arifd.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nama_obj;
    EditText email_obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_frag_two = (Button) findViewById(R.id.btn_frag_two);
        nama_obj = (EditText) findViewById(R.id.namaObj);
        email_obj = (EditText) findViewById(R.id.emailObj);

        btn_frag_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == findViewById(R.id.btn_frag_two)) {
                    Fragment fragment = new FragmentTwo();
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Bundle bundle = new Bundle();
                    bundle.putString("Name", String.valueOf(nama_obj.getText()));
                    bundle.putString("Email", String.valueOf(email_obj.getText()));
                    fragment.setArguments(bundle);
                    ft.replace(R.id.fragmentPlace, fragment);
                    ft.commit();
                }
            }
        });
    }
}
