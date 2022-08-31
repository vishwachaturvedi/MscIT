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

public class cu_view_adapter extends FirebaseRecyclerAdapter<cu_view,cu_view_adapter.ViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public cu_view_adapter(@NonNull FirebaseRecyclerOptions<cu_view> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull cu_view model) {
        holder.tvname.setText(model.getProductName());
        holder.tvpric.setText(model.getProductPrice());

        String imgUri=model.getImage();
        Picasso.get().load(imgUri).into(holder.imadd);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.desgin_allproduct, parent, false);

        return new cu_view_adapter.ViewHolder(view);

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imadd;
        TextView tvname,tvpric,tvstok;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname=itemView.findViewById(R.id.up_name);
            tvpric=itemView.findViewById(R.id.up_price);

            imadd=itemView.findViewById(R.id.img);
        }
    }
}
