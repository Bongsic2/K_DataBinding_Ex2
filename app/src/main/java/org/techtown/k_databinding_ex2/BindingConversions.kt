package org.techtown.k_databinding_ex2

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingConversions {


    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(imageView: ImageView, url: String) {

        Glide.with(imageView.context).load(url)
            .error(R.drawable.pg)
            .into(imageView)
    }

}