package com.example.david.androidbasicsmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO: In the real implementation, pass the search terms to the Results activity
                        startActivity(new Intent(SearchActivity.this, ResultsActivity.class));
                    }
                }
        );
    }
}
