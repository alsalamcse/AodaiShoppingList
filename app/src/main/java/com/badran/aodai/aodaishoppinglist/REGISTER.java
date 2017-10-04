package com.badran.aodai.aodaishoppinglist;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class REGISTER extends AppCompatActivity implements View.OnClickListener {
    private static final String PREF_FILE_NAME ="AodaiPref" ;
    private Button BTNSave;
    private Button BTNDELETE;
    private EditText ETusername;
    private EditText ETemail;
    private EditText ETpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        BTNSave=(Button) findViewById(R.id.BTNSave);
        ETusername= (EditText) findViewById(R.id.ETusername);
        ETemail=(EditText) findViewById(R.id.ETmail);
        ETpassword=(EditText) findViewById(R.id.ETpassword);
        BTNDELETE=(Button) findViewById(R.id.BTNDELETE);
    }

    public void onClick(View view){
        if (view==BTNSave){
            SharedPreferences prefs = getSharedPreferences(PREF_FILE_NAME,

                    MODE_PRIVATE);

            SharedPreferences.Editor editor = prefs.edit();
            editor.putString("user", ETusername.getText().toString());
            editor.putString("passw", ETpassword.getText().toString());
            editor.putString("mail", ETemail.getText().toString());
            editor.commit();

            Toast.makeText(this, "Successfully saved", Toast.LENGTH_SHORT).show();
            finish();

        }
    }
}
