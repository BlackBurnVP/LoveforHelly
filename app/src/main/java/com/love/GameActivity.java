package com.love;

import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class GameActivity extends AppCompatActivity {

    int i = 1;
    String LOVE = "Люблю";
    String NOT_LOVE = "Не люблю";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        TextView txt = (TextView)findViewById(R.id.txt_res);
        Typeface face;
        face = Typeface.createFromAsset(getAssets(), "Deftone.ttf");
        txt.setTypeface(face);
    }

    public void click(final View view){
        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        view.startAnimation(animTranslate);
        ImageButton button = (ImageButton)view;
        button.setEnabled(false);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                ImageButton button = (ImageButton)view;
                button.setVisibility(View.INVISIBLE);
            }
        },900);
        TextView txt = (TextView)findViewById(R.id.txt_res);
        i += 1;
        if ((i & 1) == 0){
            txt.setText(LOVE);
        }else{txt.setText(NOT_LOVE);}
    }
}
