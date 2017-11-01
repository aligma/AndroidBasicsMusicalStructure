package com.example.david.androidbasicsmusicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EpisodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode);

        AddOnClickListener(R.id.purchase);
    }

    private void AddOnClickListener(int buttonId)
    {
        Button episodeTextView = (Button) findViewById(buttonId);
        episodeTextView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // TODO: In the real implementation, pass the series ID or name to the Payment activity
                        startActivity(new Intent(EpisodeActivity.this, PaymentActivity.class));
                    }
                }
        );
    }
}
