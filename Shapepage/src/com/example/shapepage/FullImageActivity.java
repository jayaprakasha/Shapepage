package com.example.shapepage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class FullImageActivity extends Activity {

Button download, setas;
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.full_image);

    // Get intent data
    Intent i = getIntent();

    // Selected image id
    int position = i.getExtras().getInt("id");
    MyAdapter imageAdapter = new MyAdapter(this);

    ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
    imageView.setImageResource(imageAdapter.mThumbIds[position]);
	
	
	
	
	
	
	
}

}