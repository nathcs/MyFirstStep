package com.example.myfirststep;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class valuesPage extends AppCompatActivity {

    RadioGroup radioGroupQ1, radioGroupQ2, radioGroupQ3, radioGroupQ4;
    RadioButton radioButtonQ1, radioButtonQ2, radioButtonQ3, radioButtonQ4;
    TextView textViewTotal;

    int bags = 300;
    int extra = 300;
    int health = 200;
    int total, dl, passport, city, discount;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_page);

        radioGroupQ1 = findViewById(R.id.radioGroup01);
        radioGroupQ2 = findViewById(R.id.radioGroup02);
        radioGroupQ3 = findViewById(R.id.radioGroup03);
        radioGroupQ4 = findViewById(R.id.radioGroup04);

        textViewTotal = findViewById(R.id.finalResult);

        //calling the button
        Button submit = findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId1 = radioGroupQ1.getCheckedRadioButtonId();
                int radioId2 = radioGroupQ2.getCheckedRadioButtonId();
                int radioId3 = radioGroupQ3.getCheckedRadioButtonId();
                int radioId4 = radioGroupQ4.getCheckedRadioButtonId();

                radioButtonQ1 = findViewById(radioId1);
                radioButtonQ2 = findViewById(radioId2);
                radioButtonQ3 = findViewById(radioId3);
                radioButtonQ4 = findViewById(radioId4);

                if ("Sim".contentEquals(radioButtonQ1.getText())) {
                    dl = 200;
                } else {
                    dl = 1200;
                }
                if ("Sim".contentEquals(radioButtonQ2.getText())) {
                    passport = 600;
                } else {
                    passport = 900;
                }
                if ("Sim".contentEquals(radioButtonQ3.getText())) {
                    city = 100;
                } else {
                    city = 800;
                }
                if ("Sim".contentEquals(radioButtonQ4.getText())) {
                    discount = 2000;
                } else {
                    discount = 4000;
                }

                total = health + bags + extra + dl + passport + city + discount;

                textViewTotal.setText("Valor Total Aproximado \nR$ " + total);
            }
        });

    }

    public void checkQuest(View v) {
        int radioId1 = radioGroupQ1.getCheckedRadioButtonId();
        int radioId2 = radioGroupQ2.getCheckedRadioButtonId();
        int radioId3 = radioGroupQ3.getCheckedRadioButtonId();
        int radioId4 = radioGroupQ4.getCheckedRadioButtonId();

        radioButtonQ1 = findViewById(radioId1);
        radioButtonQ2 = findViewById(radioId2);
        radioButtonQ3 = findViewById(radioId3);
        radioButtonQ4 = findViewById(radioId4);

        Toast.makeText(this, "Test selection: " + radioButtonQ1.getText(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Test selection: " + radioButtonQ2.getText(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Test selection: " + radioButtonQ3.getText(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Test selection: " + radioButtonQ4.getText(), Toast.LENGTH_SHORT).show();
    }

}