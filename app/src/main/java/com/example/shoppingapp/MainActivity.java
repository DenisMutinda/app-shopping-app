package com.example.shoppingapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Unique tag required for the intent extra
    public static final int TEXT_REQUEST = 1;

    // Item to add to TextView1
    private String itemReply;

    // TextView initialisations
    private TextView item1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1 = findViewById(R.id.item1);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, ChooseItems.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST){
            // Test to make sure the intent reply result was good
            if (resultCode == RESULT_OK){
                itemReply = data.getStringExtra(ChooseItems.EXTRA_REPLY);
                item1.setText(itemReply);
            }
        }
    }
}