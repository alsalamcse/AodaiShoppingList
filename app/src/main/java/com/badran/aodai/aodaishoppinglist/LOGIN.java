package com.badran.aodai.aodaishoppinglist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.badran.aodai.aodaishoppinglist.mainlistfragments.MainListActivity;

public class LOGIN extends AppCompatActivity implements View.OnClickListener {
    private static final String PREF_FILE_NAME ="AodaiPref" ;
    private Button BTNsignin;
    private Button BTNsignup;
    private Button BTNfmpassword;
    private EditText ETusername;
    private EditText ETpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ETusername=(EditText) findViewById(R.id.ETusername);
        ETpassword=(EditText) findViewById(R.id.ETpassword);
        BTNsignin=(Button) findViewById(R.id.BTsignin);
        BTNsignup=(Button) findViewById(R.id.BTsignup);
        BTNfmpassword=(Button) findViewById(R.id.BTNfmpassword);


    }


    public void onClick(View view) {
        if (BTNsignin == view) {
            SharedPreferences prefs = getSharedPreferences(
                    PREF_FILE_NAME, MODE_PRIVATE);
            String user = prefs.getString("user", null);
            String passw = prefs.getString("passw", null);
            if (user != null || passw != null)
                Toast.makeText(this, "Successfully logged", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, MainListActivity.class);
            startActivity(intent);
        }

        if (BTNsignup == view) {
            Intent intent = new Intent(this, REGISTER.class);
            startActivity(intent);
            finish();


        }
    }}
