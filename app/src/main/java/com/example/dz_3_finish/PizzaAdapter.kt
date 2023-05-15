package com.example.dz_3_finish

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dz_3_finish.databinding.ItemBurgerPizzaBinding

class PizzaAdapter(private var arrayList: ArrayList<Pizza>,
                   val onClick: (Pizza) -> Unit):
    RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        return PizzaViewHolder(ItemBurgerPizzaBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
        holder.onBind(arrayList[position])
        holder.itemView.setOnClickListener{
              onClick(arrayList[position])
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class PizzaViewHolder(private val binding: ItemBurgerPizzaBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(pizza: Pizza){
            binding.textName.text = pizza.name
            binding.textTime.text = pizza.time
            binding.textCountry.text = pizza.country
            binding.textEstimation.text = pizza.estimation
            binding.freeClub.text = pizza.freeClub
            binding.mealName.text = pizza.mealName
            binding.textKm.text = pizza.km
            binding.minimum.text = pizza.minimum
            Glide.with(binding.image).load(pizza.image).into(binding.image)
        }
    }
}