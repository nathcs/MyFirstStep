package com.example.myfirststep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class requirementsPage extends AppCompatActivity {

    TextView requisitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_requirements_page);

        try {
            catchRequirements();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void catchRequirements() throws FileNotFoundException {
        requisitos = findViewById(R.id.text_requisitos);

        InputStream inputStream = getResources().openRawResource(R.raw.requirements);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        int i;
        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (IOException e) {
            System.out.print("We're sorry! The file was not found :/");
            e.printStackTrace();
        }
        requisitos.setText(byteArrayOutputStream.toString());
    }
}
