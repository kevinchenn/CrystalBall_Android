package com.example.crystalball;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;
import android.R.*;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare our View variables
        final TextView answerLabel = (TextView) findViewById(R.id.answerLabel);
        Button getAnswerButton = (Button) findViewById(R.id.getAnswerButton);

        getAnswerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // The button was clicked, so update the answer label with an answer
                String answer = "";

                // Randomly select one of three answers: Yes, No, or Maybe
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(3);
                answer = Integer.toString(randomNumber);
                // Update the label with our dynamic answer

                answerLabel.setText(answer);
            }
        });
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
