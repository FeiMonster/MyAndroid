package com.example.asus.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<User> userList= new ArrayList<User>();
    private MyAdapter mAdapater;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDogList();
    }

    private void initDogList() {
        userList.add(new User("大老婆",R.drawable.user1));
        userList.add(new User("二老婆",R.drawable.user2));
        userList.add(new User("三老婆",R.drawable.user3));
        userList.add(new User("四老婆",R.drawable.user4));
        userList.add(new User("五老婆",R.drawable.user5));
        userList.add(new User("六老婆",R.drawable.user6));
        userList.add(new User("七老婆",R.drawable.user7));
        userList.add(new User("八老婆",R.drawable.user8));
        userList.add(new User("九老婆",R.drawable.user9));
        userList.add(new User("十老婆",R.drawable.user10));
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //横向
        /*LinearLayoutManager manger = new LinearLayoutManager(this);
        manger.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(manger);*/
        //空格
        /*StaggeredGridLayoutManager manger = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manger);*/
        //瀑布流
        StaggeredGridLayoutManager manger = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manger);
        mAdapater = new MyAdapter(userList);
        mRecyclerView.setAdapter(mAdapater);
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        mRecyclerView.addItemDecoration(decoration);
        
    }
}
