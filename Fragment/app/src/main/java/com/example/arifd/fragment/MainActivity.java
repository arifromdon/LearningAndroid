package com.example.arifd.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
//            inisialisasi nilai fragmentManager untuk berinteraksi dengan activity saat ini
        FragmentTransaction transaction = fragmentManager.beginTransaction();
//            memulai transaksi dengan fragment fragmentManager
        FragmentOne fragmentOne = new FragmentOne();
//            membuat objek framgment
        transaction.add(R.id.frame_content, fragmentOne);
//            menambahkan fragment
        transaction.addToBackStack("fragmentFirst");
//            dapat menyimpan fragment di dalam state, ketika tombol back di click
        transaction.commit();
//            mengeksekusi fragment transaction


    }
}
