package com.example.crystalball;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    private CrystalBall mCrystalBall = new CrystalBall();
    private TextView mAnswerLabel;
    private Button mGetAnswerButton;
    private ImageView mCrystalBallImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        // Assigning View variables
        mAnswerLabel = (TextView) findViewById(R.id.answerLabel);
        mGetAnswerButton = (Button) findViewById(R.id.getAnswerButton);
        mCrystalBallImage = (ImageView) findViewById(R.id.imageView);

        mGetAnswerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // Update the label with our dynamic answer

                mAnswerLabel.setText(mCrystalBall.getAnAnswer());
                animateCrystalBall();
                animateAnswer();
            }
        });
    }

    private void animateCrystalBall() {

        mCrystalBallImage.setImageResource(R.drawable.ball_animation);
        AnimationDrawable ballAnimation = (AnimationDrawable) mCrystalBallImage.getDrawable();
        if (ballAnimation.isRunning()){
            ballAnimation.stop();
        }
        ballAnimation.start();
    }

    private void animateAnswer() {
        AlphaAnimation fadeInAnimation = new AlphaAnimation(0, 1);
        fadeInAnimation.setDuration(1500);
        fadeInAnimation.setFillAfter(true);

        mAnswerLabel.setAnimation(fadeInAnimation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
