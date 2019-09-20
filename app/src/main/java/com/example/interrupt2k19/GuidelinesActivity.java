package com.example.interrupt2k19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GuidelinesActivity extends AppCompatActivity {

    TextView Guidelines;
    ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidelines);

        Guidelines=findViewById(R.id.guide);
        b1 = (ImageButton)findViewById(R.id.tran);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.action.VIEW", Uri.parse("https://www.svce.ac.in/departments/transport/routes.php#nav"));
                startActivity(i);
            }
        });





    }
}
