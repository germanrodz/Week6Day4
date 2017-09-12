package com.blovvme.week6day4;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Blovvme on 9/12/17.
 */

public class CustomViewButton extends android.support.v7.widget.AppCompatButton {

    private int parentId;
    private int cellId;
    public CustomViewButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public void setParentId(int parentId){
        this.parentId=parentId;
    }

    public void setCellId(int cellId){
        this.cellId=cellId;
    }

    public int getParentId(){
        return this.parentId;
    }

    public int getCellId(){
        return this.cellId;
    }
}
