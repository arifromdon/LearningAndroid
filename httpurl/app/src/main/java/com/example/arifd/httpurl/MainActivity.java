package com.example.arifd.httpurl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    Button btn_request;
    TextView lbl_http_connection;
    HttpURLConnection connection = null;
    BufferedReader reader = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_request = findViewById(R.id.btn_request);
        lbl_http_connection = findViewById(R.id.lbl_http_connection);

        btn_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ApiConnect().execute("http://www.mocky.io/v2/59b753140f00008e0e7126b4");
            }
        });
    }

    public String get_data(String url_target){
        String line = "";

        try{
            URL url = new URL(url_target);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            InputStream stream = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));
            StringBuffer buffer = new StringBuffer();

            while((line = reader.readLine()) !=null){
                buffer.append(line);
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(connection != null) connection.disconnect();
            try{
                if(reader != null) reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
