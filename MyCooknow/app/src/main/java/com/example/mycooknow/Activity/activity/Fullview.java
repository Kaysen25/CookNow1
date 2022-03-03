package com.example.mycooknow.Activity.activity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mycooknow.Activity.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fullview extends AppCompatActivity {

    FloatingActionButton floatingActionButton;
    Intent intent;
      String title;
      String ejza;
      String targeeb;
      int image;
      int condition;




      TextView titleTxt,ejzaTitle,ejzaTxt,targeebTitle,targeebTxt;
      ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R .layout.activity_fullview);
        floatingActionButton = findViewById(R.id.floatingbutton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Fullview.this, googlemap.class));

            }
        });

        titleTxt=(TextView)findViewById(R.id.titleFullview);
        ejzaTitle=(TextView)findViewById(R.id.ejzaTitle);
        ejzaTxt=(TextView)findViewById(R.id.ejza);
        targeebTitle=(TextView)findViewById(R.id.targeebTitle);
        targeebTxt=(TextView)findViewById(R.id.targeeb);
        imageView=(ImageView)findViewById(R.id.thumbnailFullview);



        intent=getIntent();

        image=intent.getIntExtra("image", 00);
        condition=intent.getIntExtra("condition", 00);
        title=intent.getStringExtra("title");
        ejza=intent.getStringExtra("ejza");
        targeeb=intent.getStringExtra("targeeb");

        if (condition==1){

            ejzaTitle.setGravity(Gravity.LEFT);
            ejzaTxt.setGravity(Gravity.LEFT);
            targeebTitle.setGravity(Gravity.LEFT);
            targeebTxt.setGravity(Gravity.LEFT);

            ejzaTitle.setText("Ingredients");
            targeebTitle.setText("Procedure");

        }

       else if (condition==2){

            ejzaTitle.setGravity(Gravity.LEFT);
            ejzaTxt.setGravity(Gravity.LEFT);
            targeebTitle.setGravity(Gravity.LEFT);
            targeebTxt.setGravity(Gravity.LEFT);

            ejzaTitle.setText("Ingredients");
            targeebTitle.setText("Procedure");

        }
       imageView.setImageResource(image);

       titleTxt.setText(title);
       ejzaTxt.setText(ejza);
       targeebTxt.setText(targeeb);
    }
}