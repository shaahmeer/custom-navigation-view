package com.example.navigationview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder>{

    public myadapter(ArrayList<model> model) {
        this.model = model;
    }

    ArrayList<model> model;

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
         // holder.imageView.setImageResource(model.get(position).getImage());
          holder.textView.setText(model.get(position).getHeader());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
          TextView textView;
          ImageView imageView;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.text);
            imageView=itemView.findViewById(R.id.image);


        }
    }
}
