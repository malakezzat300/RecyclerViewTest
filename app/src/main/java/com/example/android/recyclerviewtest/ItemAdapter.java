package com.example.android.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder> {

    private List<AndroidItem> androidItemList;
    private Context context;

    public ItemAdapter(List<AndroidItem> androidItemList, Context context) {
        this.androidItemList = androidItemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(MainActivity.isLinear()) {
            View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
            ItemHolder holder = new ItemHolder(row);
            return holder;
        }
        else{
            View grid = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridwithcardview, parent, false);
            ItemHolder holder = new ItemHolder(grid);
            return holder;
        }

    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        AndroidItem item = androidItemList.get(position);
        holder.androidName.setText(item.getName());
        holder.androidVersion.setText(item.getVersion());
        holder.androidImage.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return androidItemList.size();
    }


    public class ItemHolder extends RecyclerView.ViewHolder {
        TextView androidName , androidVersion;
        ImageView androidImage;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            androidName =  itemView.findViewById(R.id.android_name);
            androidVersion = itemView.findViewById(R.id.android_version);
            androidImage = itemView.findViewById(R.id.android_image);



        }
    }
}
