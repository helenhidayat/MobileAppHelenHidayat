package com.example.midprojecthelenhidayat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;







    public class HomePage_Adapter extends RecyclerView.Adapter<HomePage_Adapter.HomePageViewHolder> {

        private ArrayList<HomePage_Data> listHomePage;

        public void setListMovie(ArrayList<HomePage_Data> listMovie) {
            this.listHomePage = listMovie;
        }

        @NonNull
        @Override
        public HomePageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cars, parent, false);
            return new HomePageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull HomePageViewHolder holder, int position) {
            HomePage_Data homepage = listHomePage.get(position);
            Glide.with(holder.itemView.getContext())
                    .load(homepage.getImage())
                    .into(holder.image);
            holder.name.setText(homepage.getName());
            holder.desc.setText(homepage.getDesc());
        }

        @Override
        public int getItemCount() {
            return listHomePage.size();
        }

        public class HomePageViewHolder extends RecyclerView.ViewHolder {

            ImageView image;
            TextView name, desc;

            public HomePageViewHolder(@NonNull View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.movie_name);
                desc = itemView.findViewById(R.id.movie_desc);
                image = itemView.findViewById(R.id.movie_image);
            }
        }

    }


