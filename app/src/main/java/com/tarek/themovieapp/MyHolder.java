package com.tarek.themovieapp;

import android.view.View;
import android.widget.ImageView;

/**
 * Created by TarEk on 9/23/2016.
 */
class MyHolder {
    ImageView imageView;

    public MyHolder(View v) {
        this.imageView = (ImageView) v.findViewById(R.id.movieImageView);
    }

}
