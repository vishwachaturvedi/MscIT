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

public class viewhome_adapter extends FirebaseRecyclerAdapter<viewhome,viewhome_adapter.ViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public viewhome_adapter(@NonNull FirebaseRecyclerOptions<viewhome> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull viewhome model) {
        holder.tvname.setText(model.getProductName());
        holder.tvpric.setText(holder.tvpric.getText()+model.getProductPrice());
        String imgUri=model.getImage();
        Picasso.get().load(imgUri).into(holder.imadd);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewinhome, parent, false);

        return new viewhome_adapter.ViewHolder(view);

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imadd;
        TextView tvname,tvpric;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname=itemView.findViewById(R.id.name);
            tvpric=itemView.findViewById(R.id.pr);
            imadd=itemView.findViewById(R.id.img1);
        }
    }
}
