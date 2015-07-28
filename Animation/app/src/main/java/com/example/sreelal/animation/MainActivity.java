package com.example.sreelal.animation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        super.onOptionsItemSelected(item);
        switch (item.getItemId())
        {
            case R.id.zoomInOut:
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
                imageView.startAnimation(animation);
                return true;
            case R.id.rotate360:
                ImageView imageView1=(ImageView)findViewById(R.id.imageView);
                Animation animation1=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
                imageView1.startAnimation(animation1);
                return true;
            case R.id.fadeInOut:
                ImageView imageView2=(ImageView)findViewById(R.id.imageView);
                Animation animation2=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                imageView2.startAnimation(animation2);
                return true;
        }
        return false;
    }
}
