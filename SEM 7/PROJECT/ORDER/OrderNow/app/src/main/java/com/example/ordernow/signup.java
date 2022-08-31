package com.example.ordernow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class signup extends AppCompatActivity {
    public static final String TAG = "TAG";
    EditText name, email, phone, password;
    Button register;
    TextView login;

    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    DatabaseReference db;
    ProgressBar progressBar;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name =(EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.password);
        login = (TextView) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);


        db= FirebaseDatabase.getInstance().getReference().child("users");
        fauth = FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();

        progressBar=findViewById(R.id.progressBar);


       if(fauth.getCurrentUser()!= null){
           startActivity(new Intent(getApplicationContext(),home.class));
            Toast.makeText(signup.this,"User Created.",Toast.LENGTH_SHORT).show();
            finish();
        }

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mail =email.getText().toString().trim();
                String pass=password.getText().toString().trim();
                String cname =name.getText().toString();
                String con=phone.getText().toString();


                if(TextUtils.isEmpty(mail)){
                    email.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(cname)){
                    name.setError("Name is Required");
                    return;
                }
                if(TextUtils.isEmpty(pass)){
                    password.setError("Password is Required");
                    return;
                }
                if(pass.length()<6){
                    password.setError("Password Must be 6 or More Characters.");
                    return;
                }
                if(TextUtils.isEmpty(con)){
                    phone.setError("Contact Number is Required");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);
                fauth.createUserWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            FirebaseUser use=fauth.getCurrentUser();
                            use.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Toast.makeText(signup.this,"Verification Email Has Benn Sent.",Toast.LENGTH_SHORT).show();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d(TAG,"onFailure: "+e.getMessage());
                                }
                            });


                            Toast.makeText(signup.this,"User Created.",Toast.LENGTH_SHORT).show();
                            userId=fauth.getCurrentUser().getUid();
                            DocumentReference documentReference=fstore.collection("users").document(userId);


                            Map<String,Object> user =new HashMap<>();
                            user.put("fname",cname);
                            user.put("email",mail);
                            user.put("phone",con);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d(TAG,"onSuccess :User Profile for"+userId);
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d(TAG,"onFailure: "+e.toString());
                                }
                            });

                            startActivity(new Intent(getApplicationContext(),home.class));
                            finish();

                        }
                        else{
                            Toast.makeText(signup.this,"Error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }


        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to LoginActivity
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });
    }
}