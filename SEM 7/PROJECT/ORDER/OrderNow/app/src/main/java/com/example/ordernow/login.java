package com.example.ordernow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    EditText email, password;
    Button login;
    TextView register,forget;
    ProgressBar progressBar2;
    FirebaseAuth fAuth;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sp=getSharedPreferences("orderNow",MODE_PRIVATE);
        if(sp.contains("mail"))
        {
            Intent i=new Intent(getApplicationContext(),home.class);
            startActivity(i);
        }
        email = findViewById(R.id.email);
        password =  findViewById(R.id.password);
        login =  findViewById(R.id.login);
        register =  findViewById(R.id.register);
        fAuth = FirebaseAuth.getInstance();
        progressBar2=findViewById(R.id.progressBar2);
        forget=findViewById(R.id.forget);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String mail =email.getText().toString().trim();
                String pass=password.getText().toString().trim();

                if(TextUtils.isEmpty(mail)){
                    email.setError("Email is Required");
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
                if(mail.equals("admin123@gmail.com") && pass.equals("admin123"))
                {
                    startActivity(new Intent(getApplicationContext(),adminhome.class));
                }
                else {
                progressBar2.setVisibility(View.VISIBLE);

                fAuth.signInWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                       if(task.isSuccessful()) {
                           SharedPreferences.Editor edit=sp.edit();
                           edit.putString("mail",mail);
                           edit.commit();
                           Toast.makeText(login.this,"Login Successfully.",Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(getApplicationContext(),home.class));
                       }
                       else{
                           Toast.makeText(login.this,"Error !"+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                           progressBar2.setVisibility(View.GONE);
                       }
                    }
                });}

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to RegisterActivity
                Intent intent = new Intent(login.this, signup.class);
                startActivity(intent);
            }
        });

        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText resetmail=new EditText(v.getContext());
                AlertDialog.Builder passwordResetDilog =new AlertDialog.Builder(v.getContext());
                passwordResetDilog.setTitle("Reset Password ?");
                passwordResetDilog.setMessage("Enter Your Email To Received Rest Link");
                passwordResetDilog.setView(resetmail);

                passwordResetDilog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String gmail=resetmail.getText().toString();
                        fAuth.sendPasswordResetEmail(gmail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Toast.makeText(login.this,"Reset link sent.",Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(login.this,"Reset link Not sent."+e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
                passwordResetDilog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                passwordResetDilog.create().show();
            }
        });
    }
}