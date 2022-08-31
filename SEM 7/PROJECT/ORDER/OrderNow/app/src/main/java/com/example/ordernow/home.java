package com.example.ordernow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.ordernow.R;
import com.example.ordernow.login;
import com.example.ordernow.viewhome;
import com.example.ordernow.viewhome_adapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class home extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;
    RecyclerView recyclerView;
    LinearLayoutManager manager;
    viewhome_adapter adpter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout=findViewById(R.id.drlayout);
        navigationView=findViewById(R.id.navi);
        toolbar=findViewById(R.id.toolbar);

        recyclerView=findViewById(R.id.recycl);
        // recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<viewhome> options =
                new FirebaseRecyclerOptions.Builder<viewhome>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("product_all_data"), viewhome.class)
                        .build();

        manager=new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.HORIZONTAL);
        adpter=new viewhome_adapter(options);
        recyclerView.setAdapter(adpter);
        recyclerView.setLayoutManager(manager);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle;
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(home.this,"home",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.pro:
                        Toast.makeText(home.this,"home",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.g_menu:
                        break;
                    case R.id.offe:
                        break;
                    case R.id.cart:
                        break;
                    case R.id.log:
                        FirebaseAuth.getInstance().signOut();
                        startActivity(new Intent(home.this, login.class));
                        finish();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });
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

    public void hom(View view) {
        startActivity(new Intent(getApplicationContext(),customerviewpro.class));
        //finish();
    }

    public void vege(View view) {
    }

    public void pro(View view) {
        startActivity(new Intent(getApplicationContext(),customer_pro.class));
        //finish();
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        SharedPreferences sp=getSharedPreferences("orderNow",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();
        editor.clear();
        editor.commit();
        startActivity(new Intent(home.this,login.class));
        finish();
    }
    @Override
    public void onBackPressed() {


        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent a = new Intent(Intent.ACTION_MAIN);
                        a.addCategory(Intent.CATEGORY_HOME);
                        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(a);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog=builder.create();
        alertDialog.show();
    }
}