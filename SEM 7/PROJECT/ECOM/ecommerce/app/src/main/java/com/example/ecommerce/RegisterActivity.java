package com.example.ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegisterActivity  extends AppCompatActivity {
    Button register;
    EditText fname, lname, contact, address, email, password;
    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initialize();
    }

    public void initialize() {
        register = findViewById(R.id.Register_btn);
        fname = findViewById(R.id.Register_fname);
        lname = findViewById(R.id.Register_lname);
        contact = findViewById(R.id.Register_contact);
        address = findViewById(R.id.Register_address);
        email = findViewById(R.id.Register_email);
        password = findViewById(R.id.Register_password);
        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("tbl_user");






        register.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            String first_name=fname.getText().toString().trim();
                                            String last_name=lname.getText().toString().trim();
                                            String contact_number=contact.getText().toString().trim();
                                            String adress_home=address.getText().toString().trim();
                                            String email_address=email.getText().toString().trim();
                                            String password_value=password.getText().toString().trim();
/*
                                            UserHelperClass helperClass = new UserHelperClass(first_name,last_name,contact_number,adress_home,email_address,password_value);
                                            reference.child(contact_number).setValue(helperClass);
                                            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                            startActivity(intent);

*/
                                            if (TextUtils.isEmpty(fname.getText().toString())) {
                                                Toast.makeText(getApplicationContext(), "First Name Required", Toast.LENGTH_LONG).show();
                                            } else if (TextUtils.isEmpty(last_name)) {
                                                Toast.makeText(getApplicationContext(), "Last Name Required", Toast.LENGTH_LONG).show();
                                            } else if (TextUtils.isEmpty(contact_number)) {
                                                Toast.makeText(getApplicationContext(), "Contact Number Required", Toast.LENGTH_LONG).show();
                                            } else if (TextUtils.isEmpty(adress_home)) {
                                                Toast.makeText(getApplicationContext(), "Address Required", Toast.LENGTH_LONG).show();
                                            } else if (TextUtils.isEmpty(email_address)) {
                                                Toast.makeText(getApplicationContext(), "Email Required", Toast.LENGTH_LONG).show();
                                            } else if (TextUtils.isEmpty(password_value)) {
                                                Toast.makeText(getApplicationContext(), "Password Required", Toast.LENGTH_LONG).show();
                                            } else {
                                                            validateAccount(first_name,last_name,contact_number,adress_home,email_address,password_value);
                                            }
                                        }
                                    });


    }

    private void validateAccount(String first_name, String last_name, String contact_number, String adress_home, String email_address, String password_value) {
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if ((snapshot.child("tbl_user").child(contact_number).exists())) {
                    Toast.makeText(getApplicationContext(),"Phone number already exits",Toast.LENGTH_LONG).show();
                } else {
                    UserHelperClass helperClass = new UserHelperClass(first_name, last_name, contact_number, adress_home, email_address, password_value);
                    reference.child(contact_number).setValue(helperClass);
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
