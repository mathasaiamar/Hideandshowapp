package com.example.matha.hideandshowapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mimageEditText;
    private Button mhideButton;
    private Button mshowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mimageEditText= (EditText) findViewById(R.id.image);
        mhideButton= (Button) findViewById(R.id.hideButton);
        mshowButton= (Button) findViewById(R.id.showButton);
        mhideButton.setOnClickListener(this);
        mshowButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        int id = v.getId();
        switch(id){
            case R.id.hideButton:
                mimageEditText.setText("");
                break;
            case R.id.showButton:
                


        }

    }
}
