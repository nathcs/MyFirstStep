package com.example.myfirststep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class becomeAuPairPage extends AppCompatActivity {

    ImageView cc, apia, apc, stb, ie, exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_au_pair_page);

        CCLink();

    }

    private void CCLink() {

        cc = findViewById(R.id.ib_cc);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.culturalcare.com.br/");
                Intent intentCCLink = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intentCCLink);
            }
        });
    }
}