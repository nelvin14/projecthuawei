package com.huawei.medassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class purchasepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchasepage);
    }
    public void toPurchaseitems(View view7)
    {
        Intent buyintent=new Intent(this,cartlist.class);
        startActivity(buyintent);
    }
}