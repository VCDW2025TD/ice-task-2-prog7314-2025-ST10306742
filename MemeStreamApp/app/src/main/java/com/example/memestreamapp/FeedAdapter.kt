package com.example.memestreamapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.memestreamapp.data.model.Meme
import com.example.memestreamapp.databinding.ItemMemeBinding

class FeedAdapter(private val memes: List<Meme>) :
    RecyclerView.Adapter<FeedAdapter.MemeViewHolder>() {

    inner class MemeViewHolder(val binding: ItemMemeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemeViewHolder {
        val binding = ItemMemeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MemeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MemeViewHolder, position: Int) {
        val meme = memes[position]
        holder.binding.captionText.text = meme.caption
        Glide.with(holder.binding.imageView.context)
            .load(meme.imageUrl)
            .into(holder.binding.imageView)
    }

    override fun getItemCount(): Int = memes.size
}
