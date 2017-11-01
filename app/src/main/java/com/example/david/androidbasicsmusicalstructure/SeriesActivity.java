package com.example.david.androidbasicsmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        AddOnClickListener(R.id.episode1);
        AddOnClickListener(R.id.episode2);
        AddOnClickListener(R.id.episode3);
    }

    private void AddOnClickListener(int textViewId)
    {
        TextView episodeTextView = (TextView) findViewById(textViewId);
        episodeTextView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO: In the real implementation, pass the series ID or name to the Episode activity
                        startActivity(new Intent(SeriesActivity.this, EpisodeActivity.class));
                    }
                }
        );
    }
}
