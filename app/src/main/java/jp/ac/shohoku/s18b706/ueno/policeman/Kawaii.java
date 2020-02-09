package jp.ac.shohoku.s18b706.ueno.policeman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kawaii extends BgmOP {
    private MediaPlayer mBgm; //BGM用の変数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kawaii_view);

        //なでるボタンを押したとき
        Button SKbutton = (Button)findViewById(R.id.strokingbutton);
        SKbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KawaiiSTOP(); //可愛いBGMストップ
                //インテントに、この画面と遷移する別の画面を指定する
                Intent intent = new Intent(Kawaii.this, BowWow.class);
                //インテントで指定した別の画面に遷移する
                startActivity(intent);
                BowWowBGM(); //吠えるときのBGM
            }
        });

        //ブラッシングボタンを押したとき 1-10
        Button BrushButton1 = (Button)findViewById(R.id.brushbutton1);
        BrushButton1.setAlpha(0.6f);
        BrushButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton2 = (Button)findViewById(R.id.brushbutton2);
        BrushButton2.setAlpha(0.6f);
        BrushButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton3 = (Button)findViewById(R.id.brushbutton3);
        BrushButton3.setAlpha(0.6f);
        BrushButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton4 = (Button)findViewById(R.id.brushbutton4);
        BrushButton4.setAlpha(0.6f);
        BrushButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton5 = (Button)findViewById(R.id.brushbutton5);
        BrushButton5.setAlpha(0.6f);
        BrushButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton6 = (Button)findViewById(R.id.brushbutton6);
        BrushButton6.setAlpha(0.5f);
        BrushButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton7 = (Button)findViewById(R.id.brushbutton7);
        BrushButton7.setAlpha(0.6f);
        BrushButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton8 = (Button)findViewById(R.id.brushbutton8);
        BrushButton8.setAlpha(0.6f);
        BrushButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
        Button BrushButton9 = (Button)findViewById(R.id.brushbutton9);
        BrushButton9.setAlpha(0.5f);
        BrushButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BrushBGM();
            }
        });
    }

    private void BrushBGM(){ //ブラッシングしたときのBGM
        int bgmResID = this.getResources().getIdentifier("kbgm","raw",
                "jp.ac.shohoku.s18b706.ueno.dtic");
        mBgm = MediaPlayer.create(this, R.raw.brushing);
        mBgm.seekTo(0);
        mBgm.start();
        //mBgm.setLooping(true); ループ再生はしない
    }

    private void BowWowBGM(){ //吠えるときのBGM
        int bgmResID = this.getResources().getIdentifier("kbgm","raw",
                "jp.ac.shohoku.s18b706.ueno.dtic");
        mBgm = MediaPlayer.create(this, R.raw.bowwowbgm);
        mBgm.seekTo(0);
        mBgm.start();
        //mBgm.setLooping(true); ループ再生はしない
    }
}
