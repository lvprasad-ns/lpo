package com.example.prasadtumma.lpo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by prasad.tumma on 01-02-2016.
 */
public class MyLayout extends LinearLayout {
    public MyLayout(Context context) {
        super(context);
        initialize(context);

    }
    public MyLayout(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        initialize(context);
    }
    private void initialize(Context context){
        inflate(context,R.layout.my_layout,this);
    }
}
