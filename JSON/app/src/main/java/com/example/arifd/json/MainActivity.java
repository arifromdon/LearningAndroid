package com.example.arifd.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_name = findViewById(R.id.text_name);
        TextView tv_city = findViewById(R.id.text_city);
        TextView tv_province = findViewById(R.id.text_province);


        JSONObject student_json = new JSONObject();
        JSONObject address_json = new JSONObject();


        try{
            student_json.put("name", "JOKO");
            address_json.put("city", "Bandung");
            address_json.put("province", "West Java" );
            student_json.put("address", address_json);

            tv_name.setText("Nama : " +student_json.getString("name"));
            JSONObject jo_address = (JSONObject)student_json.get("address");
            tv_city.setText("City : "+jo_address.get("city"));
            tv_province.setText("Province : "+jo_address.get("province"));
        }catch (Exception e){
            Log.i("info", String.valueOf(e));
        }
    }
}
