package com.eduarte.eduartekarlexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.eduarte.eduartekarlexam2.R;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FileInputStream fin = null;
        try {
            fin = openFileInput("data1.txt");
            int token;
            String temp = "";
            while ((token = fin.read()) != -1){
                temp = temp + ((char)token);
            }
            try {
                String[] list = temp.split("_");
                try {
                    ((TextView) (findViewById(R.id.editText2))).setText(list[0]);
                    ((TextView) (findViewById(R.id.editText3))).setText(list[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                fin.close();
            } catch (FileNotFoundException e) {
                Log.d("error", "File Not Found Exception");
            } catch (IOException e) {
                Log.d("error", "IO Exception");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onSend(View view) {
        Toast.makeText(this, "REGISTRATION SENT!", Toast.LENGTH_SHORT).show();
    }

    public void previousData(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
