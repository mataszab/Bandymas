package com.example.bandymas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView)findViewById(R.id.tvMain);
    }

    public void onBtnChangeTextClick(View view) {
        //TextView tvMain = (TextView)findViewById(R.id.tvMain);
        tvMain.setText("Hello");
    }
}