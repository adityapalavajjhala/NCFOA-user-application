package com.example.ncfoa_user_application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter  extends FirebaseRecyclerAdapter<menumodel,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<menumodel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull menumodel menumodel) {

        holder.dishname.setText(menumodel.getDname());
        holder.desc.setText(menumodel.getDesc());
        holder.price.setText(menumodel.getPrice());
        Glide.with(holder.img.getContext()).load(menumodel.getPurl()).into(holder.img);

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img;
        TextView dishname,desc,price;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = (CircleImageView) itemView.findViewById(R.id.img1);
            dishname = (TextView)itemView.findViewById(R.id.dishtext);
            desc = (TextView)itemView.findViewById(R.id.desctext);
            price = (TextView)itemView.findViewById(R.id.pricetext);
        }
    }
}
