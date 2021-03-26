package com.example.olegie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
    final ArrayList<Data_model> data_models;
    final Context context;

    public MyRecyclerViewAdapter(ArrayList<Data_model> data_models, Context context){
        this.context = context;
        this.data_models = data_models;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.stateName.setText(data_models.get(position).getStateName());
        holder.laborForce.setText(Double.toString(data_models.get(position).getTotalEmployed()));
        holder.totEmployed.setText(Double.toString(data_models.get(position).getTotalEmployed()));
        holder.totUnemployed.setText(Double.toString(data_models.get(position).getTotalUnemployed()));

    }

    @Override
    public int getItemCount() {
        return data_models.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

        }
        TextView stateName = itemView.findViewById(R.id.stateName);

            TextView laborForce =  itemView.findViewById(R.id.labor_force);
           TextView totEmployed =  itemView.findViewById(R.id.tot_employed);
           TextView totUnemployed =  itemView.findViewById(R.id.tot_unemployed);
    }
}
