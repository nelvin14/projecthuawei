package com.huawei.medassist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }
    public void thirdActivity(View view){
        Intent intent = new Intent (this, accountpage.class);
        startActivity(intent);
    }
    public void searchWindow(View view2)
    {
        Intent search=new Intent(this,resultspage.class);
        startActivity(search);
    }
}