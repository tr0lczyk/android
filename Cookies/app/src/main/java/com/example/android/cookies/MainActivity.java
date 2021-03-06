package com.example.android.cookies;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        changeText("I'm so full");
        changePicture();



    }

    public void changePicture(){
        ImageView newPicture = (ImageView) findViewById(R.id.android_cookie_image_view);
        newPicture.setImageResource(R.drawable.after_cookie);
    }

    public void changeText(String newWords){
        TextView newText = (TextView) findViewById(R.id.status_text_view);
        newText.setText(String.valueOf(newWords));
    }
}
