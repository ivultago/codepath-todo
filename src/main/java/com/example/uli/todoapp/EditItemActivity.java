package com.example.uli.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import android.widget.AdapterView;
import android.widget.Button;

import android.widget.ListView;
import android.widget.Toast;

public class EditItemActivity extends AppCompatActivity {


    EditText txtView;
    String itemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        txtView = (EditText) findViewById(R.id.txtView);
        String item = getIntent().getStringExtra("item");
        txtView.setText(item);
        itemPosition = getIntent().getStringExtra("itemPos");
    }



    public void onSubmit(View v) {
        Intent intItem = new Intent();
        intItem.putExtra("item", txtView.getText().toString());
        intItem.putExtra("itemPos", itemPosition);
        setResult(RESULT_OK, intItem);
        finish();
    }
}
