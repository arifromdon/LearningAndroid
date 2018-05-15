package com.example.dopcountry.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;
    int curr;
    int[] images = {R.drawable.bart,R.drawable.homer};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick();
    }

        public void btnClick(){
            img = (ImageView)findViewById(R.id.imgView);
            btn = (Button)findViewById(R.id.butNext);

            btn.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    curr++;
                    curr = curr % images.length;
                    img.setImageResource(images[curr]);
                }
            });
        }
}
