package com.example.quizpulse3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

public class SetsActivity extends AppCompatActivity {
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sets);
        Toolbar toolbar = findViewById(R.id.toobar);
        gridView = findViewById(R.id.gridview);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Available Sets");

        // Use the correct variable name

        GridAdapter gridAdapter = new GridAdapter(getIntent().getIntExtra("sets",0),getIntent().getStringExtra("title"));
        gridView.setAdapter(gridAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
