package com.huawei.medassist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class accountpage extends AppCompatActivity implements View.OnClickListener{
private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountpage);
        btn = (Button) findViewById(R.id.editbutton);
        btn.setOnClickListener(this);
        btn.setText("EDIT");
    }
    public void onClick(View v)
    {

        if(btn.getText()=="EDIT")
        {
         btn.setText("SAVE");
        }
        else if (btn.getText() == "SAVE")
        {
            btn.setText("EDIT");
        }
    }
}