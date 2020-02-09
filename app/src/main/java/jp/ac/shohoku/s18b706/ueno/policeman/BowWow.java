package jp.ac.shohoku.s18b706.ueno.policeman;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

public class BowWow extends BgmANGRY {
    private MediaPlayer mBgm; //BGM用の変数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bowwow_view);

        new Handler().postDelayed(new Runnable() { //画面切り替えの遅延
            @Override
            public void run() {
                Intent intent = new Intent(BowWow.this, Kawaii2.class);
                startActivity(intent);
                AngrySTART(); //怒ったときのBGMスタート
            }
        },2400);
    }
}
