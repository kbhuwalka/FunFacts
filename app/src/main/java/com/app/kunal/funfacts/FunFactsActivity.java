package com.app.kunal.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fun_facts_layout);

        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        final TextView factTextView = (TextView) findViewById(R.id.factText);
        final Button showFactButton= (Button) findViewById(R.id.nextFactButton);

        Toast.makeText(this,"Congratulations on your first basic app Kunal!",Toast.LENGTH_LONG).show();
        Log.d(TAG, "Yay!, My first Log");


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Get a fact
                String fact=mFactBook.getFact();
                //Pick a Random Color
                int color = mColorWheel.getColor();

                //Update Facts, Background & Button Color
                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

    }

    private FactBook mFactBook=new FactBook();
    private ColorWheel mColorWheel= new ColorWheel();

    public static final String TAG=FunFactsActivity.class.getSimpleName()+" class";

}
