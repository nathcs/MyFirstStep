package com.example.myfirststep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class becomeAuPairPage extends AppCompatActivity {

    ImageButton cc, apia, apc, stb, ie, exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_au_pair_page);

        cc = findViewById(R.id.ib_cc);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}