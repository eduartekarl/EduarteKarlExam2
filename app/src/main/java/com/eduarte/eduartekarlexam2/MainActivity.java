package com.eduarte.eduartekarlexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void writeData(View view) throws IOException {
        setTitle("ACTIVITY REGISTRATION");
        String FILENAME = "data1.txt";
        FileOutputStream fosWriter = null;
        fosWriter = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        if(((CheckBox)(findViewById(R.id.checkBox7))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox7)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox6))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox6)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox3))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox3)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox2))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox2)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox5))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox5)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox4))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox4)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox8))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox8)).getText().toString()).getBytes());
        }
        fosWriter.write(("_" + ((EditText)(findViewById(R.id.editText))).getText().toString()).getBytes());
        Toast.makeText(this,"ACTIVITIES ARE SAVED!", Toast.LENGTH_LONG).show();
    }

    public void nextData(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}