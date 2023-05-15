package com.example.dz_3_finish.Profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dz_3_finish.databinding.ItemProfilBinding

class BurgerAdapter(private val arrayList: ArrayList<Profile>) : RecyclerView.Adapter<BurgerAdapter.BurgerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurgerViewHolder {
        return BurgerViewHolder(ItemProfilBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: BurgerViewHolder, position: Int) {
        holder.onBind(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class BurgerViewHolder(private val binding: ItemProfilBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(profile: Profile) {
            binding.nameProf.text = profile.name
            Glide.with(binding.imageProf).load(profile.image).into(binding.imageProf)
        }
    }
}