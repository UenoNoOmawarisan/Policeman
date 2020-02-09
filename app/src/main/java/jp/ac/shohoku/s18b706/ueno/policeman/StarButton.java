package jp.ac.shohoku.s18b706.ueno.policeman;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

// プッシュするエフェクトのボタン
public class StarButton extends Button {
    public StarButton(Context context) {
        super(context);
    }
    public StarButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public void setPressed(boolean pressed) {
        if(pressed){
            this.setScaleY(0.92f);
            this.setScaleX(0.96f);
        }else{
            this.setScaleY(1.0f);
            this.setScaleX(1.0f);
        }
        super.setPressed(pressed);
    }
}


