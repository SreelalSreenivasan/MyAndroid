package com.example.sreelal.shape;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Paint paint=new Paint();
        paint.setColor(Color.parseColor("#F569F3"));
        Bitmap bg=Bitmap.createBitmap(480,800,Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bg);
        canvas.drawRect(50,200,50,200,paint);
        RelativeLayout l1=(RelativeLayout)findViewById(R.id.shape);
        l1.setBackgroundDrawable(new BitmapDrawable(bg));
    }
}
