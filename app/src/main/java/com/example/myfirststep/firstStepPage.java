package com.example.myfirststep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class firstStepPage extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_step_page);

        try {
            buscarTexto();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /*
    * block of code extracted from website below
    * https://learnwithnitish.wordpress.com/2016/05/08/read-text-file-and-display-on-textview/
    * function 'raw' in red
    * meaning is still unknown
    * happy that it worked.
    * ----------------------------------------
    * will work on the proper text later
    * ----------------------------------------
    * will also work on xml formatting for the text
    * add title to the text
    * make it simple and objective
    * ----------------------------------------
    */


    private void buscarTexto() throws FileNotFoundException {
        texto = findViewById(R.id.primeiros_passos);

        InputStream inputStream = getResources().openRawResource(R.raw.first_step);

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
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
        texto.setText(byteArrayOutputStream.toString());
    }

}
