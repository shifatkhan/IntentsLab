package com.shifatkhan.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.resultTxtView);
    }

    /**
     * Opens activity2
     * @param view
     */
    public void openActivity2(View view) {
        Intent activity2Intent = new Intent(this, Activity2.class);
        startActivityForResult(activity2Intent, 2);
    }

    /**
     * Opens activity3
     * @param view
     */
    public void openActivity3(View view) {
        Intent activity3Intent = new Intent(this, Activity3.class);
        startActivityForResult(activity3Intent, 3);
    }

    /**
     * Get results from started activities
     * Also, getIntent().getExtras().getString("a2Return"); Doesn't seem to work
     * @param requestCode
     * @param resultCode
     * @param data
     */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2) {
            if(resultCode == RESULT_OK){
                String a2Return = data.getStringExtra("a2Return");
                result.setText(a2Return);
            }
        }
        else if (requestCode == 3) {
            if(resultCode == RESULT_OK){
                String a3Return = data.getStringExtra("a3Return");
                result.setText(a3Return);
            }
        }
    }
}
