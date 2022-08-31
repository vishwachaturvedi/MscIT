package com.example.ordernow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import static com.google.firebase.database.FirebaseDatabase.*;

public class allproduct extends AppCompatActivity {
    //FirebaseStorage fstor;
    //FirebaseDatabase db;
    //DatabaseReference ref;

    RecyclerView recyclerView;
    product_adapter adpter;
   // List<product_data> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allproduct);
        //db=FirebaseDatabase.getInstance();
        //ref=db.getReference().child("product_all_data");
        //fstor=FirebaseStorage.getInstance();

        recyclerView=findViewById(R.id.recycl);
       // recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /*list=new ArrayList<product_data>();
        adp=new product_adapter(getApplicationContext(),list);
        recyclerView.setAdapter(adp);*/

       // db= getInstance();
       // Query query =db.getReference().child("product_all_data");

        FirebaseRecyclerOptions<product_data> options =
                new FirebaseRecyclerOptions.Builder<product_data>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("product_all_data"), product_data.class)
                        .build();

        adpter=new product_adapter(options);
        recyclerView.setAdapter(adpter);

    }
    @Override
    protected void onStart(){
        super.onStart();
        adpter.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        adpter.stopListening();
    }
}