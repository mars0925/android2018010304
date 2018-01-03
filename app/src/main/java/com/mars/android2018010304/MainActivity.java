package com.mars.android2018010304;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView im ;
    Button but,but2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        im = (ImageView)findViewById(R.id.imageView);
        but = (Button)findViewById(R.id.button);
        but2 = (Button)findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                im.setImageResource(R.drawable.flower);//把圖片的位置設定近來
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.with(MainActivity.this).load("https://www.liontravel.com/promotion/season/global-flower/FileUpLoad/PictureAndWord/Model/22367/53634/ec4692b2-9154-4c36-873b-26fe0b3f0b22.jpg")
                        .into(im);

            }
        });
    }


}
