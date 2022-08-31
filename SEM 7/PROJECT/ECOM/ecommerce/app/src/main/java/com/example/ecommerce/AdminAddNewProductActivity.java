package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminAddNewProductActivity extends AppCompatActivity {
    String categoryname;
    Button add_product;
    EditText P_name,P_description,P_price;
    ImageView P_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_product);
        initialize();
        clickevents();

    }

    public void initialize(){
        add_product=findViewById(R.id.Add_product_btn);
        P_name=findViewById(R.id.product_name);
        P_description=findViewById(R.id.product_description);
        P_price=findViewById(R.id.product_price);
        P_profile = findViewById(R.id.select_product_image);

    }
    public void clickevents(){

        add_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();
            }
        });

    }
}