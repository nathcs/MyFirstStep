package com.example.myfirststep;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class becomeAuPairPage extends AppCompatActivity {

    ImageView cc, apia, apc, stb, ie, exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_au_pair_page);

        CCLink();
        APIALink();
        APCLink();
        STBLink();
        IELink();
        EXPLink();

    }

    private void CCLink() {

        cc = findViewById(R.id.ib_cc);
        cc.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://www.culturalcare.com.br/");
            Intent intentCCLink = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentCCLink);
        });
    }
    private void APIALink() {

        apia = findViewById(R.id.ib_apia);
        apia.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://www.aupairinamerica.com/");
            Intent intentCCLink = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentCCLink);
        });
    }
    private void APCLink() {

        apc = findViewById(R.id.ib_apc);
        apc.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://www.aupaircare.com/");
            Intent intentCCLink = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentCCLink);
        });
    }
    private void STBLink() {

        stb = findViewById(R.id.ib_stb);
        stb.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://www.stb.com.br/");
            Intent intentCCLink = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentCCLink);
        });
    }
    private void IELink() {

        ie = findViewById(R.id.ib_ie);
        ie.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://www.interexchange.org/au-pair/#");
            Intent intentCCLink = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentCCLink);
        });
    }
    private void EXPLink() {

        exp = findViewById(R.id.ib_exp);
        exp.setOnClickListener(v -> {

            Uri uri = Uri.parse("https://www.experimento.com.br/trabalho/au-pair");
            Intent intentCCLink = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intentCCLink);
        });
    }
}