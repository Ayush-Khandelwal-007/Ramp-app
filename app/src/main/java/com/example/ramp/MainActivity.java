package com.example.ramp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.Count_Display);
    }

    public void showMessage(View view) {
        Toast toast = Toast.makeText(this, R.string.Button_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countDown(View view) {
        if(mCount>0){
            mCount--;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount));
        }
        else{
            Toast toast = Toast.makeText(this, R.string.Negative_Value_message,
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
