package com.example.mobileassignmentone;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;


public class HomePage extends AppCompatActivity {
    Letter[] ltr_array = new Letter[26];
    Gson gson = new Gson();
    SharedPreferences prefs ;
    SharedPreferences.Editor myEdit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        prefs = getSharedPreferences("MyPref", MODE_PRIVATE);
        myEdit = prefs.edit();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        checkprefs();
        RecyclerView recycler = findViewById(R.id.pizza_recycler);
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        LettersAdapter adapter = new LettersAdapter(ltr_array);
        recycler.setAdapter(adapter);
    }
    public void close(){
        finish();
        System.exit(0);
    }
    private void checkprefs() {
        if (prefs.contains("Letters")) {
            String json = prefs.getString("Letters", "");
            ltr_array = gson.fromJson(json, Letter[].class);
        } else {
            Letter ltr = new Letter();
            ltr_array = ltr.populate();
            String json = gson.toJson(ltr_array);
            myEdit.putString("Letters", json);
            myEdit.commit();
        }
    }

}

