package com.example.asus.myapplication;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by ASUS on 2017/2/20.
 */
public class SpacesItemDecoration extends ItemDecoration {
    private int space;
    public SpacesItemDecoration(int space){
        this.space = space;
    }
    public void getIItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state){
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;
        if(parent.getChildAdapterPosition(view)==0){
            outRect.top = space;
        }
    }
}
