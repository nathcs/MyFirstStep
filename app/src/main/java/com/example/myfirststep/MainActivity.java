 package com.example.myfirststep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    Button firstStep, agencies, requirements, values, becomeAuPair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstStep();
        agencies();
        requirements();
        values();
        becomeAuPair();
    }



    private void firstStep() {
        /*
         * page to explain about the program
         * simple and object explanations
         */
        firstStep = findViewById(R.id.b_firstStep);

        firstStep.setOnClickListener(v -> {
            Intent intentFirstStep = new Intent(MainActivity.this, firstStepPage.class);
            startActivity(intentFirstStep);
        });
    }

    private void agencies() {
        /*
         * page to show agencies
         * tell about each options
         * different pages for each
         */
        agencies = findViewById(R.id.b_agencies);

        agencies.setOnClickListener(v -> {
            Intent intentAgencies = new Intent(MainActivity.this, agenciesPage.class);
            startActivity(intentAgencies);
        });

    }

    private void requirements() {
        /*
         * page with requirements
         * to become an au pair
         * separated
         * male - female
         */
        requirements = findViewById(R.id.b_requirements);

        requirements.setOnClickListener(v -> {
            Intent intentRequirements = new Intent(MainActivity.this, requirementsPage.class);
            startActivity(intentRequirements);
        });
    }

    private void values() {
        /*
         * page with questions to answer
         * the final result will depend on the answers
         * will show a approximate value
         * needed to start the process
         */
        values = findViewById(R.id.b_values);

        values.setOnClickListener(v -> {
            Intent intentValues = new Intent(MainActivity.this, valuesPage.class);
            startActivity(intentValues);
        });

    }

    private void becomeAuPair() {
        /*
         * page with agencies links
         * when clicked
         * it will be redirected to the
         * chosen agency page
         */
        becomeAuPair = findViewById(R.id.b_becomeAuPair);

        becomeAuPair.setOnClickListener(v -> {
            Intent intentBecomeAuPair = new Intent(MainActivity.this, becomeAuPairPage.class);
            startActivity(intentBecomeAuPair);
        });
    }

}