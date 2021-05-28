package com.example.leaderboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    LayoutInflater inflater;
    List<Leader> leaders;

    public Adapter(Context ctx, List<Leader> leaders){
        this.inflater = LayoutInflater.from(ctx);
        this.leaders = leaders;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fragment1_layout,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //bind the data
        holder.leaderName.setText(leaders.get(position).getName());
        holder.leaderCountry.setText(leaders.get(position).getCountry());
        holder.leaderHours.setText(leaders.get(position).getHours());
        //Picasso.get().load(leaders.get(position).getBadgeUrl()).into(holder.leaderbadge);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
            TextView leaderName,leaderCountry,leaderHours;
            ImageView leaderbadge;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            leaderName = itemView.findViewById(R.id.name);
            leaderCountry = itemView.findViewById(R.id.country);
            leaderHours = itemView.findViewById(R.id.hours);
            leaderbadge = itemView.findViewById(R.id.badgeUrl);

        }
    }
}
