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

        /*ImageButton btn0 = (ImageButton)findViewById(R.id.btn_flw1);
        ImageButton btn1 = (ImageButton)findViewById(R.id.btn_flw2);
        ImageButton btn2 = (ImageButton)findViewById(R.id.btn_flw3);
        ImageButton btn3 = (ImageButton)findViewById(R.id.btn_flw4);
        ImageButton btn4 = (ImageButton)findViewById(R.id.btn_flw5);
        ImageButton btn5 = (ImageButton)findViewById(R.id.btn_flw6);
        ImageButton btn6 = (ImageButton)findViewById(R.id.btn_flw7);
        ImageButton btn7 = (ImageButton)findViewById(R.id.btn_flw8);
        ImageButton btn8 = (ImageButton)findViewById(R.id.btn_flw9);
        ImageButton btn9 = (ImageButton)findViewById(R.id.btn_flw10);
        ImageButton btn10 = (ImageButton)findViewById(R.id.btn_flw11);
        ImageButton btn11 = (ImageButton)findViewById(R.id.btn_flw12);
        ImageButton btn12 = (ImageButton)findViewById(R.id.btn_flw13);
        ImageButton btn13 = (ImageButton)findViewById(R.id.btn_flw14);
        ImageButton btn14 = (ImageButton)findViewById(R.id.btn_flw15);*/
    }

    public void click(final View view){
        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        view.startAnimation(animTranslate);
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
