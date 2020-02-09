package jp.ac.shohoku.s18b706.ueno.policeman;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class Kawaii2 extends BgmANGRY {
    private MediaPlayer mBgm; //BGM用の変数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kawaii2_view);

        //どのボタンを押しても死亡
        Button SK2button = (Button)findViewById(R.id.strokingbutton2);
        SK2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AngrySTOP(); //怒ったときのBGMストップ
                //インテントに、この画面と遷移する別の画面を指定する
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                //インテントで指定した別の画面に遷移する
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });

        Button BrushButton11 = (Button)findViewById(R.id.brushbutton11);
        BrushButton11.setAlpha(0.6f);
        BrushButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton12 = (Button)findViewById(R.id.brushbutton12);
        BrushButton12.setAlpha(0.6f);
        BrushButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton13 = (Button)findViewById(R.id.brushbutton13);
        BrushButton13.setAlpha(0.6f);
        BrushButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton14 = (Button)findViewById(R.id.brushbutton14);
        BrushButton14.setAlpha(0.6f);
        BrushButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton15 = (Button)findViewById(R.id.brushbutton15);
        BrushButton15.setAlpha(0.6f);
        BrushButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton16 = (Button)findViewById(R.id.brushbutton16);
        BrushButton16.setAlpha(0.5f);
        BrushButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton17 = (Button)findViewById(R.id.brushbutton17);
        BrushButton17.setAlpha(0.6f);
        BrushButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton18 = (Button)findViewById(R.id.brushbutton18);
        BrushButton18.setAlpha(0.6f);
        BrushButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
        Button BrushButton19 = (Button)findViewById(R.id.brushbutton19);
        BrushButton19.setAlpha(0.5f);
        BrushButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AngrySTOP(); //怒ったときのBGMストップ
                Intent intent = new Intent(Kawaii2.this, BadEnd.class);
                startActivity(intent);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ScreamBGM();
                    }
                },400);
            }
        });
    }

    private void ScreamBGM(){
        int bgmResID = this.getResources().getIdentifier("kbgm","raw",
                "jp.ac.shohoku.s18b706.ueno.dtic");
        mBgm = MediaPlayer.create(this, R.raw.scream);
        mBgm.seekTo(0);
        mBgm.start();
        //mBgm.setLooping(true); ←ループ再生しないのでいらない
    }
}
