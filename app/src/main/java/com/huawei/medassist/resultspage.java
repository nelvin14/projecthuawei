package com.huawei.medassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class resultspage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultspage);
    }
    public void purchaseW(View view4)
    {
        Intent cart=new Intent(this,purchasepage.class);
        startActivity(cart);
    }
}