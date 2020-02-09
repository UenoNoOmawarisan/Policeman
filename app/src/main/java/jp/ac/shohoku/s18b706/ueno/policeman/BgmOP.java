package jp.ac.shohoku.s18b706.ueno.policeman;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

public class BgmOP extends Activity {
    static protected MediaPlayer mp;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        //MediaPlayerインスタンスの生成
        if (mp == null) {
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kawaiibgm);
            mp = MediaPlayer.create(this, uri);
            mp.setLooping(true);
        }
    }

    protected void KawaiiSTART() {
        if (!mp.isPlaying()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    mp.start();
                }
            },1000);
        }
    }
    protected void KawaiiSTOP() {
        if (mp.isPlaying()) {
            mp.stop();
        }
        mp = null;
        //インスタンスのリセットをすることによって
        //連続２回目以降もBGMを鳴らすことが可能となる。
    }

}

