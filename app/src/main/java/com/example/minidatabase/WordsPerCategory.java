package com.example.minidatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WordsPerCategory extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words_per_category);

        Intent intent = getIntent();
        CategorySearch cts = new CategorySearch();

        String titleDisplay = intent.getStringExtra("TITLE_SETTER");
        TextView categoryNameTV = (TextView) findViewById(R.id.categoryNameTV);
        categoryNameTV.setText(titleDisplay);

        String word0Display = intent.getStringExtra("WORD_SETTER0");
        Button word0Btn = (Button) findViewById(R.id.word0Btn);
        word0Btn.setText(word0Display);

        String word1Display = intent.getStringExtra("WORD_SETTER1");
        Button word1Btn = (Button) findViewById(R.id.word1Btn);
        word1Btn.setText(word1Display);

        String word2Display = intent.getStringExtra("WORD_SETTER2");
        Button word2Btn = (Button) findViewById(R.id.word2Btn);
        word2Btn.setText(word2Display);

        String word3Display = intent.getStringExtra("WORD_SETTER3");
        Button word3Btn = (Button) findViewById(R.id.word3Btn);
        word3Btn.setText(word3Display);

        String word4Display = intent.getStringExtra("WORD_SETTER4");
        Button word4Btn = (Button) findViewById(R.id.word4Btn);
        word4Btn.setText(word4Display);

    }
    public void onClickBtn0(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, SearchAll.class);
        Button word0Btn = (Button) findViewById(R.id.word0Btn);
        for(int i = 0; i < dictionary.words.size(); i++){
            if(word0Btn.getText().equals(dictionary.words.get(i).name)){
                intent.putExtra("WORD_DISPLAY", dictionary.words.get(i).name);
                intent.putExtra("DEFINITION_DISPLAY", dictionary.words.get(i).definition);
                intent.putExtra("CATEGORY_DISPLAY", dictionary.words.get(i).category);
                startActivity(intent);
            }
        }
    }public void onClickBtn1(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, SearchAll.class);
        Button word1Btn = (Button) findViewById(R.id.word1Btn);
        for(int i = 0; i < dictionary.words.size(); i++){
            if(word1Btn.getText().equals(dictionary.words.get(i).name)){
                intent.putExtra("WORD_DISPLAY", dictionary.words.get(i).name);
                intent.putExtra("DEFINITION_DISPLAY", dictionary.words.get(i).definition);
                intent.putExtra("CATEGORY_DISPLAY", dictionary.words.get(i).category);
                startActivity(intent);
            }
        }
    }public void onClickBtn2(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, SearchAll.class);
        Button word2Btn = (Button) findViewById(R.id.word2Btn);
        for(int i = 0; i < dictionary.words.size(); i++){
            if(word2Btn.getText().equals(dictionary.words.get(i).name)){
                intent.putExtra("WORD_DISPLAY", dictionary.words.get(i).name);
                intent.putExtra("DEFINITION_DISPLAY", dictionary.words.get(i).definition);
                intent.putExtra("CATEGORY_DISPLAY", dictionary.words.get(i).category);
                startActivity(intent);
            }
        }
    }public void onClickBtn3(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, SearchAll.class);
        Button word3Btn = (Button) findViewById(R.id.word3Btn);
        for(int i = 0; i < dictionary.words.size(); i++){
            if(word3Btn.getText().equals(dictionary.words.get(i).name)){
                intent.putExtra("WORD_DISPLAY", dictionary.words.get(i).name);
                intent.putExtra("DEFINITION_DISPLAY", dictionary.words.get(i).definition);
                intent.putExtra("CATEGORY_DISPLAY", dictionary.words.get(i).category);
                startActivity(intent);
            }
        }
    }public void onClickBtn4(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, SearchAll.class);
        Button word4Btn = (Button) findViewById(R.id.word4Btn);
        for(int i = 0; i < dictionary.words.size(); i++){
            if(word4Btn.getText().equals(dictionary.words.get(i).name)){
                intent.putExtra("WORD_DISPLAY", dictionary.words.get(i).name);
                intent.putExtra("DEFINITION_DISPLAY", dictionary.words.get(i).definition);
                intent.putExtra("CATEGORY_DISPLAY", dictionary.words.get(i).category);
                startActivity(intent);
            }
        }
    }
}