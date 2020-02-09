package jp.ac.shohoku.s18b706.ueno.policeman;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BadEnd extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badend_view);

        //リトライボタンを押したとき
        Button Bbutton = (Button)findViewById(R.id.Bbutton);
        Bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //インテントに、この画面と遷移する別の画面を指定する
                Intent intent = new Intent(BadEnd.this, OP.class);
                //インテントで指定した別の画面に遷移する
                startActivity(intent);
            }
        });
    }
}
