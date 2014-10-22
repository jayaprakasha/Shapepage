package com.example.shapepage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class SuperImageView extends ImageView{

	public SuperImageView(Context context) {
		super(context);
	}

	public SuperImageView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SuperImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth()); //Snap to width
    }

}
