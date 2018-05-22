package com.example.arifd.fragment;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText time;
    private TextView finalResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = findViewById(R.id.inTime);
        button = findViewById(R.id.buttonRun);
        finalResult = findViewById(R.id.textResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncTaskRunner runner = new AsyncTaskRunner();
                String sleepTime = time.getText().toString();
                runner.execute(sleepTime);
            }
        });

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
    private class AsyncTaskRunner extends AsyncTask<String, String, String> {
        private String resp;
        ProgressDialog progressDialog;

        @Override
        protected String doInBackground(String...params){
            publishProgress("Sleeping...");
            try {
                int time = Integer.parseInt(params[0])*1000;
                Thread.sleep(time);
                resp = "Sleep for "+params[0]+" seconds";
            }catch (InterruptedException e){
                e.printStackTrace();
                resp = e.getMessage();
            }catch (Exception e){
                e.printStackTrace();
                resp = e.getMessage();
            }
            return resp;
        }

        @Override
        protected void onPostExecute(String result){
            progressDialog.dismiss();
            finalResult.setText(result);
        }

        @Override
        protected void onPreExecute(){
            progressDialog = ProgressDialog.show(MainActivity.this, "ProgressDialog",
                    "Wait for "+time.getText().toString()+" seconds");
        }

        @Override
        protected void onProgressUpdate(String... text){
            finalResult.setText(text[0]);
        }
    }
}
