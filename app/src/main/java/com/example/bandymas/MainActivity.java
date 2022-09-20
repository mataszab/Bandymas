package com.example.bandymas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = (TextView)findViewById(R.id.tvMain);
    }

    public void onBtnChangeTextClick(View view) {
        tvMain.setText("Changed text!");
    }

    public void onBtnChangeTextColorClick(View view) {
        Random rnd = new Random();
        int randGeneratedColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        tvMain.setTextColor(randGeneratedColor);
    }
    //Writing nonsense to revert
}