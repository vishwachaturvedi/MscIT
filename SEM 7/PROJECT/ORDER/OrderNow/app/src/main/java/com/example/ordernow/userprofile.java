package com.example.ordernow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firestore.v1.StructuredQuery;

import java.util.ArrayList;

public class userprofile extends AppCompatActivity {
    RecyclerView recyclerView;
    myadapter myadap;
    ArrayList<user> list;
    DatabaseReference db;
   // FirebaseAuth fAuth;
    FirebaseFirestore fstore;
    String userId;

    @Override
    protected void onStart() {
        super.onStart();
        myadap.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myadap.stopListening();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userprofile);

        setrec();


    }

    private void setrec() {
        fstore=FirebaseFirestore.getInstance();
        CollectionReference taskref=fstore.collection("users");
        Query q=taskref.orderBy("fname", Query.Direction.DESCENDING);
        FirestoreRecyclerOptions<user> options=new FirestoreRecyclerOptions.Builder<user>().setQuery(q,user.class).build();

        myadap =new myadapter(options);

        recyclerView=findViewById(R.id.userlist);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadap);
    }

}