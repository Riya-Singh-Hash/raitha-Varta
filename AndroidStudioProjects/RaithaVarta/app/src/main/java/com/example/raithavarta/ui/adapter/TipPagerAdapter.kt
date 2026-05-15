package com.example.raithavarta.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.raithavarta.R
import com.example.raithavarta.data.local.TipEntity

class TipPagerAdapter(
    private val tips: List<TipEntity>
) : RecyclerView.Adapter<TipPagerAdapter.TipViewHolder>() {

    inner class TipViewHolder(view: View)
        : RecyclerView.ViewHolder(view) {

        val image = view.findViewById<ImageView>(R.id.imageTip)

        val title = view.findViewById<TextView>(R.id.textTitle)

        val description = view.findViewById<TextView>(R.id.textDescription)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TipViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)

        return TipViewHolder(view)
    }

    override fun getItemCount(): Int {

        return tips.size
    }

    override fun onBindViewHolder(
        holder: TipViewHolder,
        position: Int
    ) {

        val tip = tips[position]

        holder.title.text = tip.title

        holder.description.text = tip.description

        Glide.with(holder.itemView.context)
            .load(tip.imageUrl)
            .into(holder.image)
    }
}