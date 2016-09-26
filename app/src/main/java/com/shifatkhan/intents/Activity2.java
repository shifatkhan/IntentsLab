package com.shifatkhan.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    /**
     * Return string "one..." to starter activity
     * @param view
     */
    public void returnOne(View view) {
        Intent intent = new Intent();
        intent.putExtra("a2Return","Activity 2: One, 1, uno, un/une");
        setResult(RESULT_OK, intent);
        finish();
    }

    /**
     * Return string "one..." to starter activity
     * @param view
     */
    public void returnTwo(View view) {
        Intent intent = new Intent();
        intent.putExtra("a2Return","Activity 2: Two, 2 , due, deux");
        setResult(RESULT_OK, intent);
        finish();
    }
}
