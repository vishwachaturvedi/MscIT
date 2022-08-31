package com.example.ordernow;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.dialogplus.DialogPlus;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

import static com.example.ordernow.R.id.c_price;
import static com.example.ordernow.R.id.cp_name;
import static com.example.ordernow.R.id.up_cate;
import static com.example.ordernow.R.id.up_stocke;
import static com.example.ordernow.R.id.update_c;

public class update_pro_adapter extends FirebaseRecyclerAdapter<update_product,update_pro_adapter.ViewHolder> {

    private Context context;
    public update_pro_adapter(@NonNull FirebaseRecyclerOptions<update_product> options,Context context) {
        super(options);
        this.context=context;
    }




    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull update_product model) {
        holder.tvname.setText(model.getProductName());
        holder.tvpric.setText(model.getProductPrice());
        holder.tvstok.setText(model.getProductStock());
        holder.tvcat.setText(model.getProductCategory());

        holder.idelet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase.getInstance().getReference().child("product_all_data").child(getRef(position).getKey()).removeValue().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(context, "Delete Successfully..", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogPlus dialog = DialogPlus.newDialog(context)
                        .setGravity(Gravity.CENTER)
                        .setMargin(50,0,50,0)
                       .setContentHolder(new com.orhanobut.dialogplus.ViewHolder(R.layout.content))
                        .setExpanded(true)
                        .create();

                View view =(LinearLayout) dialog.getHolderView();
                EditText name=view.findViewById(cp_name);
                EditText price=view.findViewById(c_price);
                EditText stock=view.findViewById(up_stocke);
                EditText cat=view.findViewById(up_cate);
                Button btnup=view.findViewById(update_c);

               name.setText(model.getProductName());
                price.setText(model.getProductPrice());
                stock.setText(model.getProductStock());
                cat.setText(model.getProductCategory());

               btnup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Map<String,Object> map=new HashMap<>();
                        map.put("ProductName",name.getText().toString());
                        map.put("ProductPrice",price.getText().toString());
                        map.put("ProductStock",stock.getText().toString());
                        map.put("ProductCategory",cat.getText().toString());
                        FirebaseDatabase.getInstance().getReference().child("product_all_data").child(getRef(position).getKey()).updateChildren(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                dialog.dismiss();
                            }
                        });
                    }
                });

               dialog.show();
            }
        });
        String imgUri=model.getImage();
        Picasso.get().load(imgUri).into(holder.imadd);

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.update_record, parent, false);

        return new update_pro_adapter.ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imadd, btn,idelet;
        TextView tvname,tvpric,tvstok,tvcat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvname=itemView.findViewById(R.id.up_name);
            tvpric=itemView.findViewById(R.id.up_price);
            tvstok=itemView.findViewById(R.id.up_stock);
            tvcat=itemView.findViewById(R.id.up_cat);
            imadd=itemView.findViewById(R.id.img);
            btn=itemView.findViewById(R.id.up_edit);
            idelet=itemView.findViewById(R.id.delet);
        }


    }
}
