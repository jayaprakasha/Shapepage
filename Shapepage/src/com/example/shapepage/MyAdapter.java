package com.example.shapepage;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

@SuppressLint("ViewTag")
class MyAdapter extends BaseAdapter
{
    List<Item> items = new ArrayList<Item>();
    private LayoutInflater inflater;
    private Context mContext;
    
    
    public MyAdapter(Context context)
    {

    	 mContext = context;
    	
    	/*inflater = LayoutInflater.from(context);

        items.add(new Item("SQUARE", R.drawable.square));
        items.add(new Item("STAR", R.drawable.star));
        items.add(new Item("DIAMOND", R.drawable.diamond));
        items.add(new Item("CIRCLE", R.drawable.circle));
        items.add(new Item("CUBE", R.drawable.cube));
        items.add(new Item("LINE", R.drawable.line));
        items.add(new Item("OVAL", R.drawable.oval));
        items.add(new Item("RECTANGLE", R.drawable.rectangle));
        items.add(new Item("RHOMBUS", R.drawable.rhombus));
        items.add(new Item("HEXAGON", R.drawable.hexagon));
*/    }

    @Override
    public int getCount() {
        /*return items.size();*/
    	 return mThumbIds.length;
    	
    }

    @Override
    public Object getItem(int i)
    {
        /*return items.get(i);*/
        return null;
    }

    @Override
    public long getItemId(int i)
    {
        /*return items.get(i).drawableId;*/
    	 return 0;
    }


	
	@Override
    public View getView(int position/*i*/, View convertView/*view*/, ViewGroup parent/*viewGroup*/)
    {
		ImageView imageView;
	      if (convertView == null) {
	      imageView = new ImageView(mContext);
	      //imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
	      //imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
	      //imageView.setPadding(8, 8, 8, 8);
	      } else {
	      imageView = (ImageView) convertView;
	      }

	      imageView.setImageResource(mThumbIds[position]);
	      return imageView;
		
		
		/* View v = view;
        ImageView picture;
        final TextView name;
        if(v == null){
           v = inflater.inflate(R.layout.gridview_item, viewGroup, false);
           v.setTag(R.id.picture, v.findViewById(R.id.picture));
           v.setTag(R.id.text, v.findViewById(R.id.text));
        }
        picture = (ImageView)v.getTag(R.id.picture);
        name = (TextView)v.getTag(R.id.text);
        Item item = (Item)getItem(i);
        picture.setImageResource(item.drawableId);
        name.setText(item.name);
        return v;
 */   
		
		/*ImageView imageView;
	      if (convertView == null) {
	      imageView = new ImageView(mContext);
	     // convertView = inflater.inflate(R.layout.gridview_item, parent, false);
	      convertView.setTag(R.id.picture, convertView.findViewById(R.id.picture));
          convertView.setTag(R.id.text, convertView.findViewById(R.id.text));
//	      imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//      imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//	      imageView.setPadding(8, 8, 8, 8);
	      } else {
	      imageView = (ImageView)convertView.getTag(R.id.picture);
	      TextView name = (TextView)convertView.getTag(R.id.text);
	      }

	      imageView.setImageResource(mThumbIds[position]);
	      return imageView;
    
    
    */
    }

    private class Item
    {
        final String name;
        final int drawableId;

        Item(String name, int drawableId)
        {
            this.name = name;
            this.drawableId = drawableId;
        }
    }

    
    public Integer[] mThumbIds = {
    		
    		R.drawable.diamond,
    		R.drawable.star,
            R.drawable.square,
            R.drawable.circle,R.drawable.cube,R.drawable.line,R.drawable.oval,R.drawable.rectangle, 
            R.drawable.rhombus, R.drawable.hexagon
    		
    };    
	
}
