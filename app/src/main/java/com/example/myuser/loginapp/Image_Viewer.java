package com.example.myuser.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by myuser on 5/17/2016.
 */
public class Image_Viewer extends Activity implements View.OnClickListener{
    private ImageView imageView;
    private Button nextButton, preButton;
    private int currentImage = 0;
    private int position = 0, totalImage;
    private int index = 0;

    private ArrayList<Integer> imaggePics;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview_layout);
        imageView = (ImageView) findViewById(R.id.imageview);
        imaggePics = new ArrayList<Integer>();
        imaggePics.add(R.drawable.images1);
        imaggePics.add(R.drawable.images2);
        imaggePics.add(R.drawable.images3);
        imaggePics.add(R.drawable.images4);
        imaggePics.add(R.drawable.images5);
        imaggePics.add(R.drawable.images6);
        imaggePics.add(R.drawable.images7);
        imageView = (ImageView) findViewById(R.id.imageview);
        nextButton = (Button) findViewById(R.id.button1);
        nextButton.setOnClickListener(this);

        preButton = (Button) findViewById(R.id.button2);
        preButton.setOnClickListener(this);
        int index = 0;
        imageView.setImageResource(imaggePics.get(0));
 }
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button1) {
            if (index > 0) {
                --index;
            } else {
                index = imaggePics.size() - 1;
            }

        } else if (v.getId() == R.id.button2) {
            if (index <imaggePics.size()-1) {
                ++index;
            } else {
                index = 0;                }
        }
        imageView.setImageResource(imaggePics.get(index));
    }
}




