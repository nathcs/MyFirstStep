 package com.example.myfirststep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

 public class MainActivity extends AppCompatActivity {

    Button firstStep, agencies, requirements, values, becomeAuPair;

    //ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firststep();
        agencies();
        requirements();
        values();
        becomeAuPair();
    }



    private void firststep() {
        /**
         * page to explain about the program
         * simple and object explanations
         */
        firstStep = (Button) findViewById(R.id.b_firstStep);

        firstStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFirstStep = new Intent(MainActivity.this, firstStepPage.class);
                startActivity(intentFirstStep);
            }
        });
    }

    private void agencies() {
        /**
         * page to show agencies
         * tell about each options
         * different pages for each
         */
        agencies = (Button) findViewById(R.id.b_agencies);

        agencies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAgencies = new Intent(MainActivity.this, agenciesPage.class);
                startActivity(intentAgencies);
            }
        });

    }

    private void requirements() {
        /**
         * page with requirements
         * to become an au pair
         * separated
         * male - female
         */
        requirements = (Button) findViewById(R.id.b_requirements);

        requirements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRequirements = new Intent(MainActivity.this, requirementsPage.class);
                startActivity(intentRequirements);
            }
        });
    }

    private void values() {
        /**
         * page with questions to answer
         * the final result will depend on the answers
         * will show a approximate value
         * needed to start the process
         */
        values = (Button) findViewById(R.id.b_values);

        values.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentValues = new Intent(MainActivity.this, valuesPage.class);
                startActivity(intentValues);
            }
        });

    }

    private void becomeAuPair() {
        /**
         * page with agencies links
         * when clicked
         * it will be redirected to the
         * chosen agency page
         */
        becomeAuPair = (Button) findViewById(R.id.b_becomeAuPair);

        becomeAuPair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBecomeAuPair = new Intent(MainActivity.this, becomeAuPairPage.class);
                startActivity(intentBecomeAuPair);
            }
        });
    }

}