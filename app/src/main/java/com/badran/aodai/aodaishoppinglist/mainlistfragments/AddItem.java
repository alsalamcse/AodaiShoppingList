package com.badran.aodai.aodaishoppinglist.mainlistfragments;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.badran.aodai.aodaishoppinglist.R;
import com.badran.aodai.aodaishoppinglist.data.Product;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class AddItem extends AppCompatActivity implements View.OnClickListener {
    private EditText ETname;
    private EditText ETamount;
    private EditText ETunits;
    private EditText ETprice;
    private Button BTNSave;
    private ImageView iBTNimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        ETname = (EditText) findViewById(R.id.ETname);
        ETamount = (EditText) findViewById(R.id.ETamount);
        ETunits = (EditText) findViewById(R.id.ETunits);
        ETprice = (EditText) findViewById(R.id.ETprice);
        BTNSave = (Button) findViewById(R.id.BTNSave);
        iBTNimage = (ImageView) findViewById(R.id.iBTNimage);
        BTNSave.setOnClickListener(this);
    }


    public void dataHandler() {
        String name = ETname.getText().toString();
        String stamount = ETamount.getText().toString();
        String Units = ETunits.getText().toString();
        String stprice = ETprice.getText().toString();
        //isOk=true;

        double amount = Double.parseDouble(stamount);
        double price = Double.parseDouble(stprice);

        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        p.setAmount(amount);
        p.setCompleted(false);


        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();
        String email = user.getEmail();
        email=email.replace('.','*');
        DatabaseReference reference;
        reference= FirebaseDatabase.getInstance().getReference();
        reference.child(email).child("my list").push().setValue(p).addOnCompleteListener(this, new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(AddItem.this, "Product added successfully", Toast.LENGTH_SHORT).show();
                }

                    else
                {
                    Toast.makeText(AddItem.this, "Product add failed", Toast.LENGTH_SHORT).show();

                }
            }
        });

        //reference.child("list").setValue("khalil");
    }

    @Override
    public void onClick(View v) {
        if (BTNSave==v){
            dataHandler();
        }
    }
}








