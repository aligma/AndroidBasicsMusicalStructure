package com.example.david.androidbasicsmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        AddOnClickListener(R.id.podcast1);
        AddOnClickListener(R.id.podcast2);
        AddOnClickListener(R.id.podcast3);
    }

    private void AddOnClickListener(int textViewId)
    {
        TextView podcastTextView = (TextView) findViewById(textViewId);
        podcastTextView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO: In the real implementation, pass the series ID or name to the Series activity
                        startActivity(new Intent(ResultsActivity.this, SeriesActivity.class));
                    }
                }
        );
    }
}
