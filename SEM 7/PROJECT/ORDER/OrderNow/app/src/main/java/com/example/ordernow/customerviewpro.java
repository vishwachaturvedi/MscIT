package com.example.ordernow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class customerviewpro extends AppCompatActivity {
    RecyclerView recyclerView;
    cu_view_adapter adpter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerviewpro);
        recyclerView=findViewById(R.id.recycl);
        // recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<cu_view> options =
                new FirebaseRecyclerOptions.Builder<cu_view>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("product_all_data"), cu_view.class)
                        .build();

        adpter=new cu_view_adapter(options);
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