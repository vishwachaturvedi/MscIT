package com.example.ordernow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class vegetable_admin extends AppCompatActivity {
    RecyclerView rec;
    update_pro_adapter adp;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable_admin);
        rec=findViewById(R.id.rec);
        // recyclerView.setHasFixedSize(true);
        rec.setLayoutManager(new LinearLayoutManager(this));
        searchView=findViewById(R.id.app_bar_search);

        FirebaseRecyclerOptions<update_product> options =
                new FirebaseRecyclerOptions.Builder<update_product>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("product_all_data"), update_product.class)
                        .build();

        adp=new update_pro_adapter(options,this);
        rec.setAdapter(adp);

    }
    @Override
    protected void onStart(){
        super.onStart();
        adp.startListening();
    }
    @Override
    protected void onStop() {
        super.onStop();
        adp.stopListening();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        MenuItem menuItem=menu.findItem(R.id.app_bar_search);
        SearchView searchView= (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                SearchData(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    private void SearchData(String query) {
        FirebaseRecyclerOptions<update_product> options =
                new FirebaseRecyclerOptions.Builder<update_product>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("product_all_data").orderByChild("ProductName").startAt(query).endAt(query+"\ufaff"), update_product.class)
                        .build();
        adp=new update_pro_adapter(options,this);
        rec.setAdapter(adp);
        adp.startListening();
    }
}