package com.example.arifd.asynctask;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView name_list;
    private String[] users = {
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
            "name", "address", "age", "city", "state",
    };

    ProgressBar progresBar;
    AddArrayToListView arr_to_list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        add Progress Bar
        progresBar = findViewById(R.id.progressBar);
        progresBar.setVisibility(View.VISIBLE);

//        setup adapter for populate data to listview
        name_list = findViewById(R.id.list_item);
        name_list.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>()));

//        process adapter with Asynctask
        arr_to_list_view = new AddArrayToListView();
        arr_to_list_view.execute();
    }

    public class AddArrayToListView extends AsyncTask<Void, String, Void>{
        private ArrayAdapter<String> adapter;
        private int counter = 0;

//        handling loading with dialog
        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);

            @Override
            protected  void onPreExecute() {
                adapter = (ArrayAdapter<String>) name_list.getAdapter();

    //            this for init progress dialog
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressDialog.setTitle("On Progress ...");
                progressDialog.setCancelable(false);
                progressDialog.setProgress(0);

                //this will handle cacle asynctack when click cancle button
                progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE,
                        "Cancel Process", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        arr_to_list_view.cancel(true);
                        progresBar.setVisibility(View.INVISIBLE);
                        Toast.makeText(getApplicationContext(),"Proses Berhenti", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                progressDialog.show();
            }
            @Override
            protected Void doInBackground(Void... params) {
                for (String item : users) {
                    publishProgress(item);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (isCancelled()) {
                        arr_to_list_view.cancel(true);
                    }
                }
                return null;
            }

            @Override
            protected void onProgressUpdate(String... values) {
                adapter.add(values[0]);
                counter++;
                Integer current_status = (int) ((counter / (float) users.length) * 1000);
                progresBar.setProgress(current_status);
                //set progress only working for horizontal loading
                progressDialog.setProgress(current_status);
                //setmessage will not working when using horizontal loading
                progressDialog.setMessage(String.valueOf(current_status) + "%");
            }

            @Override protected void onPostExecute(Void result) {
                //hide top progress bar
                progresBar.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"Upload Berhasil", Toast.LENGTH_SHORT).show();
                //remove progress dialog
                progressDialog.dismiss();
            }

    }
}
