package com.ms.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ms.module.rxview.RxView;

public class MainActivity extends AppCompatActivity implements RxView.Action1<View> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        RxView.setOnClickListeners(this::onClick, imageView);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView:

                Toast.makeText(this, "RxView", Toast.LENGTH_SHORT).show();

                break;

        }
    }
}