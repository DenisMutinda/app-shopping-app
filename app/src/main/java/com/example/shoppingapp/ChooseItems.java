package com.example.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseItems extends AppCompatActivity {

    // Unique tag for the intent reply
    public static final String EXTRA_REPLY = "com.example.shoppingapp.extra.REPLY";

    //  Variable for the item chosen
    private String userChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_items);
    }

    public void itemA(View view) {
        userChoice = "A";

        /*
            Create a new intent for the reply, add the item chosen to it
            as an extra, set the new intent result, and close the activity.
         */
        Intent itemChosen = new Intent();
        itemChosen.putExtra(EXTRA_REPLY, userChoice);
        setResult(RESULT_OK, itemChosen);
        finish();
    }

    public void itemB(View view) {
    }

    public void itemC(View view) {
    }

    public void itemD(View view) {
    }
}