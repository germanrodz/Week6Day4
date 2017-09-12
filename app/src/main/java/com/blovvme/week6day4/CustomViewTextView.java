package com.blovvme.week6day4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Blovvme on 9/12/17.
 */

public class CustomViewTextView extends android.support.v7.widget.AppCompatTextView {

    public CustomViewTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomViewTextView);
        String fontName = a.getString(R.styleable.CustomViewTextView_fontName);
        if (fontName!=null) {
            Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), "fonts/"+fontName);
            setTypeface(myTypeface);
        }
        a.recycle();
    }


}
