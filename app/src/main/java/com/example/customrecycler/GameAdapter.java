package com.example.customrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

public  class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameHolder> {

    Context context;
    List<GameModel> gameModelList=new ArrayList<>();
    OnItemClick onItemClick;
    public GameAdapter(Context context, List<GameModel> gameModelList, MainActivity mainActivity){
        this.context=context;
        this.gameModelList=gameModelList;
    }
    public GameAdapter(Context context,List<GameModel> gameModelList){
        this.context=context;
        this.gameModelList=gameModelList;
        this.onItemClick=onItemClick;

    }


    @NonNull
    @Override
    public GameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root=LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical,parent,false);
        return new GameHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull GameHolder holder, int position) {
        try {
            holder.name.setText(gameModelList.get(position).getName());
            holder.country.setText(gameModelList.get(position).getCountry());
            holder.people.setText(gameModelList.get(position).getPeople());
            holder.image.setImageResource(gameModelList.get(position).getImage());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return gameModelList.size();
    }

    public class GameHolder extends RecyclerView.ViewHolder {
        TextView name,country,people;
        ImageView image;
        public GameHolder(@NonNull View itemView) {
            super(itemView);
            try {
                name=itemView.findViewById(R.id.gamename_txt);
                country=itemView.findViewById(R.id.countryname_txt);
                people=itemView.findViewById(R.id.peple_txt);
                image=itemView.findViewById(R.id.game_image);

                /*itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onItemClick.onClick(getAdapterPosition());
                    }
                });*/
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
