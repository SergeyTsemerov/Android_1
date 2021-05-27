package ru.geekbrains.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchLayout(View view) {
        setContentView(R.layout.activity_another_tasks);
    }

    public void switchLayout1(View view) {
        setContentView(R.layout.activity_main);
    }
}