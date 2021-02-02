package com.example.floweranimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tx[]= new TextView[17];
    int s[]={R.id.tx1,R.id.tx2,R.id.tx3,R.id.tx4,R.id.tx5,R.id.tx6,R.id.tx7,R.id.tx8,R.id.tx9,R.id.tx10,R.id.tx11,R.id.tx12,R.id.tx13,R.id.tx14,R.id.tx15,R.id.tx16,R.id.tx17};
    TextView txx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<tx.length;i++)
        {
            tx[i]=findViewById(s[i]);
        }
        animation();
        }

    void animation(){
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm1);
        set.setTarget(tx[0]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm2);
        set.setTarget(tx[1]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm3);
        set.setTarget(tx[2]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm4);
        set.setTarget(tx[3]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm5);
        set.setTarget(tx[4]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm6);
        set.setTarget(tx[5]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm7);
        set.setTarget(tx[6]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm8);
        set.setTarget(tx[7]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm9);
        set.setTarget(tx[8]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm10);
        set.setTarget(tx[9]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm11);
        set.setTarget(tx[10]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm12);
        set.setTarget(tx[11]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm13);
        set.setTarget(tx[12]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm14);
        set.setTarget(tx[13]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm15);
        set.setTarget(tx[14]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm16);
        set.setTarget(tx[15]);
        set.setDuration(2000);
        set.start();

        set = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anm17);
        set.setTarget(tx[16]);
        set.setDuration(2000);
        set.start();
    }
}
