package com.example.minidatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategorySearch extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_search);
    }
    public void onClickFoodButton(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
       // intent.putExtra("CHANGE_BUTTON_1", );
        Button button0 = (Button) findViewById(R.id.categorySearchBtn0);
        String button0Text = button0.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button0Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
    }
    public void onClickBtn1(View view){
        // intent.putExtra("CHANGE_BUTTON_1", );
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
        Button button1 = (Button) findViewById(R.id.categorySearchBtn1);
        String button0Text = button1.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button0Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
   }
    public void onClickBtn2(View view){
        // intent.putExtra("CHANGE_BUTTON_1", );
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
        Button button2 = (Button) findViewById(R.id.categorySearchBtn2);
        String button2Text = button2.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button2Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
    }
    public void onClickBtn3(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
        Button button3 = (Button) findViewById(R.id.categorySearchBtn3);
        String button3Text = button3.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button3Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
    }
    public void onClickBtn4(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
        Button button4 = (Button) findViewById(R.id.categorySearchBtn4);
        String button4Text = button4.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button4Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
    }
    public void onClickBtn5(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
        Button button5 = (Button) findViewById(R.id.categorySearchBtn5);
        String button5Text = button5.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button5Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
    }
    public void onClickBtn6(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
        Button button6 = (Button) findViewById(R.id.categorySearchBtn6);
        String button6Text = button6.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button6Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
    }
    public void onClickBtn7(View view){
        DictWord dictionary = new DictWord();
        Intent intent = new Intent(this, WordsPerCategory.class);
        Button button7 = (Button) findViewById(R.id.categorySearchBtn7);
        String button7Text = button7.getText().toString();
        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(button7Text.equalsIgnoreCase(dictionary.words.get(i).category)){
                intent.putExtra("WORD_SETTER" + counter + "", dictionary.words.get(i).name);
                intent.putExtra("TITLE_SETTER", dictionary.words.get(i).category);
                counter++;
            }
        }
        startActivity(intent);
    }
}