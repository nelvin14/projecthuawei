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
    public void cartLibrary(View view3)
    {
        Intent cartl=new Intent(this,cartlist.class);
        startActivity(cartl);
    }
    public void savedLibrary(View view5)
    {
        Intent lb=new Intent(this,library.class);
        startActivity(lb);
    }
    public void toMappage(View view8)
    {
        Intent mapintent=new Intent(this,mappage.class);
        startActivity(mapintent);
    }
}