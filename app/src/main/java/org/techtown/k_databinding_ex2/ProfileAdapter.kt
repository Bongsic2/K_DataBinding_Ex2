package org.techtown.k_databinding_ex2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.techtown.k_databinding_ex2.databinding.ListItemBinding

class ProfileAdapter(private val context: Context) :
    RecyclerView.Adapter<ProfileAdapter.ProfileVH>() {

    var data = listOf<ProfileData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileVH {
        val binding = ListItemBinding.inflate(
            LayoutInflater.from(context), parent, false
        )

        return ProfileVH(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ProfileVH, position: Int) {
        holder.onBind(data[position])
    }

    class ProfileVH(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: ProfileData) {
            binding.user = data
        }

    }
}