package com.example.ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

public class LoginActivity extends AppCompatActivity {
    EditText username, password,otp;
    Button login,verify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
        clickevent();
    }

    public void initialize() {
        username = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        login = findViewById(R.id.login_btn);
    }

    public void clickevent() {

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("ADMIN123")){
                    Toast.makeText(LoginActivity.this, "done" , Toast.LENGTH_SHORT).show();

                }

                else
                {
                    username.setText("");
                    password.setText("");
                    Toast.makeText(LoginActivity.this, "Invalid details" , Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(LoginActivity.this, AdminDeskActivity.class);
                startActivity(intent);

            }
/*
                String emails = username.getText().toString();
                String Passwords = password.getText().toString();

                fauth.signInWithEmailAndPassword(emails, Passwords).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        Toast.makeText(LoginActivity.this, "success", Toast.LENGTH_SHORT).show();
                        Toast.makeText(LoginActivity.this, "SuccessFully Logged In as customer", Toast.LENGTH_SHORT).show();
                        DocumentReference reference = firestore.collection("users").document(uid);
                        reference.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                            @Override
                            public void onSuccess(DocumentSnapshot documentSnapshot) {
                                {
                                    Toast.makeText(LoginActivity.this, "done" , Toast.LENGTH_SHORT).show();
                                }

                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });

                    }
                });

            }
        });
    }*/
        });
    }
}