package com.badran.aodai.aodaishoppinglist.mainlistfragments;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.badran.aodai.aodaishoppinglist.R;

import java.util.ArrayList;

public class addItem extends AppCompatActivity {
    private EditText ETname;
    private EditText ETamount;
    private EditText ETunits;
    private EditText ETprice;
    private Button BTNSave;
    private ImageButton iBTNimage;
    private ListView LWitem;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;



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
        LWitem = (ListView) findViewById(R.id.LWitem);
        listItems = new ArrayList<String>();
        listItems.add("First Item - added on Activity Create");
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, listItems);
        LWitem.setAdapter(adapter);
        BTNSave.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                listItems.add(EditText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        LWitem.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Toast.makeText(addItem.this, "Clicked", Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}
    }
}
