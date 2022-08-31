package com.example.ordernow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;

public class myadapter extends FirestoreRecyclerAdapter<user,myadapter.myHolder> {



    public myadapter(@NonNull FirestoreRecyclerOptions<user> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myHolder holder, int position, @NonNull user model) {
        holder.textname.setText(model.getFname());
        holder.txtmail.setText(model.getEmail());
        holder.txtcont.setText(String.valueOf(model.getPhone()));
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new myHolder(v);
    }

    class myHolder extends RecyclerView.ViewHolder{
        TextView textname,txtmail,txtcont;
        public myHolder(View view){
            super(view);
            textname=view.findViewById(R.id.tvtxt);
            txtmail=view.findViewById(R.id.txtemail);
            txtcont=view.findViewById(R.id.txtcon);
        }

    }
    /*public myadapter(Context context, ArrayList<user> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        user user=list.get(position);
        holder.fname.setText(user.getName());
        holder.gmail.setText(user.getEmail());
        holder.cont.setText(user.getCon());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView fname,gmail,cont;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        fname=itemView.findViewById(R.id.tvtxt);
        gmail=itemView.findViewById(R.id.txtemail);
        cont=itemView.findViewById(R.id.txtcon);
    }
}*/
}
