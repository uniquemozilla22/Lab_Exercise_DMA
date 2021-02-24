package com.example.labexercise;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    private Button zeroButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_counts);
        zeroButton = findViewById(R.id.button_zero);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void zeroToast(View view) {
        mCount=0;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            zeroButton.setBackgroundColor(getResources().getColor(R.color.grey));

        }
        else{
            Toast toast = Toast.makeText(this,"Not valid" , Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            if(mCount%2==0)
            {
                //making the button go green on the even
                zeroButton.setBackgroundColor(getResources().getColor(R.color.teal_200));

            }
            else {
                //makding the button go red on the odd type
                zeroButton.setBackgroundColor(getResources().getColor(R.color.black));
            }

        }
    }
}