package amani.aslan.amani.amanishoppinglist.mainlistfragments;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.aslan.amani.amanishoppinglist1.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import amani.aslan.amani.amanishoppinglist.data.Product;

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
        setContentView(R.layout.activity_add_item);
        ETname = (EditText) findViewById(R.id.ETname);
        ETamount = (EditText) findViewById(R.id.ETamount);
        ETunits = (EditText) findViewById(R.id.ETunits);
        ETprice = (EditText) findViewById(R.id.ETprice);
        BTNSave = (Button) findViewById(R.id.BTNSave);
        iBTNimage = (ImageView) findViewById(R.id.iBTNimage);


    }

    public void dataHandler() {
        //2. get data from the filds
        String name = ETname.getText().toString();
        String stamount = ETamount.getText().toString();
        String Units = ETunits.getText().toString();
        String stprice = ETprice.getText().toString();
       //// 2. TODO: Validate fields input
        //isok=true;..

        //3. data manipulation
        double amount=Double.parseDouble(stamount);
        double price=Double.parseDouble(stprice);

        //4. bulding data object
//
        Product p =new Product();
        p.setName(name);
        p.setPrice(price);
        p.setAmount(amount);
        p.setCompleted(false);

        DatabaseReference reference;
        // ka2en b36i mo2sher lka3edet albyanat (firebase)

        // todo לקבלתצ קישור למסד הניתונים שלנו
        // // TODO קישור הינו לשורש של המסד הניתונים
        reference= FirebaseDatabase.getInstance().getReference();

        //5. to get user emailuser info
         FirebaseAuth auth=FirebaseAuth.getInstance();
        FirebaseUser user=auth.getCurrentUser();
        String email=user.getEmail();
        //bbdl kol noqta "." b nejmi "*"
        email=email.replace(('.'),('*'));

        //6.
        // ka2en b36i mo2sher lka3edet albyanat (firebase)

        // todo לקבלתצ קישור למסד הניתונים שלנו
        // // TODO קישור הינו לשורש של המסד הניתונים
        reference= FirebaseDatabase.getInstance().getReference();
        //7.saveing data on the firebase database
        reference.child(email).child("mylist").push().setValue("KKKK").
                addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if ((task.isSuccessful()))
                        {
                            Toast.makeText(AddItem.this, "add product Successful", Toast.LENGTH_SHORT);
                        }
                        else
                        {
                            Toast.makeText(AddItem.this,"add product failed", Toast.LENGTH_LONG);
                        }
                    }
                });


    }

}


        //// TODO: testing
        //reference.child("list").setValue(stname);









