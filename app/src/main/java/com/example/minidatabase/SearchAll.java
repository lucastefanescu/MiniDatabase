package com.example.minidatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SearchAll extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_all);

        TextView categoryDisplayTextView = (TextView) findViewById(R.id.categoryDisplay);
        TextView definitionDisplayTextView = (TextView) findViewById(R.id.definitionDisplay);
        TextView wordDisplayTextView = (TextView) findViewById(R.id.wordDisplay);

        Intent intent = getIntent();

        String wordDisplay = intent.getStringExtra("WORD_DISPLAY");
        wordDisplayTextView.setText(wordDisplay);

        String definitionDisplay = intent.getStringExtra("DEFINITION_DISPLAY");
        definitionDisplayTextView.setText(definitionDisplay);

        String categoryDisplay = intent.getStringExtra("CATEGORY_DISPLAY");
        categoryDisplayTextView.setText(categoryDisplay);


//        String button0WordDisplay = intent.getStringExtra("BTN0_Name");
//        wordDisplayTextView.setText(button0WordDisplay);
//        Log.d("123", button0WordDisplay);
//
//        String button0DefinitionDisplay = intent.getStringExtra("BTN0_Definition");
//        definitionDisplayTextView.setText(button0DefinitionDisplay);
//
//        String button0CategoryDisplay = intent.getStringExtra("BTN0_Category");
//        categoryDisplayTextView.setText(button0CategoryDisplay);
//


//        String button1WordDisplay = intent.getStringExtra("BTN1_Name");
//        wordDisplayTextView.setText(button1WordDisplay);
//
//        String button1DefinitionDisplay = intent.getStringExtra("BTN1_Definition");
//        definitionDisplayTextView.setText(button1DefinitionDisplay);
//
//        String button1CategoryDisplay = intent.getStringExtra("BTN1_Category");
//        categoryDisplayTextView.setText(button1CategoryDisplay);


//        String button2WordDisplay = intent.getStringExtra("BTN2_Name");
//        wordDisplayTextView.setText(button2WordDisplay);
//
//        String button2DefinitionDisplay = intent.getStringExtra("BTN2_Definition");
//        definitionDisplayTextView.setText(button2DefinitionDisplay);
//
//        String button2CategoryDisplay = intent.getStringExtra("BTN2_Category");
//        categoryDisplayTextView.setText(button2CategoryDisplay);
//
//
//        String button3WordDisplay = intent.getStringExtra("BTN3_Name");
//        wordDisplayTextView.setText(button3WordDisplay);
//
//        String button3DefinitionDisplay = intent.getStringExtra("BTN3_Definition");
//        definitionDisplayTextView.setText(button3DefinitionDisplay);
//
//        String button3CategoryDisplay = intent.getStringExtra("BTN3_Category");
//        categoryDisplayTextView.setText(button3CategoryDisplay);
//
//
//        String button4WordDisplay = intent.getStringExtra("BTN4_Name");
//        wordDisplayTextView.setText(button4WordDisplay);
//
//        String button4DefinitionDisplay = intent.getStringExtra("BTN4_Definition");
//        definitionDisplayTextView.setText(button4DefinitionDisplay);
//
//        String button4CategoryDisplay = intent.getStringExtra("BTN4_Category");
//        categoryDisplayTextView.setText(button4CategoryDisplay);

    }
}