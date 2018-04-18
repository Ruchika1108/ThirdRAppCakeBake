package com.example.vaishali.thirdrappcakebake;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Vaishali on 14-04-2018.
 */

public class ImageAdapterMain2 extends BaseAdapter {
    private Context mContext;

    public ImageAdapterMain2(Context c){
        mContext=c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.del1, R.drawable.del2,
            R.drawable.del3, R.drawable.del4,
            R.drawable.del5, R.drawable.del6,
    };
}
