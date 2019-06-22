package com.application.calderon.SignsLenguage.Activities;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.application.calderon.SignsLanguage.R;
import com.application.calderon.SignsLanguage.Utils.Util;
import com.application.calderon.SignsLenguage.Utils.Util;

/**
 * Created by Calderon on 09/11/2017.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setBind();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    private void setBind(){
        button1 = (Button) findViewById(R.id.buttonOne);
        button2 = (Button) findViewById(R.id.buttonTwo);
        button3 = (Button) findViewById(R.id.buttonThree);
        button4 = (Button) findViewById(R.id.buttonFour);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.buttonOne:
                Snackbar.make(v,R.string.comming_soon,Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.buttonTwo:
                Util.goScreen(this,AbcActivity.class);
                break;
            case R.id.buttonThree:
                Util.goScreen(this,NumbersActivity.class);
                break;
            case R.id.buttonFour:
                Snackbar.make(v,R.string.comming_soon,Snackbar.LENGTH_SHORT).show();
                break;
        }
    }
}
