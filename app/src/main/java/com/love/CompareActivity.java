package com.love;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CompareActivity extends AppCompatActivity {

    String FALSE = "Вампи, неужели ты не помнишь?";
    String TRUE = "Я в тебе не сомневался, милая!";
    String HELP = "Тебе нужно нажать на то фото, которое было сделано раньше. После ответа нажми на экран для продолжения.";
    boolean bmg1 = false, bmg2=false;
    int i=0;
    int tag1=1;
    int tag2=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare);

        TextView txt = (TextView)findViewById(R.id.textView2);
        Typeface face;
        face = Typeface.createFromAsset(getAssets(), "Deftone.ttf");
        txt.setTypeface(face);

        ImageButton img1 = (ImageButton)findViewById(R.id.imagebutton1);
        ImageButton img2 = (ImageButton)findViewById(R.id.imagebutton2);
        ImageView img_final = (ImageView)findViewById(R.id.img_final);
        img_final.setVisibility(View.INVISIBLE);
        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setVisibility(View.INVISIBLE);
        img1.setImageResource(R.drawable.a);
        img2.setImageResource(R.drawable.b);
        img1.setTag(tag1);
        img2.setTag(tag2);

    }

    public void compare(View view){

        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        ImageButton img1 = (ImageButton)findViewById(R.id.imagebutton1);
        ImageButton img2 = (ImageButton)findViewById(R.id.imagebutton2);
        TextView txt = (TextView)findViewById(R.id.textView2);
        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setVisibility(View.INVISIBLE);

        bmg1 = img1.isPressed();
        bmg2 = img2.isPressed();
        /*КАКАЯ СДЕЛАНА РАНЬШЕ
        * TAG меньше - сделана раньше.*/
        if (bmg1){
            if((int)img1.getTag()<(int)img2.getTag())
            {
                txt.setText(TRUE);
                btn_next.setVisibility(View.VISIBLE);
                i+=1;
            } else {
                txt.setText(FALSE);
                btn_next.setVisibility(View.VISIBLE);
                i+=1;
            }
        }
        else{
            if((int)img1.getTag()>(int)img2.getTag())
            {
                txt.setText(TRUE);
                btn_next.setVisibility(View.VISIBLE);
                i+=1;
            } else {
                txt.setText(FALSE);
                btn_next.setVisibility(View.VISIBLE);
                i+=1;
            }
        }
    }

    public void changeImage(View view){
        final int[] img = {R.drawable.c, R.drawable.d,
            R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h,
            R.drawable.j, R.drawable.k, R.drawable.l, R.drawable.m,
            R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q,
            R.drawable.r, R.drawable.s, R.drawable.t, R.drawable.u,
        };
        final TextView txt = (TextView)findViewById(R.id.textView2);
        final ImageButton img1 = (ImageButton)findViewById(R.id.imagebutton1);
        final ImageButton img2 = (ImageButton)findViewById(R.id.imagebutton2);
        ImageView polaroid1 = (ImageView)findViewById(R.id.img_polaroid1);
        ImageView polaroid2 = (ImageView)findViewById(R.id.img_polaroid);
        final Button btn_next = (Button)findViewById(R.id.btn_next);
        final Animation animTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);

        img1.startAnimation(animTranslate);
        polaroid1.startAnimation(animTranslate);
        polaroid2.startAnimation(animTranslate);
        img2.startAnimation(animTranslate);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                txt.setText("");
                btn_next.setVisibility(View.INVISIBLE);
                switch (i){
                    case 1:
                        img1.setImageResource(img[0]);
                        img2.setImageResource(img[1]);
                        img1.setTag(tag1=1);
                        img2.setTag(tag2=2);
                        break;
                    case 2:
                        img1.setImageResource(img[2]);
                        img2.setImageResource(img[3]);
                        img1.setTag(tag1=2);
                        img2.setTag(tag2=1);
                        break;
                    case 3:
                        img1.setImageResource(img[4]);
                        img2.setImageResource(img[5]);
                        img1.setTag(tag1=1);
                        img2.setTag(tag2=2);
                        break;
                    case 4:
                        img1.setImageResource(img[6]);
                        img2.setImageResource(img[7]);
                        img1.setTag(tag1=1);
                        img2.setTag(tag2=2);
                        break;
                    case 5:
                        img1.setImageResource(img[8]);
                        img2.setImageResource(img[9]);
                        img1.setTag(tag1=2);
                        img2.setTag(tag2=1);
                        break;
                    case 6:
                        img1.setImageResource(img[10]);
                        img2.setImageResource(img[11]);
                        img1.setTag(tag1=1);
                        img2.setTag(tag2=2);
                        break;
                    case 7:
                        img1.setImageResource(img[13]);
                        img2.setImageResource(img[12]);
                        img1.setTag(tag1=2);
                        img2.setTag(tag2=1);
                        break;
                    case 8:
                        img1.setImageResource(img[15]);
                        img2.setImageResource(img[14]);
                        img1.setTag(tag1=2);
                        img2.setTag(tag2=1);
                        break;
                    case 9:
                        img1.setImageResource(img[16]);
                        img2.setImageResource(img[17]);
                        img1.setTag(tag1=1);
                        img2.setTag(tag2=2);
                        break;
                    case 10:
                        ImageView img_final = (ImageView)findViewById(R.id.img_final);
                        ImageView img_head = (ImageView)findViewById(R.id.img_head);
                        Button btn_help = (Button)findViewById(R.id.btn_help);
                        img_head.setVisibility(View.INVISIBLE);
                        btn_help.setVisibility(View.INVISIBLE);
                        img_final.setVisibility(View.VISIBLE);

                        break;
                }
            }
        }, 1000);
        }
        public void help(View view){
            final AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
            dlgAlert.setMessage(HELP);
            dlgAlert.setTitle("Подсказка");
            dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();
        }
    }
