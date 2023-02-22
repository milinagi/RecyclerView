package com.example.recyclerview.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.SuperHero
import com.example.recyclerview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHero: SuperHero, onClickListener:(SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHero.name
        binding.tvSuperHeroRealName.text = superHero.realName
        binding.tvPublisher.text = superHero.publisher
        Glide.with(binding.ivSuperHero.context).load(superHero.image).into(binding.ivSuperHero)

        itemView.setOnClickListener { onClickListener(superHero) }
    }
}