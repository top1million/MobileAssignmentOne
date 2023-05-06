package com.example.mobileassignmentone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        OkHttpClient client = new OkHttpClient();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btna = (Button) findViewById(R.id.btnA);
        Button btnb = (Button) findViewById(R.id.btnB);
        Button btnc = (Button) findViewById(R.id.btnC);
        Button btnd = (Button) findViewById(R.id.btnD);
        Button btne = (Button) findViewById(R.id.btnE);
        Button btnf = (Button) findViewById(R.id.btnF);
        Button btng = (Button) findViewById(R.id.btnG);
        Button btnh = (Button) findViewById(R.id.btnH);
        Button btni = (Button) findViewById(R.id.btnI);
        Button btnj = (Button) findViewById(R.id.btnJ);
        Button btnk = (Button) findViewById(R.id.btnK);
        Button btnl = (Button) findViewById(R.id.btnL);
        Button btnm = (Button) findViewById(R.id.btnM);
        Button btnn = (Button) findViewById(R.id.btnN);
        Button btno = (Button) findViewById(R.id.btnO);
        Button btnp = (Button) findViewById(R.id.btnP);
        Button btnq = (Button) findViewById(R.id.btnQ);
        Button btnr = (Button) findViewById(R.id.btnR);
        Button btns = (Button) findViewById(R.id.btnS);
        Button btnt = (Button) findViewById(R.id.btnT);
        Button btnu = (Button) findViewById(R.id.btnU);
        Button btnv = (Button) findViewById(R.id.btnV);
        Button btnw = (Button) findViewById(R.id.btnW);
        Button btnx = (Button) findViewById(R.id.btnX);
        Button btny = (Button) findViewById(R.id.btnY);
        Button btnz = (Button) findViewById(R.id.btnZ);
        ImageView img = (ImageView) findViewById(R.id.imgHangman);
        ImageView img1 = (ImageView) findViewById(R.id.imgHangman1);
        Button btnPlaySound = (Button) findViewById(R.id.btnPlaySound);
        btna.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.a);
                mp.start();
            });
            img.setImageResource(R.drawable.a);
        });
        btnb.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.b);
                mp.start();
            });
            img.setImageResource(R.drawable.b);
        });
        btnc.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.c);
                mp.start();
            });
            img.setImageResource(R.drawable.c);
        });
        btnd.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.d);
                mp.start();
            });
            img.setImageResource(R.drawable.d);
        });
        btne.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.e);
                mp.start();
            });
            img.setImageResource(R.drawable.e);
        });
        btnf.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.f);
                mp.start();
            });
            img.setImageResource(R.drawable.f);
        });
        btng.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.g);
                mp.start();
            });
            img.setImageResource(R.drawable.g);
        });
        btnh.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v1 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.h);
                mp.start();
            });
            img.setImageResource(R.drawable.h);
        });
        btni.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v12 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.i);
                mp.start();
            });
            img.setImageResource(R.drawable.i);
        });
        btnj.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v13 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.j);
                mp.start();
            });
            img.setImageResource(R.drawable.j);
        });
        btnk.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v14 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.k);
                mp.start();
            });
            img.setImageResource(R.drawable.k);
        });
        btnl.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v15 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.l);
                mp.start();
            });
            img.setImageResource(R.drawable.l);
        });
        btnm.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v16 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.m);
                mp.start();
            });
            img.setImageResource(R.drawable.m);
        });
        btnn.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v17 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.n);
                mp.start();
            });
            img.setImageResource(R.drawable.n);
        });
        btno.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v18 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.o);
                mp.start();
            });
            img.setImageResource(R.drawable.o);
        });
        btnp.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v19 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.p);
                mp.start();
            });
            img.setImageResource(R.drawable.p);
        });
        btnq.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v110 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.q);
                mp.start();
            });
            img.setImageResource(R.drawable.q);
        });
        btnr.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v111 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.r);
                mp.start();
            });
            img.setImageResource(R.drawable.r);
        });
        btns.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v112 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.s);
                mp.start();
            });
            img.setImageResource(R.drawable.s);
        });
        btnt.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v113 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.t);
                mp.start();
            });
            img.setImageResource(R.drawable.t);
        });
        btnu.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v114 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.u);
                mp.start();
            });
            img.setImageResource(R.drawable.u);
        });
        btnv.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v115 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.v);
                mp.start();
            });
            img.setImageResource(R.drawable.v);
        });
        btnw.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v116 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.w);
                mp.start();
            });
            img.setImageResource(R.drawable.w);
        });
        btnx.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v117 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.x);
                mp.start();
            });
            img.setImageResource(R.drawable.x);
        });
        btny.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v118 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.y);
                mp.start();
            });
            img.setImageResource(R.drawable.y);
        });
        btnz.setOnClickListener(v -> {
            img1.setVisibility(ImageView.GONE);
            img.setVisibility(ImageView.VISIBLE);
            btnPlaySound.setVisibility(Button.VISIBLE);
            btnPlaySound.setOnClickListener(v119 ->{
                MediaPlayer mp = MediaPlayer.create(this, R.raw.z);
                mp.start();
            });
            img.setImageResource(R.drawable.z);
        });


    }
}








