package com.example.minidatabase;

import android.text.Editable;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.HashSet;


public class MainActivity extends AppCompatActivity{

    EditText searchBar;
    public Button button;
    String test3;
    public DictWord dictionary = new DictWord();
    public HashSet<String> categories = new HashSet<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        button = (Button) findViewById(R.id.searchButton);
//        searchBar = (EditText) findViewById(R.id.searchBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSearch(View view) {
        EditText searchBarEditText =  (EditText) findViewById(R.id.searchBar);
        String name = searchBarEditText.getText().toString();
        TextView wordDisplay = (TextView) findViewById(R.id.wordDisplay);
        boolean value = false;
        for(int i = 0; i < dictionary.words.size(); i++){
            if(dictionary.words.get(i).name.equalsIgnoreCase(name)){
                value = true;
                Intent intent = new Intent(this, SearchAll.class);
                intent.putExtra("WORD_DISPLAY", name);
                intent.putExtra("DEFINITION_DISPLAY", dictionary.words.get(i).definition);
                intent.putExtra("CATEGORY_DISPLAY", dictionary.words.get(i).category);
                startActivity(intent);
            }
        }
        if(value == false){
            Toast.makeText(this, "Error: word is not in the Database", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClickSortBy(View view){
        Intent intentSortby = new Intent(this, CategorySearch.class);
//        for(int i = 0; i < dictionary.words.size(); ){
//            if(categories.contains(dictionary.words.get(i).category) == false){
//                categories.add(dictionary.words.get(i).category);
//            }
//        }
        startActivity(intentSortby);
    }
    public void onClickViewAll(View view){
        Intent intentViewAll = new Intent(this, ViewAll.class);

        int counter = 0;
        for(int i = 0; i < dictionary.words.size(); i++){
            intentViewAll.putExtra("VIEWALL_BUTTON" + counter + "", dictionary.words.get(i).name);
            counter++;
        }
        startActivity(intentViewAll);
    }
}