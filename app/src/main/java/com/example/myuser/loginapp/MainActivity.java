package com.example.myuser.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView useName;
    private TextView usePass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        useName = (TextView) findViewById(R.id.editText1);
        usePass = (TextView) findViewById(R.id.editText2);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (useName.getText().toString().equals("Admin") && usePass.getText().toString().equals("admin"))  {
                    Toast.makeText(MainActivity.this, "Login  llll Successfull",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), Image_Viewer.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Faild",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
