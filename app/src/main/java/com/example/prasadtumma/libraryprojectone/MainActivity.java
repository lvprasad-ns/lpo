package com.example.prasadtumma.libraryprojectone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.prasadtumma.lpo.MyLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        View view = new MyLayout(this);
        setContentView(view);
    }
}
