package com.ford.testfpp;

import android.widget.ImageView;

public class BindingAdapter {

    @android.databinding.BindingAdapter("customCompat")
    public static void bindSrcCompat(ImageView img, int resource) {
        if (resource != 0) {
            img.setImageResource(resource);
        }
    }


}
