package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminDeskActivity extends AppCompatActivity {
    ImageView p_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_desk);
        initialize();
        clickevent();
    }

    private void clickevent() {
        p_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminDeskActivity.this, AdminAddNewProductActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initialize() {
        p_add=findViewById(R.id.Add_product_admin);
    }
}