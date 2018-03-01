package com.realxiz.avengers;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private int mCounter = 0;
    private Button nextButton;
    private Button backButton;
    private ImageView imageView;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            tv1 = findViewById (R.id.tv1);
        nextButton = findViewById(R.id.btnext);

        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCounter++;
                // BEGIN_INCLUDE(settext)

                if (mCounter==1){
                    tv1.setText(R.string.cp);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.cap);
                }
                else if (mCounter==2) {
                    tv1.setText(R.string.iron);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.ironman);
                }
                else if (mCounter==3) {
                    tv1.setText(R.string.bw);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.bw);
                }else if (mCounter==4) {
                    tv1.setText(R.string.dt);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.dt);
                }else if (mCounter==5) {
                    tv1.setText(R.string.sl);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.sl);
                }else if (mCounter==6) {

                    tv1.setText(R.string.sp);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.sp);
                }else if (mCounter==7) {
                    tv1.setText(R.string.th);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.th);
                }else if (mCounter==8) {
                    tv1.setText(R.string.tn);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.tn);
                }else if (mCounter==9) {
                    tv1.setText(R.string.vs);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.vs);
                }else if (mCounter==10) {
                    tv1.setText(R.string.bp);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.bp);
                }

                else if(mCounter>10){
                    mCounter=10;
                }
            }
        });


        backButton = findViewById(R.id.btback);

       backButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mCounter--;
                // BEGIN_INCLUDE(settext)

                if (mCounter==1){
                    tv1.setText(R.string.cp);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.cap);
                }
                else if (mCounter==2) {
                    tv1.setText(R.string.iron);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.ironman);
                }
                else if (mCounter==3) {
                    tv1.setText(R.string.bw);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.bw);
                }else if (mCounter==4) {
                    tv1.setText(R.string.dt);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.dt);
                }else if (mCounter==5) {
                    tv1.setText(R.string.sl);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.sl);
                }else if (mCounter==6) {

                    tv1.setText(R.string.sp);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.sp);
                }else if (mCounter==7) {
                    tv1.setText(R.string.th);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.th);
                }else if (mCounter==8) {
                    tv1.setText(R.string.tn);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.tn);
                }else if (mCounter==9) {
                    tv1.setText(R.string.vs);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.vs);
                }else if (mCounter==10) {
                    tv1.setText(R.string.bp);
                    imageView = (ImageView)findViewById(R.id.image);
                    imageView.setImageResource(R.drawable.bp);
                }

                else if(mCounter<1){
                    mCounter=1;
                }

            }
        });


    }

}