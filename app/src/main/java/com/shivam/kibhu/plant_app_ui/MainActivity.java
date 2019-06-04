package com.shivam.kibhu.plant_app_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img11,img22,img33,img44,img55,img66;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img11=findViewById(R.id.img1);
        img22=findViewById(R.id.img2);
        img33=findViewById(R.id.img3);
        img44=findViewById(R.id.img4);
        img55=findViewById(R.id.img5);
        img66=findViewById(R.id.img6);

        img11.setClipToOutline(true);
        img22.setClipToOutline(true);
        img33.setClipToOutline(true);
        img44.setClipToOutline(true);
        img55.setClipToOutline(true);
        img66.setClipToOutline(true);

    }
}
