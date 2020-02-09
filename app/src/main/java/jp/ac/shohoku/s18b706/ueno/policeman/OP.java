package jp.ac.shohoku.s18b706.ueno.policeman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class OP extends BgmOP {
    private MediaPlayer mBgm; //BGM用の変数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.op_view);

        //★ボタンを押したときにイベントを取得できるようにする
        Button Sbutton = (Button)findViewById(R.id.starbutton); //op_view.xmlの★ボタン
        Sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starBGM(); //★の効果音
                new Handler().postDelayed(new Runnable() { //画面切り替えの遅延
                    @Override
                    public void run() {
                        //インテントに、この画面と遷移する別の画面を指定する
                        Intent intent = new Intent(OP.this, Kawaii.class);
                        //インテントで指定した別の画面に遷移する
                        startActivity(intent);
                        KawaiiSTART(); //可愛いBGMスタート
                    }
                },1500);
            }
        });
    }

    private void starBGM(){ //★効果音
        int bgmResID = this.getResources().getIdentifier("kbgm","raw",
                "jp.ac.shohoku.s18b706.ueno.dtic");
        mBgm = MediaPlayer.create(this, R.raw.starbgm);
        mBgm.seekTo(0);
        mBgm.start();
    }

}
