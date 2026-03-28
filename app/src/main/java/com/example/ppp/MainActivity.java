package com.example.ppp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

public class MainActivity extends AppCompatActivity {

    Button btnWebsite, btnLocation, btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWebsite = findViewById(R.id.btnWebsite);
        btnLocation = findViewById(R.id.btnLocation);
        btnShare = findViewById(R.id.btnShare);

        btnWebsite.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(intent);
        });

        btnLocation.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Mumbai"));
            startActivity(intent);
        });

        btnShare.setOnClickListener(v -> {
            ShareCompat.IntentBuilder
                    .from(MainActivity.this)
                    .setType("text/plain")
                    .setText("Hello from App P")
                    .setChooserTitle("Share using")
                    .startChooser();
        });
    }
}