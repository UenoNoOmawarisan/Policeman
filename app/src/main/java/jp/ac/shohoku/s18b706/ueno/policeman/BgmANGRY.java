package jp.ac.shohoku.s18b706.ueno.policeman;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

public class BgmANGRY extends Activity {
    static protected MediaPlayer mp;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        //MediaPlayerインスタンスの生成
        if (mp == null) {
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.angrybgm);
            mp = MediaPlayer.create(this, uri);
            mp.setLooping(true);
        }
    }

    protected void AngrySTART() {
        if (!mp.isPlaying()) {
            mp.start();
        }
    }
    protected void AngrySTOP() {
        if (mp.isPlaying()) {
            mp.stop();
        }
        mp = null;
    }

}

