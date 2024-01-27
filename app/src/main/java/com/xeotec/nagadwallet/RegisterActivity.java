package com.xeotec.nagadwallet;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button callButton = findViewById(R.id.call);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When "Call Branch" button is clicked, initiate a phone call
                dialPhoneNumber("007");
            }
        });
    }

    // Method to initiate a phone call with the specified phone number
    private void dialPhoneNumber(String phoneNumber) {
        // Create an intent with the ACTION_DIAL action
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);

        // Set the data (phone number) for the intent
        dialIntent.setData(Uri.parse("tel:" + phoneNumber));

        // Start the dialer activity
        startActivity(dialIntent);
    }
}
