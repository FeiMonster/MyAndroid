package com.example.asus.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 2017/2/20.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private  List<User> userList;
        public MyAdapter(List<User> userList){
            this.userList = userList;
        }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView userImg;
        TextView userName;
        public ViewHolder(View itemView) {
            super(itemView);
            userImg = (ImageView) itemView.findViewById(R.id.userImg);
            userName = (TextView) itemView.findViewById(R.id.userName);

        }
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
    User user = userList.get(position);
        holder.userImg.setImageResource(user.imgId);
        holder.userName.setText(user.userName);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
