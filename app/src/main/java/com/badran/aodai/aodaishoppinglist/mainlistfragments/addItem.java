package com.badran.aodai.aodaishoppinglist.mainlistfragments;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.badran.aodai.aodaishoppinglist.R;

public class addItem extends AppCompatActivity {
    private EditText ETname;
    private EditText ETamount;
    private EditText ETunits;
    private EditText ETprice;
    private Button BTNSave;
    private ImageButton iBTNimage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        ETname = (EditText) findViewById(R.id.ETname);
        ETamount = (EditText) findViewById(R.id.ETamount);
        ETunits = (EditText) findViewById(R.id.ETunits);
        ETprice = (EditText) findViewById(R.id.ETprice);
        BTNSave = (Button) findViewById(R.id.BTNSave);
        iBTNimage = (ImageButton) findViewById(R.id.iBTNimage);
    }
}
