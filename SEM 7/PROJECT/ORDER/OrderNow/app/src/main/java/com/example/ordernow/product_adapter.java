package com.example.ordernow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

public class product_adapter extends FirebaseRecyclerAdapter<product_data,product_adapter.ViewHolder> {



    public product_adapter(@NonNull FirebaseRecyclerOptions<product_data> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull product_data model) {
        holder.tvname.setText(model.getProductName());
        holder.tvpric.setText(model.getProductPrice());
        holder.tvstok.setText(model.getProductStock());
        String imgUri=model.getImage();
        Picasso.get().load(imgUri).into(holder.imadd);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.desgin_allproduct, parent, false);

        return new ViewHolder(view);

    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        ImageView imadd;
        TextView tvname,tvpric,tvstok;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvname=itemView.findViewById(R.id.up_name);
            tvpric=itemView.findViewById(R.id.up_price);
            tvstok=itemView.findViewById(R.id.up_stock);
            imadd=itemView.findViewById(R.id.img);
        }
    }


}
