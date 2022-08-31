package com.example.ordernow;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class customer_pro extends AppCompatActivity {
    TextView username,usermail,userphone;
    FirebaseAuth fAuth;
    FirebaseFirestore fstore;
    String userId;
    Button editbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_pro);

        username=findViewById(R.id.username);
        usermail=findViewById(R.id.usermail);
        userphone=findViewById(R.id.userphone);
        fAuth=FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();
        editbtn=findViewById(R.id.editbtn);

        userId=fAuth.getCurrentUser().getUid();
        DocumentReference documentReference=fstore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                username.setText(value.getString("fname"));
                usermail.setText(value.getString("email"));
                userphone.setText(value.getString("phone"));


            }
        });
        editbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),EditUserProfile.class);
                i.putExtra("fname",username.getText().toString());
                i.putExtra("email",usermail.getText().toString());
                i.putExtra("phone",userphone.getText().toString());

                startActivity(i);
            }
        });
    }
}