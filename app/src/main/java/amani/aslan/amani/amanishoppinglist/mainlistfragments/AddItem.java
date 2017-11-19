package amani.aslan.amani.amanishoppinglist.mainlistfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddItem extends AppCompatActivity {
    private EditText ETname;
    private EditText ETamount;
    private EditText ETunits;
    private EditText ETprice;
    private Button BTNSave;
    private ImageView iBTNimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(amani.amani.amani4.Amanishoppinglist.R.layout.activity_add_item);
        ETname = (EditText) findViewById(amani.amani.amani4.Amanishoppinglist.R.id.ETname);
        ETamount = (EditText) findViewById(amani.amani.amani4.Amanishoppinglist.R.id.ETamount);
        ETunits = (EditText) findViewById(amani.amani.amani4.Amanishoppinglist.R.id.ETunits);
        ETprice = (EditText) findViewById(amani.amani.amani4.Amanishoppinglist.R.id.ETprice);
        BTNSave = (Button) findViewById(amani.amani.amani4.Amanishoppinglist.R.id.BTNSave);
        iBTNimage = (ImageView) findViewById(amani.amani.amani4.Amanishoppinglist.R.id.iBTNimage);


    }

    public void dataHandler() {
        String name = ETname.getText().toString();
        String stamount = ETamount.getText().toString();
        String Units = ETunits.getText().toString();
        String stprice = ETprice.getText().toString();
        double amount=Double.parseDouble(stamount);
        double price=Double.parseDouble(stprice);

        // ka2en b36i mo2sher lka3edet albyanat (firebase)
        DatabaseReference reference;

        // todo לקבלתצ קישור למסד הניתונים שלנו
        // // TODO קישור הינו לשורש של המסד הניתונים
        reference= FirebaseDatabase.getInstance().getReference();

        reference.child("list").setValue("7yala");

    }
}






