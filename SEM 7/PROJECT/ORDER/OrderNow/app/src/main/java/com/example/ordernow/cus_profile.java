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

public class cus_profile extends AppCompatActivity {
    TextView textname,textemail,textphone;
    FirebaseAuth fAuth;
    FirebaseFirestore fstore;
    String userId;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cus_profile);

        textname=findViewById(R.id.textname);
        textemail=findViewById(R.id.textemail);
        textphone=findViewById(R.id.textphone);

        fAuth=FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();
        button=findViewById(R.id.button);

        userId=fAuth.getCurrentUser().getUid();
        DocumentReference documentReference=fstore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {

                textname.setText(value.getString("fname"));
                textemail.setText(value.getString("email"));
                textphone.setText(value.getString("phone"));


            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),EditUserProfile.class);
                i.putExtra("fname",textname.getText().toString());
                i.putExtra("email",textemail.getText().toString());
                i.putExtra("phone",textphone.getText().toString());

                startActivity(i);
            }
        });
    }
}