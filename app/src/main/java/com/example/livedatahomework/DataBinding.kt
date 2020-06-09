package com.example.livedatahomework

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("visibility")
fun View.setVisibility(visible: Boolean){
    visibility = if(visible)
        View.VISIBLE
    else
        View.GONE
}