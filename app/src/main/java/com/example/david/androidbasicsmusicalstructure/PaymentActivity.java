package com.example.david.androidbasicsmusicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        AddOnClickListener(R.id.pay_now);
    }

    private void AddOnClickListener(int paymentButtonId)
    {
        Button payNowButton = (Button) findViewById(paymentButtonId);
        payNowButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(), "Thank you!", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
