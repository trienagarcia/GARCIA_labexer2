package com.example.garcia_labexer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etCourse1, etCourse2, etCourse3, etCourse4, etCourse5, etCourse6, etCourse7, etCourse8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCourse1 = findViewById(R.id.editText10);
        etCourse2 = findViewById(R.id.editText11);
        etCourse3 = findViewById(R.id.editText12);
        etCourse4 = findViewById(R.id.editText13);
        etCourse5 = findViewById(R.id.editText14);
        etCourse6 = findViewById(R.id.editText15);
        etCourse7 = findViewById(R.id.editText16);
        etCourse8 = findViewById(R.id.editText17);
    }

    public void saveData(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String crs1 = etCourse1.getText().toString();
        String crs2 = etCourse2.getText().toString();
        String crs3 = etCourse3.getText().toString();
        String crs4 = etCourse4.getText().toString();
        String crs5 = etCourse5.getText().toString();
        String crs6 = etCourse6.getText().toString();
        String crs7 = etCourse7.getText().toString();
        String crs8 = etCourse8.getText().toString();

        editor.putString("course1", crs1);
        editor.putString("course2", crs2);
        editor.putString("course3", crs3);
        editor.putString("course4", crs4);
        editor.putString("course5", crs5);
        editor.putString("course6", crs6);
        editor.putString("course7", crs7);
        editor.putString("course8", crs8);

        editor.commit();
        editor.apply();
        Toast.makeText(this, "data was saved...", Toast.LENGTH_LONG).show();

    }

    public void validate(View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String crs1SP = sp.getString("course1", null);
        String crs2SP = sp.getString("course2", null);
        String crs3SP = sp.getString("course3", null);
        String crs4SP = sp.getString("course4", null);
        String crs5SP = sp.getString("course5", null);
        String crs6SP = sp.getString("course6", null);
        String crs7SP = sp.getString("course7", null);
        String crs8SP = sp.getString("course8", null);

        String crs1 = etCourse1.getText().toString();
        String crs2 = etCourse2.getText().toString();
        String crs3 = etCourse3.getText().toString();
        String crs4 = etCourse4.getText().toString();
        String crs5 = etCourse5.getText().toString();
        String crs6 = etCourse6.getText().toString();
        String crs7 = etCourse7.getText().toString();
        String crs8 = etCourse8.getText().toString();
        if (crs1.equals(crs1SP) || crs2.equals(crs2SP) || crs3.equals(crs3SP) || crs4.equals(crs4SP) || crs5.equals(crs5SP) || crs6.equals(crs6SP) || crs7.equals(crs7SP) || crs8.equals(crs8SP)) {
            Toast.makeText(this, "course is valid..", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "course is invalid..", Toast.LENGTH_LONG).show();
        }
    }

    public void next(View v) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);

    }

    public void prev(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);

    }
}


