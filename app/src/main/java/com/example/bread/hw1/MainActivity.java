package com.example.bread.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText)findViewById(R.id.etName);

    }

    public void newActivity(View view){

        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Main2Activity.class);

        Bundle bundle = new Bundle();
        bundle.putString("name", etName.getText().toString());
        intent.putExtras(bundle);

        startActivity(intent);

    }

}
